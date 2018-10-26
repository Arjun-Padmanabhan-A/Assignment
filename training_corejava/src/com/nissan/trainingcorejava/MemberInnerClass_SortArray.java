package com.nissan.trainingcorejava;

import java.util.Scanner;

class ReadArrayAndSort
{
	int a[] = new int[100];
	int size;
	ReadArrayAndSort( int a[], int size )
	{
		for ( int i = 0; i < size; i++ )
			this.a[i] = a[i];
		this.size = size;
	}
	void display()
	{
		for ( int i = 0; i < size; i++ )
			System.out.print(a[i] + " ");
		System.out.println();
	}
	void sortArray( )
	{
		for ( int i = 0; i < size; i++ )
		{
			for ( int j = i+1; j < size; j++ )
			{
				if ( a[i] > a[j] )
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		display();
	}
	class FindLargest
	{
		void largest()
		{
			System.out.println("Largest element : " + a[size-1]);
		}
	}
}

public class MemberInnerClass_SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[100], size = 5;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size : ");
		size = sc.nextInt();
		System.out.print("Enter the elements : ");
		for ( int i = 0; i < size; i++ )
			a[i] = sc.nextInt();
		ReadArrayAndSort obj = new ReadArrayAndSort(a, size);
		ReadArrayAndSort.FindLargest f = obj.new FindLargest();
		obj.sortArray();
		f.largest();
	}

}
