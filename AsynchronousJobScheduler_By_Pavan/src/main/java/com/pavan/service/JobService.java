package com.pavan.service;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class JobService {
	
	public static final Logger logger = LoggerFactory.getLogger(JobService.class);
	
	
	public void executeEmailTask(Map<String, String> params)
	{
		logger.info("Started Email Task On Thread {} ", Thread.currentThread().getName());
		
		String recipient = params.getOrDefault("recipient", "PavanKumar@gmail.com");
		String message = params.getOrDefault("message", "Mail Sending Task");
		
		try {
			Thread.sleep(3000);
			logger.info("Email Sent To: {} With Message: {} ", recipient, message);
		} catch (InterruptedException e) {
			System.out.println("Error in Executing the Email Task " + e.getMessage());
		}
		
	}
	
	
	public void executeReportTask(Map<String, String> params)
	{
		logger.info("Started Report Task On Thread : " + Thread.currentThread().getName());
	}

}
