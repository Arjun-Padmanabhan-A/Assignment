package com.nissan.trainingcorejava;

public class ThreadSleepMethod extends Thread{
	
	public void run( ) {
		int j = 0;
		for ( int i = 0; i < 5; i++ ) {
			try {
				System.out.print(i+" ");
				Thread.sleep(1000);
				//System.out.println(j+" ");
			}
			catch( Exception e ) {
				System.out.println(e);
			}
		}
		System.out.println();
	}

	
	public static void main(String[] args) throws InterruptedException {
		ThreadSleepMethod t = new ThreadSleepMethod();
		t.run();
		ThreadSleepMethod t2 = new ThreadSleepMethod();
		t2.run();
	}

}
