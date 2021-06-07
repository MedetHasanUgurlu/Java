package com.medethasanugurlu.thread1;

public class Printer extends Thread{
	private String isim;
	
	public Printer(String isim) {
		this.isim = isim;
		
	}

	@Override
	public void run() {
		for(int i =0;i<10;i++) { 
			System.out.println(isim+ " calısıyor."+i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	

}
