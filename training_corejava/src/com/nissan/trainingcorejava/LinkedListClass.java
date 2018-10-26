package com.nissan.trainingcorejava;

import java.util.LinkedList;

public class LinkedListClass {

	public static void main(String[] args) {
		
		LinkedList<String> l = new LinkedList<>();
		l.add("abc");
		l.add("qwe");
		l.add("sdf");
		for ( String i : l )
		{
			System.out.println(i);
		}
	}

}
