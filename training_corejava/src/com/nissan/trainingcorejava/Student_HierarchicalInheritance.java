package com.nissan.trainingcorejava;

class Colleges
{
	int deptId, phone, age;
	String name;
	public void read( String name, int phone, int age, int deptId )
	{
		this.deptId = deptId;
		this.phone = phone;
		this.age = age;
		this.name = name;
	}
}

class Students extends Colleges
{
	int studentid;
	public void assignValues(int id, String name, int phone, int age, int deptid)
	{
		studentid = id;
		read(name, phone, age, deptid);
	}
	public void display()
	{
		System.out.println("Student");
		System.out.println(" Id : " + deptId );
		System.out.println(" Name : " + name );
		System.out.println(" Phone : " + phone );
		System.out.println(" Age : " + age );
	}
}

class Teacher extends Colleges
{
	int teacherId;
	public void assignValues(int id, String name, int phone, int age, int deptid)
	{
		teacherId = id;
		read(name, phone, age, deptid);
	}
	public void display()
	{
		System.out.println("Teacher");
		System.out.println(" Id : " + deptId );
		System.out.println(" Name : " + name );
		System.out.println(" Phone : " + phone );
		System.out.println(" Age : " + age );
	}
}

public class Student_HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s = new Students();
		s.assignValues(10, "studentname",1234, 11, 1);
		s.display();
		Teacher t = new Teacher();
		t.assignValues(10, "Teachername",1234, 11, 1);
		t.display();
	}

}
