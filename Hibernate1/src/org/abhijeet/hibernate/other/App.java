package org.abhijeet.hibernate.other;

import org.abhijeet.hibernate.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
								 .configure("Hibernate.cfg.xml")
								 .addAnnotatedClass(User.class)
								 .buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		
		try {
			
		}
		finally {
			session.close();
			factory.close();
		}
	}
	
}
