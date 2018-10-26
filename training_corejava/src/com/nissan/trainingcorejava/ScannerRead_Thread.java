package com.nissan.trainingcorejava;

import java.util.Scanner;

public class ScannerRead_Thread extends Thread {

	static Scanner sc = new Scanner( System.in );
	static int[] a = new int[100];
	static int i = 0;
	
	public void run() {
		a[i++] = sc.nextInt();
	}
	
	public static void main(String[] args) {
		ScannerRead_Thread s = new ScannerRead_Thread();
		s.start();
		try {
			s.join();
		}
		catch( Exception e ) {
			System.out.println( e.getMessage() );
		}
	}

}
