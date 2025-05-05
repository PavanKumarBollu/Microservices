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
			
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		
	}
	
	
	public void executeReportTask(Map<String, String> params)
	{
		
	}

}
