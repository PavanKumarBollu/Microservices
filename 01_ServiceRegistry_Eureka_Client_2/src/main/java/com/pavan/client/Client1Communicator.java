package com.pavan.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "01_ServiceRegistry_Eureka_Client_1")
public interface Client1Communicator  {

	@GetMapping(value="/responde/{msg}")
	public String getReplayFromClient1(String msg);
}
