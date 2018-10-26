package com.nissan.trainingcorejava;

public class StringClassMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "  Nissan1  ";
		
		System.out.println( "Char at 2nd index of " + a + " is " + a.charAt(2) );	//	Returns the char value at index 2( starting with 0 )
		
		System.out.println( "Length of \"" + a + "\" is " + a.length() );	//	Returns the length of the string ( total number of characters starting with 1 )
		
		System.out.println( "Formatted String : " + String.format("\"%s formatted string is %s\"", "The", a));
		
		System.out.println( "Substring between 1 and 3 of " + a + " is : " + a.substring(1, 3));	//	Substring between
																									//	starting and ending
		
		System.out.println( "Index of Ascii(97) in " + a + " is " + a.indexOf(97) );	// int as argument to indexOf
		
		
		System.out.println( "Index of is in " + a + " is " + a.indexOf("is") );		// Index of string
		
		System.out.println( "Lower case letters : " + a.toLowerCase() );	// To lower case letters

		System.out.println( "Upper case letters : " + a.toUpperCase() );	// To upper case letters
		
		System.out.println( "Trimming \"" + a + "\" gives : " + a.trim() ); //	Trimming
		
		System.out.println( "Concatinating \"The\" with \"" + a + " \" : " + a.concat("The") );
		
		System.out.println( "String joining : " + String.join("-", "I","love","my","India"));
		
		String blank = "";
		System.out.println( "String isEmpty of " + blank.isEmpty() );
		System.out.println( "String isEmpty of " + a + " " + a.isEmpty() );
	}

}
