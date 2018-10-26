package com.nissan.trainingcorejava;

import java.util.Scanner;

public class StringClassMethods_Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = new String[100];
		String charAt = "";
		int size = 3;
		System.out.println("Enter " + size + " strings each having " + size + " characters atleast");
		Scanner sc = new Scanner(System.in);
		for ( int i = 0; i < size; i++ )
			array[i] = sc.next();
		for ( int i = 0; i < size; i++ )
		{
			charAt = String.format("The %dth character in %s is %c", i, array[i], array[i].charAt(i));
			System.out.println(charAt);
		}
		for ( int i = 0; i < size; i++ )
		{
			System.out.println( "Last " + ( size - i ) + " characters of " + array[i] + " is " + array[i].substring(i) );		
		}
	}

}
