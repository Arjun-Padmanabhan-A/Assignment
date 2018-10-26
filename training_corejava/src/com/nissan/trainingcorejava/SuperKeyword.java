package com.nissan.trainingcorejava;

class Animal_one
{
	String color = "Blue";
}

class Cheetah_one extends Animal_one
{
	String color = "Yellow";
	public void display()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cheetah_one c = new Cheetah_one();
		c.display();
	}

}
