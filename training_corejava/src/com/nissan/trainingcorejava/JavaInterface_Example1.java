package com.nissan.trainingcorejava;

interface Draw
{
	void drawSomething();	// No body, only public abstract methods
	default void hello()
	{
		System.out.println("This is a default method");
	}
}

interface Write
{
	void writeSomething();
}

public class JavaInterface_Example1 implements Draw, Write {

	public void drawSomething()
	{
		System.out.println("This is a method");
	}
	public void writeSomething()
	{
		System.out.println("Write method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaInterface_Example1 j = new JavaInterface_Example1();
		j.drawSomething();
		j.writeSomething();
		j.hello();
	}

}
