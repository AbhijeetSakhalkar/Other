package org.abhijeet.hibernate.hql;

import java.util.ArrayList;
import java.util.List;

import org.abhijeet.hibernate.entity.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AllUsersRetrival {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
								 .configure("hibernate.cfg.xml")
								 .addAnnotatedClass(Users.class)
								 .buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			List<Users> users = new ArrayList<Users>();
			
			// Start transaction
			session.beginTransaction();
			
			users = session.createQuery("from users")
					.getResultList();
			
			for(Users user: users) {
				System.out.println(user);
			}
			
			// commit transaction
			//session.getTransaction().commit();
		}
		finally {
			session.close();
			factory.close();
		}
	}

}
