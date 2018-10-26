package com.nissan.trainingcorejava;

class TestingSynchronization_1 extends Thread 
{
	int array[] = new int[100];
	public void printValue( int a )
	{
		for ( int i = 0; i <= a; i++ )
		{
			array[i] = a*i; 
		
			try
			{
				Thread.sleep(100);
			}
			catch( Exception e )
			{
				System.out.println(e.getMessage());
			}
		}
		for ( int i = 0; i < a; i++ )
			System.out.print( array[i] + " ");
		System.out.println();
	}
}

class ThreadOne_1 extends Thread
{
	TestingSynchronization_1 t ;
	ThreadOne_1( TestingSynchronization_1 t )
	{
		this.t = t;
	}
	public void run()
	{
		t.printValue(5);
	}
}

class ThreadTwo_1 extends Thread
{
	TestingSynchronization_1 t;
	public ThreadTwo_1( TestingSynchronization_1 t ) 
	{
		this.t = t;
	}
	public void run()
	{
		t.printValue(10);
	}
}

public class Synchornization_Test1 
{
	public static void main(String[] args) 
	{
		TestingSynchronization_1 t = new TestingSynchronization_1();
		ThreadOne_1 t1 = new ThreadOne_1(t);
		ThreadTwo_1 t2 = new ThreadTwo_1(t);
		t1.start();
		t2.start();
	}
}
