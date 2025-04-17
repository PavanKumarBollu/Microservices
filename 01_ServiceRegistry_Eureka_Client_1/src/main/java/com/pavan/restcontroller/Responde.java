package com.pavan.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Responde {

	@GetMapping(value="/responde/{msg}")
	public String responseToTheCall( @PathVariable String msg)
	{
		return "Hi I got Your Massage Don't worry I Am Here to Help You Out..*";
	}
	
}
