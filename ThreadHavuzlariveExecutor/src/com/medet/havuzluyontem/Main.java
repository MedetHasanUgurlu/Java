package com.medet.havuzluyontem;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		executor.submit(new Worker("Medet", 1));
		executor.submit(new Worker("Medet", 2));
		executor.submit(new Worker("Medet", 3));
		executor.submit(new Worker("Medet", 4));
		executor.submit(new Worker("Medet", 5));
		
		executor.shutdown();
	
		
		
		
		

	}

}
