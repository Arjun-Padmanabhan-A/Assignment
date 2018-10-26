package com.nissan.trainingcorejava;

import java.util.Scanner;

public class StringBufferClassMethods_Test4_Employee {

	public static void swap( StringBuffer array[], int i, int j )
	{
		StringBuffer temp = new StringBuffer(array[i]);
		array[i] = array[j];
		array[j] = temp;
	}
	
	public static void sort( StringBuffer array[], int size )
	{
		for( int i = 0; i < size; i++ )
		{
			for ( int j = 0; j < size; j++ )
			{
				if ( array[i].toString().compareTo(array[j].toString()) < 0 )
					swap( array, i, j );
			}
		}
	}
	
	public static void display( StringBuffer array[], int size )
	{
		System.out.println("Final Strings Are :");
		for ( int i = 0; i < size; i++ )
			System.out.println(array[i]);
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		StringBuffer[] sb = new StringBuffer[20];

		String charAt = "";
		String lastName = "";
		int size = 0, flag = 0;
		System.out.println( " Enter the size : ");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		sc.nextLine();
		for ( int i = 0; i < size; i++ )
		{
			sb[i] = new StringBuffer(sc.nextLine());
		}
		
		for ( int i = 0; i < size; i++ )
		{
			flag = 0;
			for( int j = i+1; j < size; j++ )
			{
				if ( sb[i].toString().indexOf(sb[j].toString()) != -1  && i != j && flag == 0 ) 
				{
					System.out.println("Enter the last name of " + sb[i] + " at index : " + i );
					lastName = sc.next();
					sb[i] = sb[i].append(" " + lastName);
					System.out.println("Enter the last name of " + sb[j] + " at index : " + j );
					lastName = sc.next();
					sb[j] = sb[j].append(" " + lastName);
					flag = 1;
				}
				if( sb[i].toString().indexOf(sb[j].toString()) != -1 && i != j && flag == 1 )
				{
					System.out.println("Enter the last name of " + sb[j] + " at index : " + j );
					lastName = sc.next();
					sb[j] = sb[j].append(" " + lastName);
				}
			}
		}
		sort(sb, size);
		display(sb, size);
	}

}

