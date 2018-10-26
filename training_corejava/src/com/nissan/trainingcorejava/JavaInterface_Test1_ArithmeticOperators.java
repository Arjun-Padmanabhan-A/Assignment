package com.nissan.trainingcorejava;

interface ArithmeticOperations
{
	default void hello()
	{
		System.out.println("Interface for Arithmatic Operations ");
	}
	int add( int a, int b );
	int sub( int a, int b );
	int multiply( int a, int b );
	int division( int a, int b );
}

public class JavaInterface_Test1_ArithmeticOperators implements ArithmeticOperations{

	public int add( int a, int b )
	{
		return a+b;
	}
	public int sub( int a, int b )
	{
		return a-b;
	}
	public int multiply( int a, int b )
	{
		return a*b;
	}
	public int division( int a, int b )
	{
		return a/b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 20;
		JavaInterface_Test1_ArithmeticOperators j = new JavaInterface_Test1_ArithmeticOperators();
		j.hello();
		System.out.println( j.add(a, b) );
		System.out.println( j.sub(a, b) );
		System.out.println( j.multiply(a, b) );
		System.out.println( j.division(a, b) );
	}

}
