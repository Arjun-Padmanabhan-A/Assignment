package com.nissan.trainingcorejava;

import java.util.Scanner;

public class StringClassMethods_Test3_CheckEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "";
		Scanner sc = new Scanner(System.in);

		System.out.print(" Enter a String : ");
		input = sc.nextLine();
		
		if ( input.isEmpty() )
		{
			System.out.println("String is Empty");
			System.out.print("Enter a String : ");
			String append = sc.nextLine();
			input += append;
			System.out.print("Enter a delimiter : ");
			String del = sc.next(); 
			String a[] = input.split(del);
			for (int i = 0; i < a.length; i++ )
				System.out.println(a[i]);
		}
		else
		{
			System.out.println("Non Empty");
			System.out.println("String is : " + input);
		}
	}

}
