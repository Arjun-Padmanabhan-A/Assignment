package com.nissan.trainingcorejava;

import java.util.Scanner;

public class StringClassMethods_Test2_ConcatAndSortArray {

	
	public static void swap( String array[], int i, int j )
	{
		String temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	public static void sort( String array[], int size )
	{
		for( int i = 0; i < size; i++ )
		{
			for ( int j = 0; j < size; j++ )
			{
				if ( array[i].compareTo(array[j]) < 0 )
					swap( array, i, j );
			}
		}
	}
	
	public static void display( String array[], int size )
	{
		System.out.println("Final Strings Are :");
		for ( int i = 0; i < size; i++ )
			System.out.println(array[i]);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = new String[100];
		String charAt = "";
		String lastName = "";
		int size = 0, flag = 0;
		System.out.println( " Enter the size : ");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		
		for ( int i = 0; i < size; i++ )
			array[i] = sc.next();
		
		for ( int i = 0; i < size; i++ )
		{
			flag = 0;
			for( int j = i+1; j < size; j++ )
			{
				if( array[i].equals(array[j]) && i != j && flag == 0 )
				{
					System.out.println("Enter the last name of " + array[i] + " at index : " + i );
					lastName = sc.next();
					array[i] = array[i].concat(" " + lastName);
					System.out.println("Enter the last name of " + array[j] + " at index : " + j );
					lastName = sc.next();
					array[j] = array[j].concat(" " + lastName);
					flag = 1;
				}
				if( array[i].equals(array[j]) && i != j && flag == 1 )
				{
					System.out.println("Enter the last name of " + array[j] + " at index : " + j );
					lastName = sc.next();
					array[j] = array[j].concat(" " + lastName);
				}
			}
		}
		sort(array, size);
		display(array, size);
	}

}
