package com.nissan.trainingcorejava;

import java.util.PriorityQueue;

public class JavaPriorityQueue {

	public static void main(String[] args) {
		PriorityQueue<String> p = new PriorityQueue<>();
		p.add("Rahul");
		p.add("Manoj");
		p.add("Rekha");
		p.add("Benny");
		
		System.out.println("Head : " + p.peek() );
		p.remove();
		System.out.println("\nRemoving...\n");
		for ( String i : p )
		{
			System.out.println(i);
		}
	}

}
