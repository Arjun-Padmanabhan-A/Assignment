package com.nissan.trainingcorejava;

class MainClass
{
	String names[] = {"Amal","Ajit","Arun","Aromal","Binu"};
}

class ChildClass extends MainClass
{
	void Search()
	{
		for ( int i = 0; i < super.names.length; i++ )
		{
			if( super.names[i] == "Arun" )
				super.names[i] += 30;
		}
	}
	void display()
	{
		for ( int i = 0 ; i < super.names.length; i++ )
			System.out.println(super.names[i]);
	}
}

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass c = new ChildClass();
		c.Search();
		c.display();
	}

}
