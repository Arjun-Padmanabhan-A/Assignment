package com.nissan.trainingcorejava;

interface Writable
{
	void write();
	interface Readable
	{
		void read();
	}
}

public class JavaInterface_Example2 implements Writable.Readable, Writable{
	
	public void write()
	{
		System.out.println("Write Method");
	}
	public void read()
	{
		System.out.println("Read Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaInterface_Example2 j = new JavaInterface_Example2();
		j.write();
		j.read();

		Writable.Readable w = new JavaInterface_Example2();	//Upcasting
		w.read();
		Writable w2 = new JavaInterface_Example2();
		w2.write();
	}

}
