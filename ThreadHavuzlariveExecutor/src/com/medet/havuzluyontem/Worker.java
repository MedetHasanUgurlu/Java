package com.medet.havuzluyontem;


public class Worker implements Runnable {
	
	private String name;
	private int id;
	
	public Worker(String name, int id) {
		this.id = id;
		this.name = name;
		
		
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		
		try {
			System.out.println("id :"+ id+ "Worker ise basladi.");
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("id :"+ id+ "Worker ise bitirdi.");
		
		
	}

}
