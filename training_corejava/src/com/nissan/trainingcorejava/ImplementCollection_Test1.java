package com.nissan.trainingcorejava;

import java.util.*;

class Customer_One
{
	ArrayList<String> name = new ArrayList<>();
	LinkedList<String> phone = new LinkedList<>();
	HashSet<String> age = new HashSet<>();
	LinkedHashSet<String> dob = new LinkedHashSet<>();
	
	void add(String name, String phone, String age, String dob)
	{
		this.name.add(name);
		this.phone.add(phone);
		this.age.add(age);
		this.dob.add(dob);
	}
	void addListName()
	{
		phone.addAll( name );
		for( String i : phone )
		{
			System.out.print( i + " ");
		}
	}
	void addListAge()
	{
		age.addAll(phone);
		for( String i : age )
		{
			System.out.print( i + " ");
		}
	}
	void addListDOB()
	{
		dob.addAll(age);
		for( String i : dob )
		{
			System.out.print( i + " ");
		}
	}
}

public class ImplementCollection_Test1 {

	public static void main(String[] args) {
		Customer_One c = new Customer_One();
		c.add("Arjun", "1234567", "22", "23-09-1996");
		c.add("Arjun1", "123456", "23", "24-09-1996");
		c.add("Arjun2", "12345", "24", "25-09-1996");
		c.add("Arjun3", "1234", "25", "26-09-1996");
		c.addListName();
		System.out.println();
		c.addListAge();
		System.out.println();
		c.addListDOB();
	}

}
