package com.nissan.trainingcorejava;

import java.util.HashMap;
import java.util.Map;

public class TreeMap {

	public static void main(String[] args) {

		java.util.TreeMap<Integer, String> map = new java.util.TreeMap<Integer, String>();
		/* There are 2 interfaces for implementing map
		// 1. Map Interface	2. Sorted Map interface	( 2 interfaces )
				
		// 1. HashMap	2. LinkedHashMap 3. Tree HashMap ( 3 classes )	*/

		map.put(100,  "Amal");
		map.put(100,  "Neeraj");
		map.put(103,  "Dheeraj");
		map.put(102,  "Matthi");
		System.out.println(map);
		int size = map.size() ;
		
		for ( Map.Entry m : map.entrySet() )
		{
		System.out.println(m.getValue() + " " + m.getKey());
		}

	}

}
