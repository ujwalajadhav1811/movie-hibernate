package com.techdenovo.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.techdenovo.model.Actor;
import com.techdenovo.utility.HibernateUtility;

public class ActorDaoImpl implements ActorDao {

	private SessionFactory sessionFactory=HibernateUtility.getSessionFactory();
	public int addActor(Actor actor)
	{
		Session session=this.sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		int id=(int) session.save(actor);
		tx.commit();
		session.close();
		return id;
		
	}
	
	public List<Actor> getAllActor()
	{
		Session session=sessionFactory.openSession();
		List<Actor> actorList=session.createCriteria(Actor.class).list();
		session.close();
		return actorList ;
		
	}

}
