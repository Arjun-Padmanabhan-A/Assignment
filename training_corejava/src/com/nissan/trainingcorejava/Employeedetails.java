package com.nissan.trainingcorejava;

public class Employeedetails {

	int employeeid;
	long phonenumber;
	int age;
	String name, email;
	public Employeedetails( int id, String name, String email, int age, long phone )
	{
		this.employeeid = id;
		this.age = age;
		this.phonenumber = phone;
		this.name = name;
		this.email = email;
		System.out.println(display(age));
		System.out.println(display(phonenumber));
	}
	public long display( long phone )
	{
		return employeeid+phone; 
	}
	public long display( int age )
	{
		return employeeid+age;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 10;
		long phone = 1234567;
		Employeedetails e = new Employeedetails(101, "Arun", "xyz@gmail.com", age, phone);
		
	}

}
