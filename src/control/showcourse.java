package control;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.DBManager;
import model.dao.CourseDAO;
import model.vo.Course;

import com.google.gson.Gson;

public class showcourse extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		response.setCharacterEncoding("gb2312");
		request.setCharacterEncoding("gb2312");
		PrintWriter out = response.getWriter();
		CourseDAO dao=new CourseDAO();
		
		Gson gson = new Gson();
		List<Course> list = dao.queryAll();
		DBManager db = new DBManager();
		String sql = "select * from course";
		int i=0;
		ResultSet rs;
		try {
			rs = db.executeQuery(sql);
			
			while (rs.next()) {
				
				Course cou = new Course();
				i++;
				cou.setCid(rs.getString("cid"));
				cou.setName(rs.getString("name"));
				cou.setTid(rs.getString("tid"));
				cou.setTime(rs.getString("time"));
				cou.setContent(rs.getString("content"));
				cou.setReq(rs.getString("req"));
				cou.setTest(rs.getString("test"));
				cou.setTag(rs.getString("tag"));
				out.print(i);
				out.print(rs.getString("name"));
				list.add(cou);
			}
			rs.close();
			db.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.print(i);

		String json = gson.toJson(list);
		
		out.println(json);
		out.flush();
		out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		response.setCharacterEncoding("gb2312");
		request.setCharacterEncoding("gb2312");
		PrintWriter out = response.getWriter();
		String page=request.getParameter("page");
		String rows=request.getParameter("rows");
		
		int p = Integer.parseInt(page);
		p--;
		int r = Integer.parseInt(rows);
		CourseDAO dao=new CourseDAO();
		
		Gson gson = new Gson();
		List<Course> list = dao.queryAll();
		
		int num=list.size();
		int offset;
		if(p*r+r>num)
			offset=num;
		else
			offset=p*r+r;
		
		String json = gson.toJson(list.subList(p*r, offset));
		 json = "{\"total\":" + num + ",\"rows\":" + json
				+ "}";
		out.println(json);
		out.flush();
		out.close();
	}

}
