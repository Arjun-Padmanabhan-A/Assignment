package com.nissan.trainingcorejava;

class Vehicle
{
	void run()
	{
		System.out.println("Vehicle is running");
	}
}

class Bike extends Vehicle
{
	void run()
	{
		super.run();
		System.out.println("Bike is running too");
	}
}

public class Overridingmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b = new Bike();
		b.run();
	}

}
