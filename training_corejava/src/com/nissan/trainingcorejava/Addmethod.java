package com.nissan.trainingcorejava;

class Adder {

	public static int add(int a, int b)
	{
		return a+b;
	}
	public static int add(int a, int b, int c)
	{
		return a+b+c;
	}
	// Overloading with number of arguments

}

public class Addmethod
{
	public static void main(String[] args )
	{
		System.out.println(Adder.add(10, 20));
		System.out.println(Adder.add(10, 20, 30));
		System.out.println("Hrllo World");
	}
}