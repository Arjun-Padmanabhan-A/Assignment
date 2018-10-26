package com.nissan.trainingcorejava;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCollection {

	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<>();
		l.add("arjun");
		l.add("Pavi");
		l.add("devi");
		l.addAll(l);
		Iterator i = l.iterator();
		while ( i.hasNext() )
		{
			System.out.println(i.next());
		}
	}

}
