package com.nissan.trainingcorejava;

import java.util.Scanner;

abstract class Users
{
	String name, email;
	long accountNumber, phone;
	int pin;
	int accountType[] = {0,0,0,0};
}

enum type{
	Normal, Current, FD, RD 
}

class Accounts extends Users
{
	int balance, currBalance, fdBalance, rdBalance;
	void createAccount( String name, int pin, long acno, String mail, long phone )
	{
		this.name = name;
		this.pin = pin;
		this.accountNumber = acno;
		this.email = mail;
		this.phone = phone;
	}
	int searchAccount( String name, int pin, int actype[] )
	{
		if ( super.name.equals(name) && super.pin == pin )
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
	void createType( String typeofac )
	{
		this.accountType[type.valueOf(typeofac).ordinal()] = 1;
	}
}

public class ATMBanking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accounts[] acc = new Accounts[100];
		Scanner sc = new Scanner( System.in );
		int size = 0, choice = 0;
		String acname, acmail;
		int acpin, acpin2;
		long acno = 1000000000, phone;
		int actype[] = {0,0,0,0};
		
		while ( choice != 3 )
		{
			try
				{
				acpin = 1; acpin2 = 2;
				actype[0] = actype[1] = actype[2] = actype[3] = 0;
				System.out.println("\n1. Create User");
				System.out.println("2. Login");
				System.out.println("3. Exit");
				System.out.print("Enter your choice : ");
				choice = sc.nextInt();
				sc.nextLine();
				switch( choice )
				{
				case 1:
					System.out.print("Enter the name : ");
					acname = sc.nextLine();
					{
						int i;
						for ( i = 0; i < size; i++ )
						{
							if ( acc[i].search(acname) != -1 )
							{	
								System.out.println("\nAccount Name already exists. Try a different one.\nEnter b to go back.\n");
								System.out.print("Enter the name : ");
								acname = sc.nextLine();
								if ( acname.equals("b"))
									break;
								i = -1;
							}
						}
						if ( i == size )
						{
							while ( acpin != acpin2 )
							{
								System.out.print("Enter your pin(4 digits)[Press c to cancel editing] : ");
								if( sc.hasNextInt() )
									acpin = sc.nextInt();
								else
								{
									sc.nextLine();
									System.out.println("\nOnly digits are possible\n");
									continue;
								}
								System.out.print("Re-enter your pin : ");
								if ( sc.hasNextInt() )
									acpin2 = sc.nextInt();
								else
								{
									sc.nextLine();
									System.out.println("\nOnly digits are possible\n");
									continue;
								}
								sc.nextLine();
								if ( acpin != acpin2 )
									System.out.println( "\nThe pins do not match...\n" );
								else
								{
									if ( (int)Math.log10(acpin)+1 != 4 )
									{
										acpin = 1; acpin2 = 2;
										System.out.println("\nThe length of pin should be 4\n");
									}
								}
							}
							while( true )
							{
								int flag = 1;
								System.out.print("Enter the mail id : ");
								acmail = sc.nextLine();
								if ( acmail.matches("[A-Za-z0-9]+@[A-Za-z]+\\.[a-zA-Z]{2,}\\b") )
								{
									while( true )
									{
										System.out.print("Enter the phone number : ");
										phone = sc.nextLong();
										if ( (int)Math.log10(phone)+1 == 10 )
										{
											acc[size] = new Accounts();
											acc[size].createAccount(acname, acpin, acno++, acmail, phone);
											size++;
											flag = 0;
											break;
										}
										System.out.println("\nEnter a valid phone number(length should be 10)\n");
									}
									if ( flag == 0 )
										break;
								}
								System.out.println("\nEnter a valid mail id\n");
							}
						}
					}
					break;
				case 2:
					System.out.print("Enter your name : ");
					acname = sc.nextLine();
					System.out.print("Enter your pin : ");
					acpin = sc.nextInt();
					sc.nextLine();
					int i;
					for ( i = 0; i < size; i++ )
					{
						if ( acc[i].searchAccount(acname, acpin, actype) != -1 )
						{
							break;
						}
					}
					if ( i != size )
					{
						int choice3 = 0, k = 6;
						int j = 1;
						while ( j < k )
						{
							if ( actype[0] == 0 && actype[1] == 0 && actype[2] == 0 &&actype[3] == 0 )
							{
								System.out.println("Currently you have no accounts, Creating Normal Account");
								System.out.print("Enter your balance : ");
								int bal = sc.nextInt();
								sc.nextLine();
								acc[i].balance = bal;
								acc[i].accountType[0] = 1;
								actype[0] = 1;
							}
							else
							{
								
								while ( j < k )
								{
									j = 1;
									System.out.println();
									int c = 0, f = 0, r = 0;
									if ( actype[1] == 0 )
									{
										c = j;
										System.out.println(j++ + ". Create Current Account ");
									}
									if ( actype[2] == 0 )
									{
										f = j;
										System.out.println(j++ + ". Create FD ");
									}
									if ( actype[3] == 0 )
									{
										r = j;
										System.out.println(j++ + ". Create RD ");
									}
									System.out.println(j++ + ". Update Details ");
									System.out.println(j++ + ". Change Pin");
									System.out.println(j++ + ". Display Details");
									System.out.println(j++ + ". Exit ");
									k = j-1;
									System.out.print("Enter your choice : ");
									j = sc.nextInt();
									sc.nextLine();
									if ( j == k )
										break;
									if ( j <= k-4 )
									{
										System.out.print("Enter your balance : ");
										int bal = sc.nextInt();
										sc.nextLine();
										if ( c == j )
										{
											acc[i].accountType[1] = 1;
											acc[i].currBalance = bal;
											actype[1] = 1;
										}
										if ( f == j )
										{
											acc[i].accountType[2] = 1;
											acc[i].fdBalance = bal;
											actype[2] = 1;
										}
										if ( r == j )
										{
											acc[i].accountType[3] = 1;
											acc[i].rdBalance = bal;
											actype[3] = 1;
										}
									}
									if ( j == k-3 )
									{
										System.out.println("\n1. Update Mail Id\n2. Update Phone\n3. Update current\n4. Update FD\n5. Update RD\n6. Deposit\n7. Exit ");
										System.out.print("Enter your choice[Press b to goback] : ");
										int choice4 = 0;
										if ( !sc.hasNextInt() )
											if ( sc.next().equals("b") )
												break;
										choice4 = sc.nextInt();
										sc.nextLine();
										switch( choice4 )
										{
										case 1:
											while ( true )
											{
												System.out.print("Enter new mail id[Press b to goback] : ");
												acmail = sc.nextLine();
												if ( acmail.equals("b") )
													break;
												if ( acmail.matches("[A-Za-z0-9]+@[A-Za-z]+\\.[a-zA-Z]{2,}\\b") )
												{
													acc[i].email = acmail;
													System.out.println("\nUpdated...\n");
													break;
												}
												System.out.println("\nEnter a valid mail id\n");
											}
											break;
										case 2:
											while( true )
											{
												System.out.print("Enter the phone number[Press b to goback] : ");
												if ( sc.hasNextLong() )
												{
													phone = sc.nextLong();
													if ( (int)Math.log10(phone)+1 == 10 )
													{
														acc[i].phone = phone;
														break;
													}
													System.out.println("\nEnter a valid phone number(length should be 10)\n");
												}
												if ( sc.next().equals("b") ) 
													break;
											}
											break;
										case 3:
											if ( actype[1] == 0 )
											{
												System.out.println("You do not have a current account.. First, create one");
												break;
											}
											System.out.print("Enter the deposit[Press b to goback] : ");
											int bal = 0;
											if ( sc.hasNextInt() )
											{
												bal = sc.nextInt();
												sc.nextLine();
												acc[i].currBalance += bal;
											}
											else if ( sc.next().equals("b") )
												break;
											break;
										case 4:
											if ( actype[2] == 0 )
											{
												System.out.println("You do not have a fd account.. First, create one");
												break;
											}
											System.out.print("Enter the deposit[Press b to goback] : ");
											int bal1 = 0;
											if ( sc.hasNextInt() )
											{
												bal1 = sc.nextInt();
												sc.nextLine();
												acc[i].fdBalance += bal1;
											}
											else if ( sc.next().equals("b") )
												break;
											break;
										case 5:
											if ( actype[3] == 0 )
											{
												System.out.println("You do not have a rd account.. First, create one");
												break;
											}
											if ( acc[i].balance < 1000 )
											{
												System.out.println("No minimum balance in savings");
												break;
											}
											acc[i].balance -= 100;
											acc[i].rdBalance += 100;
											System.out.print("Enter the deposit[Press b to goback] : ");
											int bal2 = 0;
											if ( sc.hasNextInt() )
											{
												bal2 = sc.nextInt();
												sc.nextLine();
												acc[i].rdBalance += bal2;
											}
											else if ( sc.next().equals("b") )
												break;
											break;
										case 6:
											System.out.print("Enter the deposit[Press b to goback] : ");
											int bal3 = 0;
											if ( sc.hasNextInt() )
											{
												bal3 = sc.nextInt();
												sc.nextLine();
												acc[i].balance += bal3;
											}
											else if ( sc.next().equals("b") )
												break;
											break;
										case 7:
											break;
										}
									}
									if ( j == k-2 )
									{
										System.out.print("Enter your current pin : ");
										acpin = sc.nextInt();
										sc.nextLine();
										if ( acc[i].pin == acpin )
										{
											acpin = 1; acpin2 = 2;
											while ( acpin != acpin2 )
											{
												System.out.print("Enter a new pin[Press c to cancel] : ");
												if( sc.hasNextInt() )
													acpin = sc.nextInt();
												else
												{
													if ( sc.next().equals("c") )
														break;
													sc.nextLine();
													System.out.println("\nOnly digits are possible\n");
													continue;
												}
												System.out.print("Re-enter your pin[Press c to cancel] : ");
												if ( sc.hasNextInt() )
													acpin2 = sc.nextInt();
												else
												{
													if ( sc.next().equals("c") )
														break;
													sc.nextLine();
													System.out.println("\nOnly digits are possible\n");
													continue;
												}
												sc.nextLine();
												if ( acpin != acpin2 )
													System.out.println( "\nThe pins do not match...\n" );
												else
												{
													if ( (int)Math.log10(acpin)+1 != 4 )
													{
														acpin = 1; acpin2 = 2;
														System.out.println("\nThe length of pin should be 4\n");
													}
												}
											}
											if ( acpin == acpin2 )
											acc[i].pin = acpin;
										}
										else
										{
											System.out.println("\nYou entered wrong pin\n");
										}
									}
									if ( j== k-1 )
									{
										System.out.println("\nYour Name : " + acc[i].name);
										System.out.println("Bank Balance : " + acc[i].balance);
										System.out.println("Mail id : " + acc[i].email );
										System.out.println("Phone : " + acc[i].phone );
										if( acc[i].accountType[1] == 1 )
											System.out.println("Current Balance : " + acc[i].currBalance);
										if( acc[i].accountType[2] == 1 )
											System.out.println("FD Balance : " + acc[i].fdBalance);
										if( acc[i].accountType[3] == 1 )
											System.out.println("RD Balance : " + acc[i].rdBalance);
										System.out.println();
									}
								}
							}
						}
					}
					else
					{
						System.out.println("\nNo Account Found...\n");
					}
				}
			}
			catch(Exception e)
			{
				acname = ""; acpin = 0; acpin2 = 0;
				System.out.println(e);
			}
		}
	}
}