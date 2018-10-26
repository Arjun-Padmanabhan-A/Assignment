package com.nissan.trainingcorejava;

import java.util.Scanner;

abstract class Users1
{
	String name, email;
	int pin;
	float balance;
	int accountType[] = {0,0};
	int r;
	Users1()
	{
		balance = 0;
		r = 0;
	}
	abstract void loan( float amt, int yr, int a ) ;
	public Users1( String name, int pin )
	{
		this.name = name;
		this.pin = pin;
	}
	int searchAccount( String name, int pin, int actype[] )
	{
		if ( this.name.equals(name) && this.pin == pin )
		{
			System.arraycopy(this.accountType, 0, actype, 0, this.accountType.length);
			return 1;
		}
		return -1;
	}
	int search( String name )
	{
		if ( this.name.equals(name) )
			return 1;
		return -1;
	}

	void deposit( float amt )
	{
		balance += amt;
	}
}

class LoanOnFD extends Users1
{
	public LoanOnFD() {
	}
	
	public LoanOnFD( String name, int pin )
	{
		super( name, pin );
		super.accountType[1] = 1;
	}
	void loan( float amount, int yr, int fixedDeposit )
	{
		r = 10;
		System.out.println("Rate of interest : " + r);
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
	public int checkFD( String name, int pin )
	{
		if ( this.name.equals(name) && this.pin == pin )
			return 1;
		return -1;
	}
}

class LoanOnCA extends Users1
{
	public LoanOnCA() 
	{	
	}
	public LoanOnCA( String name, int pin )
	{
		super( name, pin );
		super.accountType[0] = 1;
	}
	void loan( float amt, int yr, int balance )
	{
		r = 20;
		System.out.println("Rate of interest : " + r);
		if ( super.balance > 20000 )
		{
			System.out.println("Principal Amount : " + (super.balance+((amt*r*yr)/100)));
			System.out.println("Interest : " + (amt*r*yr)/100);
		}
		else
		{
			System.out.println("Not Possible.. Minimum balance of 20000 not present");
		}
	}
	public int checkCA( String name, int pin )
	{
		if ( this.name.equals(name) && this.pin == pin )
			return 1;
		return -1;
	}
}


class NormalLoan extends Account
{
	public NormalLoan() {
		// TODO Auto-generated constructor stub
		r = 27;
	}
	void loan( float amount, int yr )
	{
		System.out.println("Rate of interest is : " + r);
		System.out.println("Principal Amount : " + amount*r*yr);
		System.out.println("Interest : " + amount*r*yr);
	}
}

public class LoanBank_Test1 {

	public static void main(String[] args) {
		LoanOnFD[] f = new LoanOnFD[100];
		LoanOnCA[] c = new LoanOnCA[100];
		int fdAccount = 0, caAccount = 0;
		int choice = 0, i, flag = 0, pin = 0;
		String name="";
		
		Scanner sc = new Scanner(System.in);
		while ( choice != 4 )
		{
			System.out.println("\n 1. Create Current Account \n 2. Create FD\n 3. Login\n 4. Exit");
			System.out.println("(At any screen other than menu screens, press b to goback)");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			if ( choice == 1 )
			{
				System.out.print("Enter the username : "  );
				name = sc.next();
				
				if ( name.equals("b") )
					continue;
				System.out.print("Enter the pin : ");
				if ( sc.hasNextInt() )
					pin = sc.nextInt();
				else if ( sc.next().equals("b") )
					continue;
				sc.nextLine();
				int k = 0;
				for ( k = 0; k < caAccount; k++ )
				{
					if ( c[k].checkCA( name, pin ) == 1 )
					{
						System.out.println("\nYou already have a current account. Try logging in...");
						break;
					}
				}
				if ( k != caAccount )
					continue;
				for ( k = 0; k < fdAccount; k++ )
				{
					if ( f[k].checkFD( name, pin ) == 1 )
					{
						f[k].accountType[0] = 1;
						break;
					}
				}
				if ( k == fdAccount )
				{
					c[caAccount] = new LoanOnCA( name, pin );
					caAccount++;
				}
			}
			if ( choice == 2 )
			{
				System.out.print("Enter the username : "  );
				name = sc.next();
				
				if ( name.equals("b") )
					continue;
				System.out.print("Enter the pin : ");
				if ( sc.hasNextInt() )
					pin = sc.nextInt();
				else if ( sc.next().equals("b") )
					continue;
				sc.nextLine();
				int k = 0;
				for ( k = 0; k < fdAccount; k++ )
				{
					if ( f[k].checkFD( name, pin ) == 1 )
					{
						System.out.println("\nYou already have a FD. Try logging in...\n");
						break;
					}
				}
				if ( k != fdAccount )
					continue;
				for ( k = 0; k < caAccount; k++ )
				{
					if ( c[k].checkCA( name, pin ) == 1 )
					{
						c[k].accountType[1] = 1;
						break;
					}
				}
				if ( k == caAccount )
				{
					f[fdAccount] = new LoanOnFD( name, pin );
					fdAccount++;
				}
			}
			if ( choice == 3 )
			{
				flag = 0;
				int actype[] = {0, 0};
				System.out.print("Enter the username : " );
				name = sc.next();
				if ( name.equals("b") )
					continue;
				System.out.print("Enter the pin : ");
				if ( sc.hasNextInt() )
					pin = sc.nextInt();
				else if ( sc.next().equals("b") )
					continue;
				sc.nextLine();
				int j = 0;
				for ( j = 0; j < fdAccount; j++ )
				{
					if ( f[j].searchAccount( name, pin, actype ) != -1 )
					{
						flag = 1;
						break;
					}
				}
				for ( j = 0; j < caAccount; j++ )
				{
					if ( c[j].searchAccount( name, pin, actype ) != -1 )
					{
						flag = 2;
						break;
					}
				}
				if ( flag == 0 )
				{
					System.out.println("\nNo Account Found\n");
					continue;
				}
				else
				{
					int choice2 = 0, yr;
					float amt;
					while( choice2 != 6 )
					{
						System.out.println("\nWhich Loan do you prefer : ");
						System.out.println("1. Loan on Current Deposit\n2. Loan on Fixed Deposit\n3. Normal Loan\n4. Deposit\n5. Create\n6. Exit ");
						System.out.print("Enter your choice : ");
						choice2 = sc.nextInt();	sc.nextLine();
						switch( choice2 )
						{
						case 1:
							if ( actype[0] == 0 )
							{
								System.out.println("\nYou do not have a current account\n");
								continue;
							}
							System.out.print("Enter the amount : ");
							amt = sc.nextInt();
							System.out.print("Year : ");
							yr = sc.nextInt();
							if ( flag == 1 )
								f[j].loan(amt, yr, 0);
							else
								c[j].loan(amt, yr, 0);
							break;
						case 2:
							if ( actype[1] == 0 )
							{
								System.out.println("You do not hace FD");
								continue;
							}
							System.out.print("Enter the fixed deposit : ");
							amt = sc.nextInt();
							System.out.print("Year : ");
							yr = sc.nextInt();
							if ( flag == 1 )
								f[j].loan(amt, yr, 0);
							else
								c[j].loan(amt, yr, 0);
							break;
						case 3:
							NormalLoan n = new NormalLoan();
							System.out.print("Enter the amount : ");
							amt = sc.nextInt();
							System.out.println("Year : ");
							yr = sc.nextInt();
							n.loan(amt,yr);
							break;
						case 4:
							System.out.print("Enter the amount : ");
							float amt2 = sc.nextInt();
							if ( flag == 1 )
								f[j].deposit(amt2);
							else
								c[j].deposit(amt2);
							break;
						case 6:
							break;
						default:
							System.out.println("\nEnter a valid choice\n");
						}
					}
				}
			}
		}
	}
}