package com.techdenovo.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.techdenovo.model.User;
import com.techdenovo.utility.HibernateUtility;

public class UserDaoImpl implements UserDao 
{
	private SessionFactory sessionFactory=HibernateUtility.getSessionFactory();
	
	public User findUserByUsername(String username)
	 {
		 Session session = this.sessionFactory.openSession(); 
		 User user=	 (User) session.get(User.class,username);
		 session.close();
		return user;
	 }
}
