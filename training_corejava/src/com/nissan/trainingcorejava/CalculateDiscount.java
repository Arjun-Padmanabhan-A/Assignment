package com.nissan.trainingcorejava;

class Person
{
	int id, age;
	String name;
	Person()
	{
		id = 101;
		age = 20;
		name = "Aromal";
	}
}

class Salary extends Person
{
	long salary;
	Salary( long sal )
	{
		salary = sal;
	}
	public void calcDiscount()
	{
		System.out.println("Name : " + name);
		System.out.println("Id : " + id);
		System.out.println("Age : " + age);
		System.out.println("Salary : " + salary);
		System.out.println("Discount : " + (salary+((age/100.0f)*salary)));
	}
}

public class CalculateDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salary s = new Salary(10000);
		s.calcDiscount();
	}

}
