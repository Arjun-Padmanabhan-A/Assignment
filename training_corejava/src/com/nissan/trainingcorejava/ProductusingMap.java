package com.nissan.trainingcorejava;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.*;

public class ProductusingMap {
	
	static HashMap<Integer, String> products = new HashMap<>();
	//static HashMap<String, Integer> specs = new HashMap<>();
	static Scanner sc = new Scanner( System.in );
	static int count = 1000;
	static ArrayList<String> cart = new ArrayList<>();
	
	public static void add()
	{
		String name;
		int price;
		
		System.out.print("Enter the product name : ");
		name = sc.nextLine();
		while ( true )
		{
			System.out.print("Enter the product price : ");
			if ( sc.hasNextInt() )
			{
				price = sc.nextInt();
				sc.nextLine();
				break;
			}
			else
			{
				System.out.println("Only digits Expected");
				continue;
			}
		}
		products.put(count++, name + " " + price);
	}
	
	public static void remove()
	{
		int id;
		System.out.println(products);
		while( true )
		{
			System.out.print("Enter the id : ");
			if ( sc.hasNextInt() )
			{
				id = sc.nextInt();
				sc.nextLine();
				break;
			}
			else
			{
				System.out.println("Only digits Expected");
				continue;
			}
		}
		products.remove(id);
		System.out.println(products);
	}
	
	public static void edit()
	{
		int id, price;
		System.out.println(products);
		while ( true )
		{
			System.out.print("Enter the id : ");
			if ( sc.hasNextInt() )
			{
				id = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter the price : ");
				if ( sc.hasNextInt() )
				{
					price = sc.nextInt();
					sc.nextLine();
					break;
				}
				else
				{
					continue;
				}
			}
			else
			{
				System.out.println("Only digits Expected");
				continue;
			}
		}
		String name = "";
		for ( Map.Entry m : products.entrySet() )
		{
			if ( m.getKey().equals(id) )
			{
				name = m.getValue().toString();
				break;
			}
		}
		products.remove(id);
		products.put(id, name.subSequence(0, name.indexOf(" ")) + " " + price);
	}
	
	public static void buy()
	{
		int id;
		while( true )
		{
			System.out.println(products);
			System.out.print("Enter the id : ");
			if ( sc.hasNextInt() )
			{
				id = sc.nextInt();
				sc.nextLine();
				break;
			}
			else
			{
				System.out.println("Only digits Expected");
				continue;
			}
		}
		for ( Map.Entry m : products.entrySet() )
		{
			if ( m.getKey().toString().equals(id+"") )
				cart.add(m.getValue().toString());
		}
		System.out.println("Cart : " + cart);
	}
	
	public static void user()
	{
		int choice = 0;
		while ( choice != 2 )
		{
			System.out.print("1. Buy\n2. Exit\nEnter your choice : ");
			if ( sc.hasNextInt() )
			{
				choice = sc.nextInt();
				sc.nextLine();
			}
			else
			{
				System.out.println("Only digits Expected");
				continue;
			}
			switch( choice )
			{
			case 1:
				buy();
				break;
			case 2:
				return;
			default:
				System.out.println("Enter a valid option!!!");
			}
		}
	}
	
	public static void admin()
	{
		int choice  = 0;
		while ( choice != 4 )
		{
			System.out.print("1. Add Product\n2. Remove Product\n3. Edit Price\n4. Exit\nEnter your choice : ");
			if ( sc.hasNextInt() )
			{
				choice = sc.nextInt();
				sc.nextLine();
			}
			else
			{
				System.out.println("Only digits Expected");
				continue;
			}
			switch( choice )
			{
			case 1:
				add();
				break;
			case 2:
				remove();
				break;
			case 3:
				edit();
				break;
			case 4:
				return;
			default:
				System.out.println("Enter a valid option!!!");
			}
		}
	}
	
	public static void mainMenu()
	{
		int choice = 0;
		while ( choice != 3 )
		{
			System.out.print("1. Admin\n2. User\n3. Exit\nEnter your choice : ");
			if ( sc.hasNextInt() )
			{
				choice = sc.nextInt();
				sc.nextLine();
			}
			else
			{
				System.out.println("Only digits Expected");
				continue;
			}
			switch( choice )
			{
			case 1:
				admin();
				break;
			case 2:
				user();
				break;
			case 3:
				return;
			default:
				System.out.println("Enter a valid option");
			}
		}
	}
	
	public static void main(String[] args) {
		mainMenu();
		try
		{
			FileOutputStream fout = new FileOutputStream("D:\\productCart.txt");
			BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(fout));
			for (int i = 0; i < cart.size(); i++) 
			{
				System.out.println(cart.get(i));
				bw1.write(cart.get(i));
				bw1.newLine();
			}
			bw1.close();
			fout.close();
			
			FileOutputStream fout1 = new FileOutputStream("D:\\products.txt");
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fout1));
			for ( Map.Entry m : products.entrySet() ) 
			{
				bw.write(m.getValue().toString());
				bw.newLine();
			}
			bw.close();
			fout1.close();
		}
		catch( Exception e )
		{
			
		}
	}

}
