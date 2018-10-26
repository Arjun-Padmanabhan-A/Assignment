package com.nissan.trainingcorejava;

import java.io.*;
import java.util.Scanner;

public class FileInput {

	public static void sort( int array[], int size ) {
		for ( int i = 0; i < size; i++ ) {
			for ( int j = i+1; j < size; j++ ) {
				if ( array[i] > array[j] ) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int array[] = new int[100], i = 0, k = 0;
		try {
			FileInputStream f = new FileInputStream("D:\\Input.txt");
			Scanner sc = new Scanner( f );
			while ( sc.hasNext() ) {
				array[i++] = sc.nextInt();
				
				System.out.println(array[i-1]);
			}
			f.close();
			sort(array, i);
			for ( int j = 0; j < i; j++ ) {
				System.out.println(array[j]);
			}
			FileOutputStream o = new FileOutputStream("D:\\Output.txt");
			while ( i-1 >= 0 ) {
				o.write((array[k++] + " " ).getBytes());
				i--;
			}
			o.close();
			sc.close();
		}
		catch ( Exception e ) {
			System.out.println( e.getMessage() );
		}
		
	}

}
