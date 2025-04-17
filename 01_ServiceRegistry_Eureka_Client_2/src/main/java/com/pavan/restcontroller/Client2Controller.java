package com.pavan.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.pavan.client.Client1Communicator;

@RestController
public class Client2Controller {
	@Autowired
	private Client1Communicator c;
	
	
	@GetMapping(value="/client2/display")
	public String display(String msg)
	{
		System.out.println("implementation class name is  :: " + c.getClass().getName());
		
		return 
	}
	

}
