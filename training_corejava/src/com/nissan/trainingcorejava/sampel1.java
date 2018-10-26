package com.nissan.trainingcorejava;

public class sampel1 { 
	public static void main( String[] args )
	{
		sampel1 t1= new sampel1();
		sampel1 t2= new sampel1();
		if ( !t1.equals(t2))
			System.out.print("Not");
		if ( t1 instanceof Object )
			System.out.println("Obje");
	}
	
}
