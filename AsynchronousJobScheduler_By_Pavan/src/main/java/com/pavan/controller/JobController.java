package com.pavan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pavan.model.JobRequest;
import com.pavan.service.JobExecutorService;

@RestController
@RequestMapping("/api/jobs")
public class JobController {
	
	@Autowired
	private JobExecutorService jobExecutor;

	@PostMapping("/trigger")
	public ResponseEntity<String> triggerJob(@RequestBody JobRequest jobRequest)
	{
		jobExecutor.triggerJob(jobRequest);
		return ResponseEntity.ok("Job Triggered SuccessFully");
		
	}
	
}
