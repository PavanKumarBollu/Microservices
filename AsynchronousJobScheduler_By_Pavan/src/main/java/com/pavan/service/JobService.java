package com.pavan.service;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class JobService {
	
	public static final Logger logger = LoggerFactory.getLogger(JobService.class);
	
	
	@Async
	public void executeEmailTask(Map<String, String> params)
	{
		logger.info("Started Email Task On Thread : {} ", Thread.currentThread().getName());
		
		String recipient = params.getOrDefault("recipient", "PavanKumar@gmail.com");
		String message = params.getOrDefault("message", "Mail Sending Task");
		
		try {
			Thread.sleep(5000);
			logger.info("Email Sent To: {} With Message: {} ", recipient, message);
		} catch (InterruptedException e) {
			logger.info("Error In Executing the email Task " + e);
			System.out.println("Error in Executing the Email Task " + e.getMessage());
		}
		
	}
	
	@Async
	public void executeReportTask(Map<String, String> params)
	{
		logger.info("Started Report Task On Thread : " + Thread.currentThread().getName());
		String reportType = params.getOrDefault("type", "SUMMERY");
		
		try {
			Thread.sleep(5000);
			logger.info("Generated {} Report ", reportType);
		} catch (InterruptedException e) {
			logger.info("Error In Executing the Report Task " + e);
			
		}
		
	}
	
	public void executeDbConnection(Map<String, String> params)
	{
		
	}

}
