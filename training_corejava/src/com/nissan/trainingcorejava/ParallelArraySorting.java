package com.nissan.trainingcorejava;

import java.util.Arrays;

public class ParallelArraySorting {

	public static void main(String[] args) {
		int a[] = {5,1,6,10,50,2,5,1,3,130,230,8};
		System.out.println("Unsorted Array");
		System.out.println(Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("Sorted Array");
		for ( int i : a )
		{
			System.out.print(i + ", ");
		}
	}

}
