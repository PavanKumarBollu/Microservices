package com.pavan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class AsynchronousJobSchedulerByPavanApplication {

	public static void main(String[] args) {
		SpringApplication.run(AsynchronousJobSchedulerByPavanApplication.class, args);
	}

}
