package com.pavan.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "01-ServiceRegistry-Eureka-Client-1")
public interface Client1Communicator  {

	@GetMapping(value="/responde/{msg}")
	public String getReplayFromClient1(@PathVariable String msg);
}
