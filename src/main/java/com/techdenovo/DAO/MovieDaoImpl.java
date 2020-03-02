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
		 Session session = sessionFactory.openSession();
	List<Movie> movieList=	 session.createCriteria(Movie.class).list();
	session.close();
		return movieList;
		 
	 }
	 
	 public Movie findMovieById(int id)
	 {
		 Session session = this.sessionFactory.openSession(); 
		 Movie movie=	 (Movie) session.get(Movie.class, id);
		 session.close();
		return movie;
		 
	 }
	 
	 public void movieUpdate(Movie movie )
	 {
		 Session session = this.sessionFactory.openSession();
			Transaction tx=  session.beginTransaction();
			 session.update(movie);
			tx.commit();
			session.close();
			
	 }
	 
	 public void movieDelete(Movie movie)
	 {
		 Session session = this.sessionFactory.openSession();
			Transaction tx=  session.beginTransaction();
			 session.delete(movie);
			tx.commit();
			session.close(); 
	 }
}
