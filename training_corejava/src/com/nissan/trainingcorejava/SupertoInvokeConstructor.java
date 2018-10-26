package com.nissan.trainingcorejava;

class Animal_three
{
	public Animal_three() {
		// TODO Auto-generated constructor stub
		System.out.println("Animal is eating");
	}
}

class Cheetah_four extends Animal_three
{
	public Cheetah_four() {
		// TODO Auto-generated constructor stub
		super();	// First statement that will be present if not specified
		System.out.println("Eating deer");
	}
}

public class SupertoInvokeConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cheetah_four c = new Cheetah_four();
	}

}
