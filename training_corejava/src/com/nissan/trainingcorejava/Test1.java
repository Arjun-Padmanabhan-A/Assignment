package com.nissan.trainingcorejava;

interface TestingInterface
{
	public void hello();
}

class TestingClass implements TestingInterface
{
	TestingClass()
	{
		System.out.println("Constructor called");
	}
	public void hello()
	{
		System.out.println("Hi");
	}
}

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestingClass t = new TestingClass();
		t.hello();
	}

}
