package com.SpringBootwebApplication.api.util;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class HibernateUtil {
	
	@Autowired
	private  SessionFactory factory;
	
	public  Session getSession() {
		Session session = factory.getCurrentSession();
		if (session == null) {
			return factory.openSession();
		} else {
			return session;
		}

	}
}
