package com.Dao;

import java.util.List;

import com.Job;

public interface JobDao {
	
	void addJob(Job job);
	List<Job> getAllJobs();
	Job getJob(int id);
}
