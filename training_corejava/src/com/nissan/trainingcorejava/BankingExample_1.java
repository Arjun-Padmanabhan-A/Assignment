package com.nissan.trainingcorejava;

import java.util.Scanner;

abstract class Bank
{
	float r;
	public Bank() {
		// TODO Auto-generated constructor stub
		r = 0;
	}
	void loan( float amount, float bal, int yr ) {};
}


class Account extends Bank
{
	String userName, pin;
	int accountType;
	double balance;
	int fixedDeposit;
	Account()
	{
		accountType = 0;
		balance = 0;
		fixedDeposit = 0;
	}
	void storeNameAndPin(String name, String pin, float balance)
	{
		this.userName = name;
		this.pin = pin;
		this.balance = balance;
	}
	boolean searchUser(String name, String pin )
	{
		if ( this.userName.equals(name) && this.pin.equals(pin) )
			return true;
		return false;
	}
	void readValues( double balance )
	{
		//this.accountType = type;
	}
	void deposit( float amount )
	{
		balance += amount;
	}
}

class LoanOnCurrent extends Account
{
	public LoanOnCurrent() {
		// TODO Auto-generated constructor stub
		r = 20;
	}
	void loan( float amount, float balance, int yr )
	{
		System.out.println("Rate of interest is : " + r);
		if ( super.balance > 20000 )
		{
			System.out.println("Principal Amount : " + (super.balance+((amount*r*yr)/100)));
			System.out.println("Interest : " + (amount*r*yr)/100);
		}
		else
		{
			System.out.println("Not Possible.. Minimum balance of 20000 not present");
		}
	}
}

class LoanOnFixedDeposit extends Account
{
	public LoanOnFixedDeposit() {
		// TODO Auto-generated constructor stub
		r = 10;
	}
	void loan( float amount, float fixedDeposit, int yr )
	{
		System.out.println("Rate of interest is : " + r);
		if ( amount > (2*fixedDeposit ) )
		{
			System.out.println("Not Possible.. You can't apply for loan for more than twice your fixed deposit");
		}
		else
		{
			System.out.println("Principal Amount : " + fixedDeposit+(amount*r*yr)/100);
			System.out.println("Interest : " + (amount*r*yr)/100);
		}
	}
}


public class BankingExample_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5, choice=0;
		//Account[] a = new Account[100];
		LoanOnCurrent[] curr = new LoanOnCurrent[5];
		LoanOnFixedDeposit[] dep = new LoanOnFixedDeposit[5];
		
		for ( i = 0; i < 5; i++ )
		{
			//a[i] = new Account();
			curr[i] = new LoanOnCurrent();
			dep[i] = new LoanOnFixedDeposit();
		}
		
		curr[0].storeNameAndPin("Pappu", "123",10000);
		curr[1].storeNameAndPin("Pavi", "456",20000);
		curr[2].storeNameAndPin("Matthi", "196",30000);
		curr[3].storeNameAndPin("Amal", "456",40000);
		curr[4].storeNameAndPin("Dheeran", "234",20000);
		dep[0].storeNameAndPin("Pappu", "123",10000);
		dep[1].storeNameAndPin("Pavi", "456",20000);
		dep[2].storeNameAndPin("Matthi", "196",30000);
		dep[3].storeNameAndPin("Amal", "456",40000);
		dep[4].storeNameAndPin("Dheeran", "234",20000);
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Enter your name : ");
		//String name = "Arjun";
		//String pin = "123";
		String name = sc.next();
		System.out.println("Enter your pin : ");
		String pin = sc.next();
		for ( i = 0; i < 5; i++ )
		{
			if ( curr[i].searchUser( name, pin ) )
			{
				System.out.println("Account Found");
				break;
			}
			else if( dep[i].searchUser( name, pin ) )
			{
				break;
			}
		}
		if ( i != 5 )
		{
			System.out.println("Which Loan do you prefer : ");
			System.out.println("1. Loan on Current Deposit\n2. Loan on Fixed Deposit\n3. Normal Loan\n4. Deposit\n5. Create\n6. Exit ");
			choice = sc.nextInt();
			if( choice == 1 )
			{
				//System.out.println("Enter your balance : " );
				//float bal = sc.nextInt();
				System.out.println("Enter the amount : ");
				float amt = sc.nextInt();
				System.out.println("Year : ");
				int yr = sc.nextInt();
				curr[i].loan(amt,0,yr);
			}
			if ( choice == 2 )
			{
				System.out.println(" Enter your fixed deposit : ");
				float fd = sc.nextInt();
				System.out.println("Enter the amount : ");
				float amt = sc.nextInt();
				System.out.println("Year : ");
				int yr = sc.nextInt();
				dep[i].loan(amt,fd,yr);
			}
			if ( choice == 3 )
			{
				NormalLoan n = new NormalLoan();
				System.out.println("Enter the amount : ");
				float amt = sc.nextInt();
				System.out.println("Year : ");
				int yr = sc.nextInt();
				n.loan(amt,yr);
			}
			if ( choice == 4)
			{
				System.out.println("Enter the amount : ");
				float amt = sc.nextInt();
				curr[i].deposit(amt);
				dep[i].deposit(amt);
			}
		}
		else
		{
			System.out.println(name + "\n" + pin);
		}
	}

}