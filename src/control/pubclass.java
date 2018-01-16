package control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.dao.CourseDAO;
import model.dao.StudentDAO;
import model.vo.Course;
import model.vo.Student;

public class pubclass extends HttpServlet {

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
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the GET method");
		out.println("  </BODY>");
		out.println("</HTML>");
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
//`cid`, `name`, `tid`, `time`, `content`, `req`, `test`
		response.setContentType("text/html");
		response.setCharacterEncoding("gb2312");
		request.setCharacterEncoding("gb2312");
		Random r1 = new Random();
		int i=r1.nextInt(1000000);
		String cid="1"+i;
		String name=request.getParameter("name");
		
		String time=request.getParameter("time");
		String content=request.getParameter("content");
		String req=request.getParameter("req");
		String test=request.getParameter("test");
		HttpSession session=request.getSession();
		String tid=(String) session.getAttribute("currentUser");
		Course cou=new Course(cid, name, tid, time, content, req, test, "");
		PrintWriter out = response.getWriter();
		CourseDAO dao= new CourseDAO();
		
	
		
		if(dao.insertCourse(cou))
			response.sendRedirect("/teachangsuccess.jsp");
		else
			out.print("fail");
		
		out.flush();
		out.close();
	}

}
