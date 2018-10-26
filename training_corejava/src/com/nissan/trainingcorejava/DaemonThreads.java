package com.nissan.trainingcorejava;

public class DaemonThreads extends Thread{

	public void run() {
		if ( Thread.currentThread().isDaemon() ) {
			System.out.println("Daemon Thread is Running");
		}
		else
			System.out.println("User Thread is Running");
	}
	public static void main(String[] args) {
		DaemonThreads d1 = new DaemonThreads();
		DaemonThreads d2 = new DaemonThreads();
		DaemonThreads d3 = new DaemonThreads();
		d1.setDaemon(true);	// Sets 
		d1.start();
		d2.start();
		d3.start();
	}

}
