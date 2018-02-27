package com.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.job;
import com.model.job;

@Repository
@Transactional
public class JobDaoImpl implements JobDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void addJob(job job) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.save(job);
	}

	public List<Job> getAllJobs() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Job");
		return query.list();
	}

	public Job getJob(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		job job=(job)session.get(job.class,id);
		return job;
	}
	
	

}