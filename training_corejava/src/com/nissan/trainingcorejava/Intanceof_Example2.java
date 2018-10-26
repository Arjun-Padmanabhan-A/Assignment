package com.nissan.trainingcorejava;

class ParentClass
{
	public void display()
	{
		System.out.println(getClass());
	}
}
public class Intanceof_Example2 extends ParentClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intanceof_Example2 i = new Intanceof_Example2();
		System.out.println(i instanceof ParentClass);
		i.display();
	}

}
