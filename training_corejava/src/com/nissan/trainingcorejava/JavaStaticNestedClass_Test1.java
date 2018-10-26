package com.nissan.trainingcorejava;


class JavaNestedClass {
	int a = 10;
	static int b = 10;
	static class StaticClass {
		public void nonStaticMethod() {
			System.out.println(b);
		}
		public void staticMethod() {
			System.out.println(b);
		}
	}
}

public class JavaStaticNestedClass_Test1 {

	public static void main(String[] args) {
		new JavaNestedClass.StaticClass().nonStaticMethod();
		new JavaNestedClass.StaticClass().staticMethod();
	}

}
