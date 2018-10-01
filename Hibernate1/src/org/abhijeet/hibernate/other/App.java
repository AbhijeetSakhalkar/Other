package org.abhijeet.hibernate.other;

import org.abhijeet.hibernate.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.dialect.pagination.FirstLimitHandler;

public class App {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
								 .configure("Hibernate.cfg.xml")
								 .addAnnotatedClass(User.class)
								 .buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {

			// Create object of the entity type
			User user = new User("sinaia", "sinaia", "Abhijeet", "Sakhalkar");
			
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
