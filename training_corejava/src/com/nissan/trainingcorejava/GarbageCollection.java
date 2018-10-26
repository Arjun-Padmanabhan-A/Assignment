package com.nissan.trainingcorejava;

public class GarbageCollection {

	public GarbageCollection() {
		System.out.println("Constructor");
	}
	public void finalize() {
		System.out.println("Garbage Collected");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GarbageCollection s1 = new GarbageCollection();
		GarbageCollection s2 = new GarbageCollection();
		s1=null;
		s2 = null;
		System.gc();
		s1 = new GarbageCollection();
		
	}

}
