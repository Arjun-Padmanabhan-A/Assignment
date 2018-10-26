package com.nissan.trainingcorejava;

interface TestingLambda
{
	public void adder( int a, int b );
}

public class LambdaExpression_Test2 {

	public static void main(String[] args) {
		TestingLambda t = (int a, int b)->
		{
			System.out.println(a+b);
		};
		t.adder(10, 20);
		t.adder(30, 40);
	}

}
