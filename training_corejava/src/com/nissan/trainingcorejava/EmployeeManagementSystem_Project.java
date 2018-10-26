package com.nissan.trainingcorejava;

/*
 * Employee Management System
 * --------------------------
 * Author - Arjun Padmanabhan A
 * Steps :
 * 1. Create a folder named EmployeeManagement in D:\
 * 2. Within that folder, create files containing the 
 * 	  regulations for each department.
 * 3. Eg. For SALES Department, create a text file named Sales
 *        and fill it up with the regulations for SALES department.
 * 4. Similarly, create separate files for each department.
 * 5. Then execute this program.
 * 6. The comments of each user will be saved in the same directory 
 * 	  with file name as Comments.txt
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

abstract class Admin
{
	final String folder = "D:\\EmployeeManagement\\";
	FileInputStream fRegulations;
	FileOutputStream fComments;
	Admin()
	{
		try
		{
			File del = new File("D:\\EmployeeManagement\\Comments.txt");
			if ( del.exists() )
				del.delete();
		}
		catch( Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public String readRegulations( String dept )
	{
		String regulations = "";
		try
		{
			fRegulations = new FileInputStream(folder + dept + ".txt" );
			Scanner sc = new Scanner( fRegulations );
			while ( sc.hasNext() )
			{
				regulations += sc.nextLine() + "\n";
			}
			fRegulations.close();
		}
		catch( Exception e )
		{
			System.out.println(e.getMessage());
		}
		return regulations;
	}
	public void writeComments( String dept, String name, String comments )
	{
		try
		{
			 fComments = new FileOutputStream("D:\\EmployeeManagement\\Comments.txt", true);
			 BufferedWriter br = new BufferedWriter( new OutputStreamWriter( fComments ) ) ;
			 br.write(dept + " - " + name);
			 br.newLine();
			 br.write("-----------------");
			 br.newLine();
			 br.write("Comments : " + comments);
			 br.newLine();
			 br.newLine();
			 br.close();
		}
		catch( Exception e )
		{
			System.out.println(e.getMessage());
		}
	}
}

class Users_One
{
	String userName;
	String comments;
	Users_One( String name )
	{
		userName = name;
	}
	public String readComment()
	{
		return "";
	}
	public String getUserName()
	{
		return userName;
	}
	public String sendAndReadComments( String regulations )
	{
		Scanner sc = new Scanner( System.in );
		System.out.println( "\n" + userName + "'s regulations are\n" + regulations );
		System.out.print("Enter your comment : ");
		return sc.nextLine();
	}
}

class Departments extends Admin
{
	String name;
	int userSize;
	Users_One u[];
	Departments( String name )
	{
		super();
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void readUsers( int size )
	{
		Scanner sc = new Scanner( System.in );
		this.userSize = size;
		 u = new Users_One[size];
		System.out.print("Enter the user names : ");
		for ( int i = 0; i < size; i++ )
		{
			u[i] = new Users_One( sc.nextLine() );
		}
	}
	public void sendRegulations()
	{
		String regulations = readRegulations( name );
		for ( int i = 0; i < userSize; i++ )
		{
			writeComments( name, u[i].getUserName(), u[i].sendAndReadComments( regulations ) );
		}
	}
}

public class EmployeeManagementSystem_Project 
{
	public static ArrayList<String> readFileNames( File folder )
	{
		ArrayList<String> fileNames = new ArrayList<>();
		for( File files : folder.listFiles() )
		{
			if ( files.isFile() )
				fileNames.add( files.getName() );
		}
		return fileNames;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner( System.in );
		File folder = new File("D:\\EmployeeManagement");
		ArrayList<String> files = new ArrayList<>();
		files = readFileNames( folder );
		int size = files.size(), i = 0;
		Departments dept[] = new Departments[size];
		files.remove("Comments.txt");
		Iterator<String> fileNames = files.iterator();
		while ( fileNames.hasNext() )
		{
			String temp = fileNames.next().toString();
			while( true )
			{
				dept[i] = new Departments( temp.substring(0, temp.indexOf(".")) );
				System.out.print("Enter the number of users in '" + dept[i].getName().toUpperCase() + "' : ");
				String no = sc.next();
				try
				{
					if ( Integer.parseInt( no ) <= 0 )
					{
						System.out.println("Enter a valid count\n");
						continue;
					}
					dept[i].readUsers( Integer.parseInt( no ) );
					i += 1;
					break;
				}
				catch( Exception e )
				{
					System.out.println("Enter only the count\n");
				}
			}
		}
		sc.nextLine();
		
		for ( int j = 0; j < i; j++ )
		{
			dept[j].sendRegulations();
		}
		
		sc.close();
	}
}

