package com.nissan.trainingcorejava;

abstract class Car_one
{
	abstract void run();
}

class Child_Car extends Car_one
{
	void run()
	{
		System.out.println("Child Car");
	}
}

public class AbstractClass_Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child_Car c = new Child_Car();
		c.run();
	}

}
