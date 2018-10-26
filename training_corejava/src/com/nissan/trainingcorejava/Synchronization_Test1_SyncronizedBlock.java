package com.nissan.trainingcorejava;

class TestingSynchronization_3 extends Thread 
{
	int array[] = new int[100];
	public void printValue( int a )
	{
		for ( int i = 0; i <= a; i++ )
		{
			synchronized(this)
			{
				array[i] = a*i;
			}
		
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

class ThreadOne_3 extends Thread
{
	TestingSynchronization_3 t ;
	ThreadOne_3( TestingSynchronization_3 t )
	{
		this.t = t;
	}
	public void run()
	{
		t.printValue(5);
	}
}

class ThreadTwo_3 extends Thread
{
	TestingSynchronization_3 t;
	public ThreadTwo_3( TestingSynchronization_3 t ) 
	{
		this.t = t;
	}
	public void run()
	{
		t.printValue(10);
	}
}

public class Synchronization_Test1_SyncronizedBlock
{
	public static void main(String[] args) 
	{
		TestingSynchronization_3 t = new TestingSynchronization_3();
		ThreadOne_3 t1 = new ThreadOne_3(t);
		ThreadTwo_3 t2 = new ThreadTwo_3(t);
		t1.start();
		t2.start();
	}
}