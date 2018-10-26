package com.nissan.trainingcorejava;

interface Reverse
{
	int reverseNumber( int a );
	interface Check
	{
		boolean checkPalindrome( int original, int reverse );
	}
	class asd{
		
	}
}

public class JavaInterface_Example2_Palindrome implements Reverse.Check, Reverse {

	public int reverseNumber( int a )
	{
		int flag = 0, res = 0, d;
		if ( a < 0 )
		{
			a = a*-1;
			flag = 1;
		}
		while ( a > 0 )
		{
			d = a % 10;
			res = res*10 + d;
			a = a / 10;
		}
		if ( flag == 1 )
			return res*-1;
		return res;
	}
	
	public boolean checkPalindrome( int original, int reverse )
	{
		if ( original == reverse )
			return true;
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse r = new JavaInterface_Example2_Palindrome();
		Reverse.Check rc = new JavaInterface_Example2_Palindrome();
		int original = 1211;
		int reverse = r.reverseNumber(original);
		if ( rc.checkPalindrome(original, reverse) )
		{
			System.out.println("It is palindrome");
		}
		else
			System.out.println("Not a palindrome");
	}

}
