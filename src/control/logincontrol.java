package control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.dao.StudentDAO;
import model.dao.TeacherDAO;
import model.dao.UserDao;

public class logincontrol extends HttpServlet {

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

//		response.setContentType("text/html");
//		String id=request.getParameter("userName");
//		String password=request.getParameter("password");
//		String code=request.getParameter("code");
//		PrintWriter out = response.getWriter();
//		HttpSession session=request.getSession();
//		if(code.equals("1"))
//		{
//			StudentDAO dao=new StudentDAO();
//			boolean ret=dao.checkLogin(id, password);
//			if(ret){//³É¹¦µÇÂ½
//				
//				session.setAttribute("currentUser", id);
//				out.print(id);
//				response.sendRedirect("/student.jsp");
//			}
//			else{ //µÇÂ½Ê§°Ü
//				response.sendRedirect("/error.jsp");
//			}
//		}
//		else if(code.equals("2")){
//			TeacherDAO dao=new TeacherDAO();
//			boolean ret=dao.checkLogin(id, password);
//			if(ret){//³É¹¦µÇÂ½
//				
//				session.setAttribute("currentUser", id);
//				out.print(id);
//				response.sendRedirect("/teacher.jsp");
//			}
//			else{ //µÇÂ½Ê§°Ü
//				response.sendRedirect("/error.jsp");
//			}
//		}
//		else if(code.equals("3")){
//			UserDao dao=new UserDao();
//			boolean ret=dao.checkLogin(id, password);
//			if(ret){//³É¹¦µÇÂ½
//				
//				session.setAttribute("currentUser", id);
//				out.print(id);
////				response.sendRedirect("/welcome.jsp");
//			}
//			else{ //µÇÂ½Ê§°Ü
//				response.sendRedirect("/error.jsp");
//			}
//		}
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
		String id=request.getParameter("userName");
		String password=request.getParameter("password");
		String code=request.getParameter("code");
		PrintWriter out = response.getWriter();
		HttpSession session=request.getSession();
		if(code.equals("1"))
		{
			StudentDAO dao=new StudentDAO();
			boolean ret=dao.checkLogin(id, password);
			if(ret){//³É¹¦µÇÂ½
				
				session.setAttribute("currentUser", id);
				
				response.sendRedirect("/studentmenu.jsp");
			}
			else{ //µÇÂ½Ê§°Ü
				response.sendRedirect("/error.jsp");
			}
		}
		else if(code.equals("2")){
			TeacherDAO dao=new TeacherDAO();
			boolean ret=dao.checkLogin(id, password);
			if(ret){//³É¹¦µÇÂ½
				
				session.setAttribute("currentUser", id);
				out.print(id);
				response.sendRedirect("/teacher.jsp");
			}
			else{ //µÇÂ½Ê§°Ü
				response.sendRedirect("/error.jsp");
			}
		}
		else if(code.equals("3")){
			UserDao dao=new UserDao();
			boolean ret=dao.checkLogin(id, password);
			if(ret){//³É¹¦µÇÂ½
				
				session.setAttribute("currentUser", id);
				out.print(id);
				response.sendRedirect("/admin.html");
			}
			else{ //µÇÂ½Ê§°Ü
				response.sendRedirect("/error.jsp");
			}
		}
	}

}
