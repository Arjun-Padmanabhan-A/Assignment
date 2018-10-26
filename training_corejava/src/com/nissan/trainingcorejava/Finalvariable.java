package com.nissan.trainingcorejava;

public class Finalvariable {

	final int speedlimit = 90;
	void run()
	{
		//speedlimit = 100;	// Final variables cannot be altered.
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finalvariable f = new Finalvariable();
		f.run();
	}

}
