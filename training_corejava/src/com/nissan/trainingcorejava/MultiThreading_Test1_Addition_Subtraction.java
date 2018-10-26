package com.nissan.trainingcorejava;

public class MultiThreading_Test1_Addition_Subtraction extends Thread{

	int choice = 0;
	int a, b;
	public void run() {
		if ( choice == 0 ) {
			System.out.println("Adding : " + (a+b));
		}
		else {
			System.out.println("Subtracting : " + (a-b));
		}
	}
	public static void main(String[] args) {
		MultiThreading_Test1_Addition_Subtraction m = new MultiThreading_Test1_Addition_Subtraction();
		m.a = 5; m.b = 10; m.choice = 0;
		//m.setPriority(10);
		m.start();
		MultiThreading_Test1_Addition_Subtraction m1 = new MultiThreading_Test1_Addition_Subtraction();
		m1.a = 5; m1.b = 10; m1.choice = 1;
		//m1.setPriority(1);
		m1.start();
	}

}
