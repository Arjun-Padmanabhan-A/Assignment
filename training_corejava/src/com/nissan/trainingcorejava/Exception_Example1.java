package com.nissan.trainingcorejava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Example1 {

	public static void main(String[] args) {
		int a = 100;
		
		//Scanner sc = new Scanner( System.in );
		
		OUTER:
		for( int i = 0; i < 10; i++ )
		{
			Scanner sc = new Scanner( System.in );
			
			try {
				a = sc.nextInt();
			}
			catch(Exception e) {
				System.out.println(e);
				continue OUTER;
			}
			finally {
				System.out.println("Finally");
			}
		}
	}

}
