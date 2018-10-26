package com.nissan.trainingcorejava;

import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {
		TreeSet<String> t = new TreeSet<String>();
		t.add("Rahul");
		t.add("Ben");
		t.add("Harry");
		
		for ( String i : t )
		{
			System.out.println(i);
		}
	}

}
