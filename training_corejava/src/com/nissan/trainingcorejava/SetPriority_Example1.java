package com.nissan.trainingcorejava;

public class SetPriority_Example1 extends Thread{
	
	public void run() {
		System.out.println("Thread Name is : " + Thread.currentThread().getName() );
		System.out.println("Thread Priority is : " + Thread.currentThread().getPriority() );
	}

	public static void main(String[] args) {
		SetPriority_Example1 s = new SetPriority_Example1();
		SetPriority_Example1 s1 = new SetPriority_Example1();
		s.setPriority(MIN_PRIORITY);
		s1.setPriority(MAX_PRIORITY);
		s.start();
		s1.start();
	}

}
