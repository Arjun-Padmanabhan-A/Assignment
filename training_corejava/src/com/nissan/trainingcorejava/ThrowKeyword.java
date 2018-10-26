package com.nissan.trainingcorejava;

public class ThrowKeyword {

	public static void checkingThrow(int a) {
		if ( a > 20 )
			throw new ArithmeticException("No college for you");
		else
			System.out.println("College");
	}
	public static void hello() {
		checkingThrow(25);
	}
	
	public static void hello1() {
		hello();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			hello1();
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

}
