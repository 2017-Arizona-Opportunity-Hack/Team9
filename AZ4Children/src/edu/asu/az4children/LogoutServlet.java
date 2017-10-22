package edu.asu.az4children;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LogoutServlet
 */
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		   response.setContentType("text/html");
           request.getRequestDispatcher("parentandkidAddition.jsp").include(request, response);  
             
           HttpSession session=request.getSession();  
           session.removeAttribute("userId");
           session.invalidate();  
           response.sendRedirect("LogoutPage.jsp");           
          
	}
}
