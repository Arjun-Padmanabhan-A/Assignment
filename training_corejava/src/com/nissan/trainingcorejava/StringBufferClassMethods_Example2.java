package com.nissan.trainingcorejava;

public class StringBufferClassMethods_Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("");
		System.out.println(sb.capacity());
		sb = new StringBuffer("Nissan");
		System.out.println(sb.capacity());
		sb = new StringBuffer("NissanDigital");
		System.out.println(sb.capacity());
	}

}
