package control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.dao.CourseDAO;
import model.dao.StudentDAO;
import model.dao.TeacherDAO;
import model.vo.Course;


public class queryteacou extends HttpServlet {

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

		String tid=request.getParameter("teacher");
		if(tid.equals("-1"))
		{
			HttpSession session=request.getSession();
			tid=(String) session.getAttribute("currentUser");
		}
		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();
		CourseDAO dao=new CourseDAO();
		List<Course> list=dao.querybytid(tid);
		
		String outStr="";
		/*
		 * 
		 */
		for(Course major:list){
			String s=major.getCid()+","+major.getName();
			outStr+=s+"|";	
		}
		
		outStr=outStr.substring(0, outStr.length()-1);
		System.out.println(outStr);
		
		out.println(outStr);
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
