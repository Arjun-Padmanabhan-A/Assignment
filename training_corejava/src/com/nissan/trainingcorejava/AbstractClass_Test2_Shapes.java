package com.nissan.trainingcorejava;

abstract class Abstract_Test_Overloading
{
	abstract float area( float a );
	abstract float area( float a, float b );
	abstract float area( float pi, float r, float r2 );
}

abstract class Shape
{
	int a, d;
	abstract float area( );
}

class Area extends Abstract_Test_Overloading
{
	public float area( float a)
	{
		return a*a;
	}
	public float area( float a, float b )
	{
		return a*b;
	}
	public float area( float pi, float r, float r2 )
	{
		return pi*r*r2;
	}
}

class Rectangle extends Shape
{
	Rectangle(int l, int b )
	{
		a = l;
		d = b;
	}
	public float area(  )
	{
		return a*d;
	}
}

class Square extends Shape
{
	Square(int l)
	{
		a = l;
	}
	public float area()
	{
		return a*a;
	}
}

class Circle extends Shape
{
	Circle( int r )
	{
		a = r;
	}
	public float area()
	{
		return 3.14f*a*a;
	}
}

public class AbstractClass_Test2_Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle(3, 4);
		System.out.println( r.area() );
		Square s = new Square(2);
		System.out.println( s.area() );
		Circle c = new Circle(10);
		System.out.println( c.area() );
		
		
		Area a = new Area();
		System.out.println(a.area(10));
		System.out.println(a.area(10,20));
		System.out.println(a.area(3.14f,10.0f,10.0f));
	}

}
