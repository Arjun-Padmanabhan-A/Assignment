package com.nissan.trainingcorejava;

public class StringBufferClassMethods_Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Nissan");
		sb.append(" Digital");
		System.out.println((sb));
		
		sb.replace(1, 3, " hi ");
		System.out.println(sb);
		
		sb = new StringBuffer("NissanDigital");
		sb.delete(6, sb.length());
		System.out.println(sb);
		
		System.out.println(sb.capacity());
		
	}

}
