package com.multithreading.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {

	public static void main(String[] args) {
		ExecutorService executorService1 = Executors.newSingleThreadExecutor(); //Creates //a ExecutorService object having a single thread.  
		ExecutorService executorService2 = Executors.newFixedThreadPool(10);  // Creates a //ExecutorService object having a pool of 10 threads.  		  
		ExecutorService executorService3 = Executors.newScheduledThreadPool(10); //Creates a scheduled thread pool executor with 10 threads. In scheduled thread //pool, we can schedule tasks of the threads.  
		ExecutorService executorService4 = Executors.newCachedThreadPool(); 

		ExecutorService executorService = Executors.newFixedThreadPool(10);
		
		executorService.execute(new Runnable() {

			@Override
			public void run() {
				System.out.println("ExecutorService");

			}
		});
		executorService.shutdown();
	}

}