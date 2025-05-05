package com.pavan.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pavan.model.JobRequest;

@RestController
@RequestMapping("/api/jobs")
public class JobController {

	public ResponseEntity<String> triggerJob(JobRequest jobRequest)
	{
		return null;
		
	}
	
	
}
