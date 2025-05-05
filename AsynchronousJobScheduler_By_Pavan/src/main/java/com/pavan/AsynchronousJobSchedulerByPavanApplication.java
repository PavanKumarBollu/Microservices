package com.pavan;

import java.util.concurrent.Executor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@SpringBootApplication
@EnableAsync
public class AsynchronousJobSchedulerByPavanApplication {

	public static void main(String[] args) {
		SpringApplication.run(AsynchronousJobSchedulerByPavanApplication.class, args);
	}
	
	public Executor taskExecutor()
	{
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		return executor;
	}

}
