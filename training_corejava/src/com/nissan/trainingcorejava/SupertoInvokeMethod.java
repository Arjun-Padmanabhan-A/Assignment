package com.nissan.trainingcorejava;

class Animal_two
{
	void eat()
	{
		System.out.println("Animal is eating");
	}
}
class Cheetah_two extends Animal_two
{
	void eat()
	{
		System.out.println("Eating deer");
	}
	void roar()
	{
		System.out.println("Cheetah is roaring");
	}
	void working()
	{
		super.eat();
		roar();
	}
}

public class SupertoInvokeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cheetah_two c = new Cheetah_two();
		c.working();
	}

}
