package com.nissan.trainingcorejava;

@FunctionalInterface
interface PrintDisplay1
{
	public void display( );
}

public class LambdaExpression_Test1 {

	public static void main(String[] args) {
		String str = "This is a lambda expression";
		PrintDisplay1 p = ()->
		{
			System.out.println(str);
		};
		p.display();	
	}
}