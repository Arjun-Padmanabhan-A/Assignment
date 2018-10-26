package com.nissan.trainingcorejava;

public class MultiTHreading_Example2_Interface implements Runnable{

	public void run() {
		for ( int i = 0; i < 5; i++ )
		{
			System.out.println(i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Running a thread");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiTHreading_Example2_Interface m = new MultiTHreading_Example2_Interface();
		Thread t = new Thread(m);
		t.start();
	}

}
