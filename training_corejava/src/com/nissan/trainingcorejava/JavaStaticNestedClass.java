package com.nissan.trainingcorejava;

class StaticNestedClass {
	static int memberValue = 100;
	int a = 10;
	static class InnerClass {
		void displayValue() {
			System.out.println(" Value is : " + memberValue );
		}
	}
}

public class JavaStaticNestedClass {

	public static void main(String[] args) {
		new StaticNestedClass.InnerClass().displayValue();
	}
}
