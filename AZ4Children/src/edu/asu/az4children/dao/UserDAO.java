package edu.asu.az4children.dao;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import edu.asu.az4children.beans.Appointment;
import edu.asu.az4children.beans.Kid;
import edu.asu.az4children.beans.LoginUser;
import edu.asu.az4children.beans.Parent;
import edu.asu.az4children.beans.User;

public class UserDAO {
	public void addUserDetails(String userName, String password, String email,
			String phone, String city,String role) {
		try {
			System.out.println("add details");
			Session session=DbConnection.getConnection();
			Transaction transaction = session.beginTransaction();
			User user = new User();
			user.setUserName(userName);
			user.setPassword1(password);
			user.setEmail(email);
			user.setCity(city);
			user.setPhone(phone);
			user.setRole(role);
			session.save(user);
			transaction.commit();
			DbConnection.closeConnection(session);
			System.out.println("\n\n Details Added \n");
		} catch (HibernateException e) {
			System.out.println(e.getMessage());
			System.out.println("error");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public String fetchPassword(String Username){
		try {
			Session session=DbConnection.getConnection();
			Query query=session.createQuery("FROM LoginUser");  
			List<LoginUser> list=query.list(); 
			Iterator<LoginUser> itr=list.iterator();
			while(itr.hasNext()){  
				LoginUser emp=itr.next();
				if(emp!=null){				
					if(Username.equals(emp.getUser_name())){
						return emp.getUser_password();
					}
				}
			}  
			DbConnection.closeConnection(session);
		} catch (HibernateException e) {
			System.out.println(e.getMessage());
			System.out.println("error");
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void addParentandKidDetails(String pfirstName, String plastName, String email,String firstName, String lastName, 
			String gender, Calendar dateOfBirth) {
		try {
			Session session=DbConnection.getConnection();
			Transaction transaction = session.beginTransaction();
			Parent parent=new Parent();
			parent.setPfirstName(pfirstName);
			parent.setPlastName(plastName);
			parent.setEmailId(email);
			Kid kid2=new Kid();
			kid2.setFirstName(firstName);
			kid2.setLastName(lastName);
			kid2.setGender(gender);
			kid2.setDateOfBirth(dateOfBirth);
			parent.setKid(kid2);
			kid2.setParent(parent);
			session.save(parent);
			session.save(kid2);
			transaction.commit();
			DbConnection.closeConnection(session);
		}
		catch (HibernateException e) {
			System.out.println(e.getMessage());
			System.out.println("error");
		}
		catch(Exception e) {
			e.printStackTrace();
		}		
	}

	public void addAppointmentDetails(Calendar checkInTime,Calendar checkOutTime,int numberOfPeopleVisiting) {
		try {
			Session session=DbConnection.getConnection();
			Transaction transaction = session.beginTransaction();
			Appointment ap = new Appointment() ;
			ap.setCheckInTime(checkInTime);
			ap.setCheckOutTime(checkOutTime);
			ap.setNumberOfPeopleVisiting(numberOfPeopleVisiting);
			session.save(ap);
			transaction.commit();
			session.close();
		}
		catch (HibernateException e) {
			System.out.println(e.getMessage());
			System.out.println("error");
		}
		catch(Exception e) {
			e.printStackTrace();
		}


	}
}