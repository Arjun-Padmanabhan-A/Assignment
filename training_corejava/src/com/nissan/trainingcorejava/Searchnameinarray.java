package com.nissan.trainingcorejava;

class SearchEmployee
{
	String[] names = new String[6];
	public void accept()
	{
		names[0] = "Arun";
		names[1] = "Amal";
		names[2] = "Aravind";
		names[3] = "Binu";
		names[4] = "Rahul";
		names[5] = "XYZ";
	}
	public int search(String name)
	{
		if ( names[0] == name )
			return 0;
		else if ( names[1] == name )
			return 1;
		else if ( names[2] == name )
			return 2;
		else if ( names[3] == name )
			return 3;
		else if ( names[4] == name )
			return 4;
		else if ( names[5] == name )
			return 5;
		return -1;
	}
}

public class Searchnameinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchEmployee s = new SearchEmployee();
		s.accept();
		if ( s.search("Amal") != -1 )
			System.out.println( "Found at index : " + s.search("Amal") );
		else
			System.out.println("Not found");
	}

}
