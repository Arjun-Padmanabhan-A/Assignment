package com.nissan.trainingcorejava;

import java.util.Scanner;

abstract class SortCustomerList
{
	String a[] = new String[100];
	int size;
	abstract void read(String array[], int size);
	public abstract void sort(int size);

	public abstract void display();
}

public class JavaInnerClass_Anonymous_Sort {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the size : ");
		int size = sc.nextInt();
		String a[] = new String[100];
		for ( int i = 0; i < size; i++ )
			a[i] = sc.next();
		SortCustomerList s = new SortCustomerList() {
			@Override
			public void read( String array[], int size)
			{
				for ( int i = 0; i < size; i++ )
					this.a[i] = array[i];
				this.size = size;
			}
			@Override
			public void sort(int size) {
				for ( int i = 0; i < size; i++ )
				{
					for ( int j = i+1; j < size; j++ )
					{
						if ( this.a[i].compareTo(this.a[j]) < 0 )
						{
							String temp = this.a[i];
							this.a[i] = this.a[j];
							this.a[j] = temp;
						}
					}
				}
			}
			@Override
			public void display()
			{
				for (int i = 0; i < size; i++ )
					System.out.println(this.a[i]);
				System.out.println();
			}
		};
		s.read(a, size);
		System.out.println("Before Sorting");
		s.display();
		s.sort(size);
		System.out.println("After Sorting");
		s.display();
	}

}
