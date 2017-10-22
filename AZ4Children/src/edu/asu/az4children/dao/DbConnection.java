package edu.asu.az4children.dao;

import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DbConnection {
	public static Session getConnection() throws SQLException
	{
		SessionFactory sessionFactory =new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		return session;
	}
	public static void closeConnection(Session session)
	{
		session.close();
	}
}
