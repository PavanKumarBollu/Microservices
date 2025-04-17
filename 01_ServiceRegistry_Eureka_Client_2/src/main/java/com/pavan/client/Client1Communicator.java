package com.pavan.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "01_ServiceRegistry_Eureka_Client_1")
public interface Client1Communicator  {

}
