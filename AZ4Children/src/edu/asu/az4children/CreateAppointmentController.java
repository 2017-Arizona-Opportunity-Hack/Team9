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

import edu.asu.az4children.beans.Appointment;
import edu.asu.az4children.dao.UserDAO;

public class CreateAppointmentController  extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int parentId = Integer.valueOf(request.getParameter("parentId"));
		int kidId = Integer.valueOf(request.getParameter("kidId"));
		java.util.Date tempDate1=null;
		java.util.Date tempDate2=null;
		Calendar checkInTime = Calendar.getInstance();
		Calendar checkOutTime = Calendar.getInstance();
		try {
			DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
			tempDate1 = formatter.parse(request.getParameter("checkInTime"));
			tempDate2 = formatter.parse(request.getParameter("checkOutTime"));
			java.sql.Date sql1 = new java.sql.Date(tempDate1.getTime());
			java.sql.Date sql2 = new java.sql.Date(tempDate2.getTime());
			checkInTime.setTime(sql1); 
			checkOutTime.setTime(sql1);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		int numberOfPeopleVisiting = Integer.valueOf(request.getParameter("numberOfPeopleVisiting"));
		//Appointment app = new Appointment(parentId,kidId,checkInTime,checkOutTime,numberOfPeopleVisiting);
		try {
			UserDAO userDAO = new UserDAO();
			//userDAO.addAppointmentDetails(parentId,kidId,checkInTime,checkOutTime,numberOfPeopleVisiting);
			response.sendRedirect("Success");
		} catch (Exception e) {
			e.printStackTrace();}


	}
}
