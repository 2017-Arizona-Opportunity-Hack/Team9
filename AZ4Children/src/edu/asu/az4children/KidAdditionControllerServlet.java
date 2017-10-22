package edu.asu.az4children;

import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import edu.asu.az4children.dao.UserDAO;

public class KidAdditionControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String ParentFirstName = request.getParameter("ParentFirstName");
		String ParentLastName = request.getParameter("ParentLastName");
		String KidFirstName = request.getParameter("KidFirstName");
		String KidLastName = request.getParameter("KidLastName");
		//int parentId = Integer.valueOf(request.getParameter("parentId"));
		String gender = request.getParameter("gender");
		Calendar dob = Calendar.getInstance();
		try {
			DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
			java.util.Date utilDate = formatter.parse(request.getParameter("dob"));
			java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

			dob.setTime((java.sql.Date)sqlDate);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String email  = request.getParameter("email");
		HttpSession session = request.getSession(true);
		try {
			UserDAO userDAO = new UserDAO();			
			userDAO.addParentandKidDetails(ParentFirstName,ParentLastName,email,KidFirstName, KidLastName,gender, dob);
			response.sendRedirect("Success");
		} catch (Exception e) {
			e.printStackTrace();}
	}
}
