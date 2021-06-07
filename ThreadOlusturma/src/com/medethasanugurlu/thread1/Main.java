package com.medethasanugurlu.thread1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer print1 = new Printer("Print1");
		Printer print2 = new Printer("Print2");
		print1.start();
		print2.start();
		

	}

}
