package com.nissan.trainingcorejava;

public class WrapperClass_Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer x;
		int a = 10;	
		x = a;						// Auto Boxing
		System.out.println(x);
		x = Integer.valueOf(a);		// Int to Integer
		System.out.println(x);
		
		x = new Integer(10);
		a = x.intValue();
		System.out.println(a); 		//	Un-boxing
		System.out.println( x instanceof Integer );
	}

}
