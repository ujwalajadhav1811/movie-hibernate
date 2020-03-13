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
	   org.hibernate.Query query=session.createQuery("From User U WHERE U.username= :username");
		  query.setParameter("username",username);
		 User user=(User) ((org.hibernate.Query) query).uniqueResult();
		 session.close();
		return user;
	 }
}
