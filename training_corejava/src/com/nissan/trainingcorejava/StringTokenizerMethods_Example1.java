package com.nissan.trainingcorejava;

import java.util.*;

public class StringTokenizerMethods_Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer("My Name is Nissan"," ");	// Deprecated Method
		while ( st.hasMoreTokens() )
		{
			System.out.println(st.nextToken());
		}
	}

}
