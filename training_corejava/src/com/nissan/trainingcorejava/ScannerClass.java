package com.nissan.trainingcorejava;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {	
		String a = "My name is Nissan";
		Scanner s1 = new Scanner( a );
		System.out.println( s1.delimiter() );
		s1.useDelimiter(" ");
		System.out.println(s1.next());
		System.out.println(a.replaceAll(" ", "-"));
	}

}
