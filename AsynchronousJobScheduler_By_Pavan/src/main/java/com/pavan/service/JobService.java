package com.pavan.service;

import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class JobService {
	
	
	
	public void executeEmailTask(Map<String, String> params)
	{
		String recipient = params.getOrDefault("recipient", "PavanKumar@gmail.com");
		String message = params.getOrDefault("message", "Mail Sending Task");
		
		try {
			Thread.sleep(3000);
			
		} catch (InterruptedException e) {
			System.out.println("Error in Executing the Email Task " + e.getMessage());
		}
		
	}
	
	
	public void executeReportTask(Map<String, String> params)
	{
		
	}

}
