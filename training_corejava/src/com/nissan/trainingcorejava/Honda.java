package com.nissan.trainingcorejava;

class Car
{
	final void run()
	{
		System.out.println("The car runs");
	}
}

public class Honda extends Car{

	/*void run()		//Cannot override a final method
	{
		System.out.println("The car runs again");
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Honda h = new Honda();
		h.run();
	}

}
