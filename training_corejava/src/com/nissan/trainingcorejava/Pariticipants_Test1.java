package com.nissan.trainingcorejava;

import java.util.*;
import java.util.stream.IntStream;

interface Participants
{
	public void readData(int size, String name[], int age[] );
}

class MainThings
{
	public void add( String name[], int size )
	{
		for ( int i = 0; i < size; i++)
		{
			if ( name[i].length() < 2 )
				continue;
			int mid = name[i].length() / 2;
			if ( name[i].length() % 2 == 0 && !( name[i].length() <= 2) )
			{
				name[i] = name[i].substring(0, mid) + "-" + name[i].substring(mid, name[i].length());  
			}
			else
			{
				name[i] = name[i].substring(0, mid) + "-" + name[i].substring(mid, mid+1) + "-" + name[i].substring(mid+1, name[i].length()); 
			}
		}
	}
	public void append( String name[], int size, int age[] )
	{
		for ( int i = 0; i < size; i++ )
		{
			name[i] = name[i] + " " + age[i];
		}
	}
}

class ThreadOne_4 extends Thread
{
	MainThings m;
	String name[] = new String[100];
	int size;
	public ThreadOne_4( MainThings m, String name[], int size ) 
	{
		this.m = m;
		this.size = size;
		for ( int i = 0; i < size; i++ )
			this.name[i] = name[i];
	}
	public void display()
	{
		for( int i = 0; i < size; i++ )
		{
			System.out.println(name[i]);
		}
	}
	public void run()
	{
		m.add(name, size);
		display();
	}
}

class ThreadTwo_4 extends Thread
{
	String name[] = new String[100];
	int age[] = new int[100];
	int size;
	MainThings m;
	ThreadTwo_4( MainThings m, String name[], int size, int age[] )
	{
		this.m = m;
		this.size = size;
		for ( int i = 0; i < size; i++ )
		{
			this.name[i] = name[i];
			this.age[i] = age[i];
		}
	}

	public void display()
	{
		for( int i = 0; i < size; i++ )
		{
			System.out.println(name[i]);
		}
	}
	public void run()
	{
		m.append(name, size, age);
		display();
	}
}

public class Pariticipants_Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
		String name[] = new String[100];
		int age[] = new int[100];
		int size = 0;
		System.out.print("Enter the size : ");
		size = sc.nextInt();
		System.out.println("Enter the names and age : ");
		
		
		Participants p =(int sizeArray, String nameArray[], int ageArray[] )-> {
			IntStream.range(0, sizeArray).forEach
			( 
					i->{ nameArray[i] = sc.next(); 
						 ageArray[i] = sc.nextInt();}
			);
		};
		p.readData(size, name, age);
		
		Arrays.parallelSort(name, 0, size);
		
		MainThings m = new MainThings();
		ThreadOne_4 t1 = new ThreadOne_4(m, name, size);
		ThreadTwo_4 t2 = new ThreadTwo_4(m, name, size, age);
		t1.start();
		try 
		{
			t1.join();
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		t2.start();
		
		/*IntStream.range(0, size+1).forEach
		(
				i->{ System.out.print(name[i] + ", ");}
		);*/
	}
}
