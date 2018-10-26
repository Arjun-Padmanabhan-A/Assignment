package com.nissan.trainingcorejava;

class TestingSynchronization extends Thread 
{
	synchronized  void printValue( int a )
	{
		for ( int i = 01; i <= a; i++ )
		{
			synchronized(this) 
			{
				System.out.println(a*i); 
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
	}
}

class ThreadOne extends Thread
{
	TestingSynchronization t ;
	ThreadOne( TestingSynchronization t )
	{
		this.t = t;
	}
	public void run()
	{
		t.printValue(5);
	}
}

class ThreadTwo extends Thread
{
	TestingSynchronization t;
	public ThreadTwo( TestingSynchronization t ) 
	{
		this.t = t;
	}
	public void run()
	{
		t.printValue(10);
	}
}

public class Synchronization_Example1
{
	public static void main(String[] args) 
	{
		TestingSynchronization t = new TestingSynchronization();
		ThreadOne t1 = new ThreadOne(t);
		ThreadTwo t2 = new ThreadTwo(t);
		t1.start();
		t2.start();
	}

}
