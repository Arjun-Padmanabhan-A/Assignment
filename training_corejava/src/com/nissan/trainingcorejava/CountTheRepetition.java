package com.nissan.trainingcorejava;

class Counter
{
	int i;
	public Counter()
	{
		i = 0;
	}
	
	public int value()
	{
		return i;
	}
}

class Names extends Counter
{
	String[] names = new String[20];
	public Names(String names[])
	{
		for ( int i = 0; i < names.length; i++ )
		{
			this.names[i] = names[i];
		}
	}
	public int search(String name)
	{
		for( int i = 0; i < this.names.length; i++)
		{
			if( names[i] == name )
				super.i++;
		}
		return super.value();
	}
}

public class CountTheRepetition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[] = {"Amal","Arjun","Surya","Amal","Arjun","Pavi","Arjun"};
		Names n = new Names(names);
		System.out.println( n.search("Arjun") );
	}

}
