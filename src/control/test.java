package control;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.CourseDAO;
import model.dao.StudentDAO;
import model.vo.Select;
import util.DBManager;

public class test extends HttpServlet {

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
		List<Select> list = new ArrayList<Select>();
		/*
		 * 
		 */
		DBManager db = new DBManager();
		String sql = "select * from sel";
		CourseDAO dao1=new CourseDAO();
		StudentDAO dao2=new StudentDAO();
		ResultSet rs;
		try {
			rs = db.executeQuery(sql);
			while (rs.next()) {
				Select cou = new Select();
				cou.setCid(rs.getString("cid"));
				String c=dao1.seeknamebyid(cou.getCid());
				cou.setCname(c);
				out.print("dsa"+cou.getCname());
				
				cou.setSid(rs.getString("sid"));
				c=dao2.seeknamebyid(rs.getString("sid"));
				cou.setSname(c);
				
				list.add(cou);
			}
			rs.close();
			db.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	for(int i=0;i<list.size();i++)
		out.print("123"+list.get(i).toString());
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
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the POST method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

}
