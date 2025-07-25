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
		executor.setCorePoolSize(4);
		executor.setMaxPoolSize(8);
		executor.setQueueCapacity(50);
		executor.setThreadNamePrefix("AsyncJob- ");
		executor.initialize();
		return executor;
	}

}
