package com.nissan.trainingcorejava;

public class TestForLoop {

	public static int getDecimal(String base)
	{
		String digits = "0123456789ABCDEF";  
        base = base.toUpperCase();  
        int val = 0;  
        for (int i = 0; i < base.length(); i++)  
        {  
            char c = base.charAt(i);  
            int d = digits.indexOf(c);  
            val = 16*val + d;  
        }  
        return val;  
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = {1,2,3,2,5,6,4,9,10,4,4};
		int flag = 0;
		String baseAddress = numbers  +"";
		System.out.println(baseAddress);
		int baseDec = getDecimal(baseAddress);
		for ( int i = 0; i < numbers.length; i++ )
		{
			flag = 1;
			for ( int j = 0; j < numbers.length; j++ )
			{
				if ( numbers[i] == numbers[j] && i!=j && flag == 1 && numbers[j] != 99999 && numbers[i] != 99999)
				{
					flag = 0;
					System.out.println(Long.parseLong( baseDec+Integer.toHexString(i*Integer.SIZE)));
					System.out.println(numbers[i] + " at " + i + " Memory location : " + Long.toHexString( Long.parseLong( baseDec+Integer.toHexString(i*Integer.SIZE)) ));
					System.out.println(numbers[j] + " at " + j + " Memory location : " + Long.toHexString( Long.parseLong( baseDec+Integer.toHexString(j*Integer.SIZE)) ));
					numbers[j] = 99999;
				}
				else if ( numbers[i] == numbers[j] && i!=j && flag == 0 && numbers[j] != 99999 && numbers[i] != 99999)
				{
					System.out.println(numbers[j] + " at " + j + " Memory location : " + Long.toHexString( Long.parseLong( baseDec+Integer.toHexString(j*Integer.SIZE)) ));
					numbers[j] = 99999;
				}
			}
			numbers[i] = 99999;
		}
	}

}
