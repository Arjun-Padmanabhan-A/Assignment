package com.nissan.trainingcorejava;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraListWithForEach {

	public static void main(String[] args) {

		ArrayList<String> l = new ArrayList<>();
		l.add("arjun");
		l.add("Pavi");
		l.add("devi");
		l.addAll(l);
		for ( String list : l )
		{
			System.out.println(list);
		}
		System.out.println();
		l.forEach((n) -> System.out.println(n));
	}
}