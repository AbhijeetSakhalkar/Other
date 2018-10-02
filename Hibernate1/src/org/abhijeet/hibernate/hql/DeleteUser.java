package org.abhijeet.hibernate.hql;

import java.util.ArrayList;
import java.util.List;

import org.abhijeet.hibernate.entity.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteUser {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
								 .configure("hibernate.cfg.xml")
								 .addAnnotatedClass(Users.class)
								 .buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			// Start transaction
			session.beginTransaction();
			
			session.createQuery(("delete from users "
					+ "where user_id = '3'"))
					.executeUpdate();
			
			// commit transaction
			session.getTransaction().commit();
			
			
		}
		finally {
			session.close();
			factory.close();
		}
	}

}
