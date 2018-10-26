package com.nissan.trainingcorejava;

abstract class Car_two
{
	int i;
	public Car_two() {
		i = 0;
	}
	abstract void run();
	final void display()
	{
		System.out.println(i);
	}
}

class Child_CarTwo extends Car_two
{
	void run()
	{
		i++;
	}
	
}

public class AbstractClass_Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child_CarTwo c = new Child_CarTwo();
		c.run();
		c.display();
		Child_CarTwo d = new Child_CarTwo();
		d.display();
	}

}
