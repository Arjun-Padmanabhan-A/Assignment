package com.nissan.trainingcorejava;

import java.util.Scanner;

public class StringBuilderClassMethods_Test2_Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder[] names = new StringBuilder[100];
		StringBuilder[][] dob = new StringBuilder[100][100];
		
		Scanner sc = new Scanner( System.in );
		int size = 0;
		
		System.out.print("Enter the size : ");
		size = sc.nextInt();
		sc.nextLine();
		for( int i = 0; i < size; i++ )
		{
			System.out.print("Enter the name : ");
			names[i] = new StringBuilder( sc.nextLine() );
			System.out.print("Enter the dob : ");
			for ( int j = 0; j < 3; j++ )
			{
				dob[i][j] = new StringBuilder( sc.next() );
			}
			sc.nextLine();
		}
		for ( int i = 0; i < size; i++ )
		{
			String temp = (String.join("-", dob[i][0].toString(), dob[i][1].toString(), dob[i][2].toString()));
			dob[i][0].setLength(0);
			dob[i][0] = new StringBuilder(temp); 
		}
		for ( int i = 0; i < size; i++ )
		{
			System.out.println("Name : " + names[i] + "  DOB : " + dob[i][0]);
		}
	}

}
