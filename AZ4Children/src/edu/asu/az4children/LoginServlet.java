package edu.asu.az4children;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import edu.asu.az4children.beans.LoginUser;
import edu.asu.az4children.dao.DbConnection;
import edu.asu.az4children.dao.UserDAO;


/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, java.io.IOException {
		response.setContentType("text/html");  
		request.getRequestDispatcher("LoginPage.jsp").include(request, response);  

		try
		{	UserDAO dao= new UserDAO();
		String inputId=request.getParameter("un");		
		String inputPassword=request.getParameter("pw");
		//dao.fetchPassword(inputId);
		if (dao.fetchPassword(inputId).equals(inputPassword))
		{			
			HttpSession session = request.getSession();	    
			session.setAttribute("userId",inputId); 
			response.sendRedirect("parentandkidAddition.jsp"); //logged-in page      		
		}
		else 
		{
			response.sendRedirect("InvalidLogin.jsp"); //error page 
			request.getRequestDispatcher("LoginPage.jsp").include(request, response); 

		}
		} 


		catch (Throwable theException) 	    
		{
			System.out.println(theException); 
		}
	}
}

