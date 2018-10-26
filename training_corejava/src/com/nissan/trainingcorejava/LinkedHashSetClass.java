package com.nissan.trainingcorejava;

import java.util.LinkedHashSet;

public class LinkedHashSetClass {

	public static void main(String[] args) {
		LinkedHashSet<String> l = new LinkedHashSet<>();
		l.add("abc");
		l.add("qwe");
		l.add("sdf");
		l.addAll(l);		//	Noduplicates
		
		for ( String i : l )
		{
			System.out.println(i);
		}
	}

}
