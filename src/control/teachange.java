package control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.dao.TeacherDAO;
import model.vo.Teacher;

public class teachange extends HttpServlet {

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
		response.setCharacterEncoding("gb2312");
		request.setCharacterEncoding("gb2312");
		
		String name=request.getParameter("name");
		HttpSession session=request.getSession();
		String tid=(String) session.getAttribute("currentUser");
		
		String mail=request.getParameter("mail");
		String qq=request.getParameter("qq");
		String tel=request.getParameter("tel");
		TeacherDAO dao=new TeacherDAO();	
		if(dao.change(tid, name, mail, qq, tel))
			response.sendRedirect("/teacher.jsp");
		else
			out.print("fail");
		out.flush();
		out.close();
	}

}
