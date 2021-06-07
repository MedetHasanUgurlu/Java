package com.medethasanugurlu.thread2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread print1 = new Thread(new Printer("Printer1"));
		Thread print2 = new Thread(new Printer("Print2"));
		
		
		print1.start();
		print2.start();
		
		

		
	}

}
