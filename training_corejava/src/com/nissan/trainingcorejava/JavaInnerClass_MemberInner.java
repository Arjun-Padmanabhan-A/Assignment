package com.nissan.trainingcorejava;

public class JavaInnerClass_MemberInner 
{
	private int dataValue = 100;
	
	class Inner
	{
		Inner()
		{
			
		}
		public void message()
		{
			System.out.print("Value is : " + dataValue );
		}
	}
	public static void main(String[] args) 
	{
		JavaInnerClass_MemberInner obj = new JavaInnerClass_MemberInner();
		JavaInnerClass_MemberInner.Inner in = obj.new Inner();
		in.message();
	}
}
