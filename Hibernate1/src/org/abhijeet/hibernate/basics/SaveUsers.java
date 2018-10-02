package org.abhijeet.hibernate.basics;

import org.abhijeet.hibernate.entity.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.dialect.pagination.FirstLimitHandler;

public class SaveUsers {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
								 .configure("hibernate.cfg.xml")
								 .addAnnotatedClass(Users.class)
								 .buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {

			// Create object of the entity type
			Users user = new Users(1,"sinaia", "sinaia", "Abhijeet", "Sakhalkar");
			
			// Start transaction
			session.beginTransaction();
			
			// perform transaction
			session.save(user);
 			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Row added for: "+user.getFirstName()+" "+user.getLastname());
			
			
		}
		finally {
			session.close();
			factory.close();
		}
	}
	
}
