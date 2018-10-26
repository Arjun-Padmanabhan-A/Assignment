package com.nissan.trainingcorejava;

public class MultiThreading_Example1 extends Thread{

	public void run() {
		System.out.println("Running a thread");
	}
	
	public static void main(String[] args) {
		MultiThreading_Example1 m = new MultiThreading_Example1();
		m.start();
		m.start();
	}

}
