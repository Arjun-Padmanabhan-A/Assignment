package com.nissan.trainingcorejava;

class TestingSynchronization_2 extends Thread 
{
	int array[] = new int[100];
	synchronized public void printValue( int a )
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

class ThreadOne_2 extends Thread
{
	TestingSynchronization_2 t ;
	ThreadOne_2( TestingSynchronization_2 t )
	{
		this.t = t;
	}
	public void run()
	{
		t.printValue(5);
	}
}

class ThreadTwo_2 extends Thread
{
	TestingSynchronization_2 t;
	public ThreadTwo_2( TestingSynchronization_2 t ) 
	{
		this.t = t;
	}
	public void run()
	{
		t.printValue(10);
	}
}

public class Syncchronization_Test1_WithSyncronizedMethod 
{
	public static void main(String[] args) 
	{
		TestingSynchronization_2 t = new TestingSynchronization_2();
		ThreadOne_2 t1 = new ThreadOne_2(t);
		ThreadTwo_2 t2 = new ThreadTwo_2(t);
		t1.start();
		t2.start();
	}
}