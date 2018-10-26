package com.nissan.trainingcorejava;

import java.util.Scanner;

public class StringClassMethods_Test3_Customers {
	
	public static void swap( String array[], int i, int j )
	{
		String temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	public static void sort( String array[], int size )
	{
		for( int i = 0; i < size; i++ )
		{
			for ( int j = 0; j < size; j++ )
			{
				if ( array[i].compareTo(array[j]) < 0 )
					swap( array, i, j );
			}
		}
	}
	
	public static void display( String array[], int size )
	{
		for ( int i = 0; i < size; i++ )
			System.out.println(array[i]);
		System.out.println("\n");
	}
	
	public static int add( String list[], int size, String name )
	{
		list[size] = name;
		size++;
		return size;
	}
	
	public static int alreadyPresent(String list[], int size, String name)
	{
		for ( int i = 0; i < size; i++ )
		{
			if ( list[i].compareTo(name) == 0 )
				return i;
			//System.out.println(list[i]);
		}
		return -1;
	}
	
	public static int delete( String list[], int size, String name, int index )
	{
		for ( int i = index; i < size; i++ )
			list[i]= list[i+1];
		size = size - 1;
		return size;
	}
	
	public static int addSpecific( String list[], int size, int index, String name )
	{
		if ( index < size )
		{
			if ( list[index].isEmpty() )
			{
				list[index] = name;
				size++;
			}
			else
			{
				for ( int i = size; i > index; i-- )
				{
					list[i] = list[i-1];
				}
				list[index] = name;
				size++;
			}
			return size;
		}
		else if ( index == 0 && size == 0 )
		{
			list[index] = name;
			size++;
			return size;
		}
		return -1;
	}
	
	public static void editInfo( String list[], int size, String name, int index )
	{
		
	}

	public static void main(String[] args) 
	{
		String customerList[] = new String[100];
		String name;
		int count = 0, choice = 0,index = -1;

		Scanner sc = new Scanner( System.in );
		while ( choice != 5 )
		{
			System.out.println( "1. Add Customer\n2. Delete Customer\n3. Edit Customer\n4. Add at Specific index\n5. Exit" );
			System.out.print( "Enter your choice : ");
			choice = sc.nextInt();
			sc.nextLine();
			switch( choice )
			{
			case 1:
				System.out.print( "Enter the name to be added : " );
				name = sc.next();
				while ( alreadyPresent(customerList, count, name ) != -1 )
				{
					System.out.println( "That name already exists. Try giving your full name..." );
					System.out.print( "Enter the name to be added : " );
					name = sc.next();
				}
				count = add( customerList, count, name );
				break;
			case 2:
				System.out.print( "Enter the name to be deleted : " );
				name = sc.nextLine();
				System.out.println("Checking for : " + name + "/");
				while ( alreadyPresent(customerList, count, name ) == -1 )
				{
					System.out.println( "Name not present. Check your spelling..." );
					System.out.print( "Enter the name to be deleted : " );
					name = sc.next();
				}
				count = delete( customerList, count, name, alreadyPresent(customerList, count, name ) );
				break;
			case 3:
				System.out.print( "Enter the name to be edited : " );
				//String firstName2 = sc.next();
				//String lastName2 = sc.next();
				//name = firstName2 + lastName2;
				name = sc.nextLine();
				while ( alreadyPresent(customerList, count, name ) == -1 )
				{
					System.out.println( "Name not present. Check your spelling..." );
					System.out.print( "Enter the name to be edited : " );
					name = sc.nextLine();
				}
				int choice2 = 0;
				//while ( choice2 != 3 )
				{
					//while ( true )//customerList[alreadyPresent(customerList, count, name )].indexOf(" ") != -1 )
					{
						System.out.println( "1. Add/Edit Last Name\n2. Edit First Name\n3. Exit" );
						System.out.println( "Enter your choice : " );
						choice2 = sc.nextInt();
						sc.nextLine();
						switch( choice2 )
						{
						case 1:
							
							while( true ) 
							{	
								int indexOfSpace = customerList[alreadyPresent(customerList, count, name )].indexOf(" ");
								if ( indexOfSpace != -1 )
								{
									System.out.print( "Enter the last name : ");
									String lastName3 = sc.next();
									String firstName3 = customerList[alreadyPresent(customerList, count, name )].substring(0, indexOfSpace);
									if ( alreadyPresent(customerList, count, firstName3+" "+lastName3) != -1 )
									{
										System.out.println("That name already exists. Try giving another name...");
										continue;
									}
									customerList[alreadyPresent(customerList, count, name )] = firstName3 + " " + lastName3;
									break;
								}
								else
								{
									System.out.print( "Enter the last name : ");
									String lastName4 = " " + sc.next();
									if ( alreadyPresent(customerList, count, name+lastName4) != -1 )
									{
										System.out.println("That name already exists. Try giving another name...");
										continue;
									}
									customerList[alreadyPresent(customerList, count, name )] += lastName4;
									break;
								}
							}
							break;
						case 2:
						
							System.out.print( "Enter the first name : ");
							String firstName5 = sc.next();
							String lastName5 = "";
							while ( true )
							{
								if ( alreadyPresent(customerList, count, firstName5 ) != -1 )
								{
									System.out.print( "Name Already present. You can't edit your name to this\nEnter another name : ");
									firstName5 = sc.next();
									lastName5 = "";
								}
								else
								{
									int indexOfSpace1 = customerList[alreadyPresent(customerList, count, name )].indexOf(" ");
									if (indexOfSpace1 !=-1 )
									{
										lastName5 = customerList[alreadyPresent(customerList, count, name )].substring(indexOfSpace1);
										if ( alreadyPresent(customerList, count, firstName5+" "+lastName5 ) != -1 )
										{
											System.out.print( "Name Already present. You can't edit your name to this\nEnter another name : ");
											firstName5 = sc.next();
											lastName5 = "";
											continue;
										}
									}
									break;
								}
							}
							if ( !lastName5.equals("")  )
								customerList[alreadyPresent(customerList, count, name )] = firstName5 + " " + lastName5;
							else
								customerList[alreadyPresent(customerList, count, name )] = firstName5;
							break;
						case 3:
							break;
						}
					}
				}
				break;
			case 4:
				index = -1;
				while( index < 0 || index >= count )
				{
					System.out.println(" The specific index should be less than the current size of array.. "+ count);
					System.out.print( "Enter the specific index ( >= 0 ) : ");
					index = sc.nextInt();
					sc.nextLine();
				}
				System.out.print( "Enter the name to be added : " );
				name = sc.nextLine();
				while ( alreadyPresent(customerList, count, name ) != -1 )
				{
					System.out.println( "That name already exists. Try giving your full name..." );
					System.out.print( "Enter the name to be added : " );
					name = sc.nextLine();
				}
				int tempCount = addSpecific( customerList, count, index, name);
				if ( tempCount == -1 )
				{
					
				}
				else
					count = tempCount;
				break;
			case 5:
				break;
			default:
				System.out.println( "Invalid Input. Please select a valid one" );
			}
			System.out.println("\nBefore Sorting");
			display( customerList, count );
			System.out.println("After Sorting");
			sort( customerList, count );
			display( customerList, count );
		}
		sc.close();
	}
}
