package com.nissan.trainingcorejava;

import java.util.*;

public class MultiThread_Sorting extends Thread{
	
	int choice;
	int array[] = {5,3,1,10,6,12,35,20,50,0,8};
	String strArray[] = {"aadhi", "matthi", "dravid", "rahul", "nil", "ben"};
	
	public void run() {
		if ( choice == 1 ) {
			Arrays.sort(array);
			System.out.println( Arrays.toString(array) );
			
			System.out.println();
		}
		else {
			Arrays.sort(strArray);
			System.out.println( Arrays.toString(strArray) );
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		MultiThread_Sorting m = new MultiThread_Sorting();
		MultiThread_Sorting m1 = new MultiThread_Sorting();
		m.choice = 1;
		m.setPriority(MAX_PRIORITY);
		m1.choice = 2;
		m1.setPriority(MIN_PRIORITY);
		m.start();
		m1.start();
	}

}
