package com.nissan.trainingcorejava;

import java.util.Scanner;

interface Sorting
{
	void sort( int a[], int size );
	void swap( int a[], int i, int j );
	void display( int a[], int size  );
}

public class JavaInterface_Test1_Sorting implements Sorting {
	
	public void swap( int array[], int i, int j )
	{
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	public void sort( int array[], int size )
	{
		for ( int i = 0; i < size; i++ )
		{
			for ( int j = i+1; j < size; j++ )
			{
				if ( array[i] > array[j] )
					swap( array, i, j );
			}
		}
	}
	
	public void display(int array[], int size)
	{
		for( int i = 0; i < size; i++ )
			System.out.print(array[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[100];
		Scanner sc = new Scanner(System.in);
		JavaInterface_Test1_Sorting j = new JavaInterface_Test1_Sorting();
		System.out.println("Enter the size : " );
		int size = sc.nextInt();
		System.out.println("Enter the elements : " );
		for ( int i = 0; i < size; i++ )
			array[i] = sc.nextInt();
		System.out.println("Sorting...");
		j.sort(array, size);
		j.display(array, size);
		sc.close();
	}

}
