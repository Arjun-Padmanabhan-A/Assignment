package com.nissan.trainingcorejava;

public class TestingJoin extends Thread{
	int k;
	public void run() {
		for ( int i = 1; i <= 5; i++ ) {
			try {
				//Thread.sleep(100);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println(i + " Thread " + k);
		}
	}

	public static void main(String[] args) {
			TestingJoin t1 = new TestingJoin();t1.k = 1;
			TestingJoin t2 = new TestingJoin();t2.k=2;
			TestingJoin t3 = new TestingJoin();t3.k=3;
			t1.start();
			t2.start();
			
			try {
				t1.join();
			}
			catch( Exception e ) {
				System.out.println( e.getMessage() );
			}
			t3.start();
	}

}
