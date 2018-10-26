package com.nissan.trainingcorejava;

abstract class Customer {
	abstract void names();
}

class Customer1 {

	public void asd() {
	}
	
}

public class JavaInnerClass_AnonymousInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c = new Customer()	{
			public void names() {
				System.out.println("Customer name is ABC ");
			}
		};
		c.names();
		Customer1 o = new Customer1() {
			public void asd() {
				System.out.println("Hello");
			}
		};
		o.asd();
	}

}
