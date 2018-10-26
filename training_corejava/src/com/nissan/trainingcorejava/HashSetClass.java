package com.nissan.trainingcorejava;

import java.util.HashSet;

public class HashSetClass {

	public static void main(String[] args) {
		HashSet<String> l = new HashSet<>();
		l.add("abc");
		l.add("qwe");
		l.add("sdf");
		//l.addAll(l);
		
		for ( String i : l )
		{
			System.out.println(i);
		}
	}

}
