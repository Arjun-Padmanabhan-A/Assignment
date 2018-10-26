package com.nissan.trainingcorejava;

abstract class Loan
{
	abstract float rateOfInterest();
}

class HDFC extends Loan
{
	float rateOfInterest()
	{
		return 8.2f;
	}
}

class ICICI extends Loan
{
	float rateOfInterest()
	{
		return 10.3f;
	}
}

class BOI extends Loan
{
	float rateOfInterest()
	{
		return 4.9f;
	}
}

public class AbstractClass_Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC h = new HDFC();
		System.out.println("HDFC rate : " + h.rateOfInterest());
		BOI b = new BOI();
		System.out.println("BOI rate : " + b.rateOfInterest());
		ICICI i = new ICICI();
		System.out.println("ICICI rate : " + i.rateOfInterest());
	}

}
