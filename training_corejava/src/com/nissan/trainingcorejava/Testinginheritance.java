package com.nissan.trainingcorejava;


class Animal
{
	void voice()
	{
		System.out.println("Making Sounds");
	}
}

class Cheetah extends Animal
{
	void roar()
	{
		System.out.println("Cheetah is Roaring...");
	}
}

class Dog extends Cheetah
{
	void weep()
	{
		System.out.println("Dog is Weeping");
	}
}

public class Testinginheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog c= new Dog();
		c.voice();
		c.roar();
		c.weep();
	}

}
