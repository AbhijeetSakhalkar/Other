package org.abhijeet.hibernate.basics;

import org.abhijeet.hibernate.entity.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteUser {

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
			
			// delete record with user_id = 1
 			session.delete(user);
			
			// commit transaction
			session.getTransaction().commit();
			
		}
		finally {
			session.close();
			factory.close();
		}
	}
	
}
