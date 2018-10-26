package com.nissan.trainingcorejava;

class Employee_One {
	Employee_One () {
		System.out.println("Constructor is called ");
	}
	public void create() {
		System.out.println("Creating Employee");
	}
	public void finalize() {
		System.out.println("Garbage Collected");
	}
}

public class Thread_Employee {

	public static void main(String[] args) {
		Employee_One e = new Employee_One();
		e.create();
		System.out.println(e);
		e = null;
		System.gc();
		e.create();
		System.out.println(e);
	}

}
