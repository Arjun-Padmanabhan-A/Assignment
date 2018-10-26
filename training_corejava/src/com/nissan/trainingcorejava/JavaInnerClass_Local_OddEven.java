package com.nissan.trainingcorejava;

import java.util.Scanner;

class OddEvenSeparate {
	int array[] = new int[100];
	int size;
	public OddEvenSeparate() {
	
	}
	public OddEvenSeparate( int array[], int size) {
		for ( int i = 0; i < size; i++ )
			this.array[i] = array[i];
		this.size = size;
	}
	public void separateOddEven() {
		class SeparatingNumbers {
			int odd[] = new int[100];
			int even[] = new int[100];
			int o, e;
			public SeparatingNumbers() {
				o = 0; 
				e = 0;
				for ( int i = 0; i < size; i++ ) {
					if ( array[i] % 2 == 0 )
						even[e++] = array[i];
					else
						odd[o++] = array[i];
				}
			}
			public void display() {
				System.out.print("Odd Numbers are : ");
				for ( int i = 0; i < o; i++ )
					System.out.print(odd[i] + " ");
				System.out.println();
				System.out.print("Even Numbers are : ");
				for ( int i = 0; i < e; i++ )
					System.out.print(even[i] + " ");
				System.out.println();
			}
		}
		SeparatingNumbers s = new SeparatingNumbers();
		s.display();
	}
}

public class JavaInnerClass_Local_OddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
		int size, a[] = new int[100];
		System.out.print("Enter the size : ");
		size = sc.nextInt();
		System.out.print("Enter the elements : ");
		for ( int i = 0; i < size; i++ )
			a[i] = sc.nextInt();
		OddEvenSeparate s = new OddEvenSeparate(a, size);
		s.separateOddEven();
	}

}
