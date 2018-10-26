package com.nissan.trainingcorejava;

public class StringBuilderClassMethods_Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Nissan");
		sb.append(" Digital");
		System.out.println((sb));
		
		sb.replace(1, 3, " hi ");
		System.out.println(sb);
		
		sb = new StringBuilder("NissanDigital");
		sb.delete(6, sb.length());
		System.out.println(sb);
		
		System.out.println(sb.capacity());
		
	}

}
