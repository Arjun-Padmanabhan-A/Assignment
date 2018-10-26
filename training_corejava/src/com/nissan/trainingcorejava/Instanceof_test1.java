package com.nissan.trainingcorejava;

class ParentClass_One
{
	public void runParent()
	{
		System.out.println("Inside Parent Class");
	}
}
class ChildClass_One extends ParentClass_One
{
	public void runChild()
	{
		System.out.println("Inside Child Class");
	}
}

public class Instanceof_test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass_One c = new ChildClass_One();
		if ( c instanceof ParentClass_One )
			c.runParent();
	}

}
