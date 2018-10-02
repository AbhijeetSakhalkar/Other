package org.abhijeet.hibernate.basics;

import org.abhijeet.hibernate.entity.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateUser {

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
			user.setPassword("123456");
			// Strange but hibernate generates update query w/o us 
			// writing any statement for the same
 			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Row updated for::::: "+user);
			
			
		}
		finally {
			session.close();
			factory.close();
		}
	}
	
}
