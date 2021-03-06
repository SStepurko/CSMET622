package edu.bu.met622.threadtest.executor2eg;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {
	  public static void main(String[] args) {
	        System.out.println("Inside : " + Thread.currentThread().getName());

	        // Callable (returns future object)
//	      	System.out.println("Creating a Runnable...");
	        Runnable runnable = () -> {
//	            System.out.println("Inside : " + Thread.currentThread().getName());
	        };
	        
	        Callable callable = Executors.callable(runnable);
	        System.out.print("---Callable output:"+ callable.getClass().getSimpleName());
	        System.out.print("---Callable output2:"+ callable.getClass().getTypeName());
	        
	        // Executor (does not return future object)
//	        System.out.println("Creating Executor Service...");
	        ExecutorService executorService = Executors.newSingleThreadExecutor();

//	        System.out.println("Submit the task specified by the runnable to the executor service.");
	        executorService.submit(runnable);
	        executorService.shutdown();
	    }
}
