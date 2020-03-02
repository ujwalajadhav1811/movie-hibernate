package com.techdenovo.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.techdenovo.model.Movie;
import com.techdenovo.utility.HibernateUtility;

public class MovieDaoImpl implements MovieDao 
{
	private SessionFactory sessionFactory=HibernateUtility.getSessionFactory();

	public int addMovie(Movie movie) {
		Session session = this.sessionFactory.openSession();
		Transaction tx=  session.beginTransaction();
		int id =(int) session.save(movie);
		tx.commit();
		session.close();
		return id;
	}
	
	 public List<Movie> getAllMovies()
	 {
		 Session session = this.sessionFactory.openSession();
		 session.createCriteria(Movie.class).list();
		return null;
		 
	 }

}
