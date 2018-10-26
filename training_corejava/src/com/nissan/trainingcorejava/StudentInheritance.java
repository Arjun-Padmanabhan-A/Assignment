package com.nissan.trainingcorejava;

class College
{
	int stdid, phone, age;
	public void read( int id,int phone, int age )
	{
		this.stdid = id;
		this.phone = phone;
		this.age = age;
	}
}

class Student extends College
{
	public void assignValues(int id, int phone, int age)
	{
		read(id,phone,age);
	}
	public void display()
	{
		System.out.println(" Id : " + stdid );
		System.out.println(" Phone : " + phone );
		System.out.println(" Age : " + age );
	}
}

public class StudentInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.assignValues(10, 1234, 11);
		s.display();
	}

}
