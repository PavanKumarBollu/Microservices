package com.pavan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pavan.model.JobRequest;

@Service
public class JobExecutorService {
	
	@Autowired
	private JobService jobService;
	
	public void triggerJob(JobRequest jobRequest)
	{
		
	}

}
