package com.nissan.trainingcorejava;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeClass {

	public static void main(String[] args) {
		Deque<String> d = new ArrayDeque<>();
		d.add("Rahul");
		d.add("Shankar");
		d.add("Shub");
		d.add("Akshay");
		d.addFirst("123");
		d.pollFirst();	// Removing First
		d.pollLast();	// Removing Last
		for ( String i : d )
		{
			System.out.println(i);
		}
	}

}
