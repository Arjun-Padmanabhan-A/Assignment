package com.nissan.trainingcorejava;

interface TestingMethodReference
{
	public void testing();
}

public class MethodReference {

	public static void testSomething()
	{
		System.out.println("Testing...");
	}
	
	public static void main(String[] args) 
	{
		TestingMethodReference t = MethodReference::testSomething;
		t.testing();
	}
}
