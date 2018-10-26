package com.nissan.trainingcorejava;

import java.util.*;
import java.io.*;

public class FibonacciInFile {

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
		int limit = 0;
		int a = 0, b = 1, c = 0;
		System.out.println("Enter the limit : ");
		limit = sc.nextInt();
		try {
			FileOutputStream f = new FileOutputStream("D:\\Fibonacci.txt");
			while ( limit > 0 ) {
				System.out.print(a + " ");
				f.write((a+ " ").getBytes());
				c = a + b;
				a = b;
				b = c;
				limit--;
			}
			f.close();
		} 
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} 
		catch (IOException e) {
			System.out.println(e.getMessage());
		}	
	}
}