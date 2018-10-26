/**
 * 
 */
package com.nissan.trainingcorejava;

/**
 * @author Arjun Padmanabhan
 *
 */
public class Studentdetails_two {
	int studentid;
	String studentname;
	
	public Studentdetails_two(int id, String name)
	{
		this.studentid = id;
		this.studentname = name;	// this keyword is used to reference the object
	}
	
	public void display()
	{
		System.out.println(studentid + " " + studentname);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studentdetails_two s = new Studentdetails_two(101,"ABC");
		s.display();
	}

}
