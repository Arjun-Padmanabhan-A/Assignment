package com.nissan.trainingcorejava;

interface PrintDisplay
{
	public void display();
}

public class LambdaExpression_Example1 {

	public static void main(String[] args) {
		
		PrintDisplay p = ()->
		{
			System.out.println("Display Function");
		};
		p.display();	
	}
}