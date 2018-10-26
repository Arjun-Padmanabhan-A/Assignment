package com.nissan.trainingcorejava;

class Animals
{
	void voice()
	{
		System.out.println("Making Sounds");
	}
}

class Lion extends Animals
{
	void roar()
	{
		System.out.println("Cheetah is Roaring...");
	}
}

class Dogs extends Animals
{
	void weep()
	{
		System.out.println("Dog is Weeping");
	}
	void roar()
	{
		
	}
}

public class Testing_HierarchialInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog c= new Dog();
		c.voice();
		c.roar();
		c.weep();
	}

}
