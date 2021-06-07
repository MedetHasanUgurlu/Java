package com.medethasanugurlu.thread2;

public class Printer implements Runnable{
	private String isim;
	
	public Printer(String isim) {
		this.isim = isim;
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
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

