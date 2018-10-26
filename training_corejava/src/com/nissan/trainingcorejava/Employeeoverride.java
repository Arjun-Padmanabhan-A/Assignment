package com.nissan.trainingcorejava;

class Employee
{
	public int id, age;
	public String name;
	public void accept(int id,int age, String name)
	{
		this.id = id;
		this.name = name;
		this.age = age;
		System.out.println("Inside parent class");
	}
	public void display()
	{
		System.out.println(id + "  " + name + "  " + age);
	}
}

class Child extends Employee
{
	public void accept(int id,int age, String name)
	{
		this.id = id;
		this.name = name;
		this.age = age;
		System.out.println("Inside child class");
	}
	public void display()
	{
		System.out.println(id + "  " + name + "  " + age);
	}
}

public class Employeeoverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.accept(101, 10, "Child Employee");
		c.display();
		Employee e = new Employee();
		e.accept(105, 30, "Main Employee");
		e.display();
		
	}

}
