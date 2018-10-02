package org.abhijeet.hibernate.basics;

import org.abhijeet.hibernate.entity.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RetrieveUser {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
								 .configure("hibernate.cfg.xml")
								 .addAnnotatedClass(Users.class)
								 .buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {

			// Create object of the entity type
			Users user = new Users();
			
			// Start transaction
			session.beginTransaction();
			
			// perform transaction
			user = session.get(Users.class, 1);
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println(user);
			
			
		}
		finally {
			session.close();
			factory.close();
		}
	}

}
