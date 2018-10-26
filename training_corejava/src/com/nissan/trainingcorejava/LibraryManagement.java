package com.nissan.trainingcorejava;

import java.util.Scanner;

abstract class Books {
	String name;
	int qty;
	boolean removed = false;
	abstract void addBooks ( String name, int qty );	// To Add new books
	abstract int searchBooks ( String name );			// To search for already present books
	abstract void removeBooks ( );						// To remove a particular book
	abstract void updateBooks ( int qty );				// To update a book
	abstract void display();							// To display the details of a book
}

class Details {											//	Details of all the books and users	
	Books u = new Books() {
		public void addBooks( String name, int qty ) {
			removed = false;
			this.name = name;
			this.qty = qty;
		}
		public void removeBooks( ) {
			removed = true;
			this.qty = 0;
		}
		public int searchBooks ( String name ) {
			if ( this.name.equals(name) )
				return 1;
			return -1;
		}
		public void updateBooks( int qty ) {
			this.qty += qty;
		}
		public void display() {
			System.out.print("Name : " + this.name);
			System.out.print(" \t\tQty : " + this.qty);
		}
	};
	static class LibraryUsers {
		int adNo, qty[] = new int[100];
		String name[] = new String[100];
		int count = 0;
		boolean returned[] = new boolean[100];
		public void borrow( String name ) {
			this.name[count] = name;
			this.qty[count] = 1;
			this.returned[count] = false;
			this.count++;
		}
		public void returns( String name, int index ) {
			this.returned[index] = true;
		}
	}
}

public class LibraryManagement {

	static Scanner sc = new Scanner( System.in );
	static String adminName = "admin", password = "admin";
	static Details d[] = new Details[30];
	static int bookCounts = 0;
	static Details.LibraryUsers obj = new Details.LibraryUsers();
	
	public static int adminLogin()
	{
		String name, pswd;
		System.out.print("Enter the Name : ");
		name = sc.nextLine();
		System.out.print("Enter the password : ");
		pswd = sc.nextLine();
		if ( name.equals(adminName) && pswd.equals(password) )
			return 1;
		System.out.println("\nWrong Credentials\n");
		return -1;
	}
	
	public static void adminMenu() {
		int choice = 0, index;
		while( choice != 5 ) {
			String name; int qty;
			System.out.println("\n1. Add Books\n2. Remove Books\n3. Update\n4. Display\n5. Go back");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			sc.nextLine();
			switch( choice ) {
			case 1:
				int i;
				while ( true ) {
					System.out.print("Enter the book name : ");
					name = sc.nextLine();
					for ( i = 0; i < bookCounts; i++ ) {			// To search if book is already present
						if ( d[i].u.searchBooks(name) == 1 ) {
							break;
						}
					}
					if ( i == bookCounts ) {						// If not present, create a new one
						System.out.print("Enter the qty : ");
						qty = sc.nextInt();
						sc.nextLine();
						d[bookCounts] = new Details();
						d[bookCounts].u.addBooks(name, qty);
						bookCounts++;
						break;
					}
						
					else {											// If already present, update existing or create new according to user
						System.out.print("Book already present. If you want to update the"
								+ "present book, press 1 or you want to add a new book, press 2 : ");
						int tempChoice = sc.nextInt();	sc.nextLine();
						if ( tempChoice == 1 ) {
							System.out.print("Enter the qty : ");
							qty = sc.nextInt();
							sc.nextLine();
							d[i].u.updateBooks(qty);
							d[i].u.removed = false;
							break;
						}
						else if ( tempChoice == 2 ) {
							System.out.print("Enter another name(Including the authors) \n");
							continue;
						}		
					}
				}
				break;
			case 2:
				if( bookCounts == 0 ) {
					System.out.println("\nNo books to be removed\n");
					continue;
				}
				System.out.println();
				index = bookCounts;
				for ( i = 0; i < bookCounts; i++ ) {
					System.out.print(i+1 + ". ");
					d[i].u.display();
					if ( d[i].u.removed == true )
						System.out.print("(Removed)");
					System.out.println();
				}
				System.out.println();
				System.out.print("Enter the book number : ");
				index = sc.nextInt();
				if ( index-1 >= bookCounts || d[index-1].u.removed == true || index-1 < 0)
				{
					System.out.println("Please enter a valid index");
					continue;
				}
				d[index-1].u.removeBooks();
				break;
			case 3:
				if( bookCounts == 0 ) {
					System.out.println("\nNo books to be Updated\n");
					continue;
				}
				int j;
				index = bookCounts;
				System.out.println();
				for ( j = 0; j < bookCounts; j++ ) {
					System.out.print(j+1 + ". ");
					d[j].u.display();
					if ( d[j].u.removed == true )
						System.out.print("(Removed)");
					System.out.println();
				}
				System.out.println();
				System.out.print("Enter the book number : ");
				index = sc.nextInt();
				if ( index-1 >= bookCounts)
				{
					System.out.println("Please enter a valid index");
					continue;
				}
				System.out.print("Enter the qty to be added : ");
				qty = sc.nextInt();
				d[index-1].u.updateBooks(qty);
				if ( d[index-1].u.removed == true )
					d[index-1].u.removed = false;
				break;
			case 4:
				int k = 1;
				System.out.println();
				for ( j = 0; j < bookCounts; j++ ) {
					if ( d[j].u.removed == false )
					{
						System.out.print(k++ + ". ");
						d[j].u.display();
						System.out.println();
					}
				}
				System.out.println();
				break;
			case 5:
				break;
			}
		}
	}
	
	public static void userMenu() {
		int choice = 0;
		while ( choice != 3 ) {
			int i, index = bookCounts;
			System.out.println("\n1. Borrow\n2. Return\n3. Go Back");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			sc.nextLine();
			switch( choice )
			{
			case 1:
				if ( bookCounts == 0 ) {
					System.out.println("\nNo books are available\n");
					continue;
				}
				System.out.println();
				for ( i = 0; i < bookCounts; i++ ) {
					System.out.print(i+1 + ". ");
					d[i].u.display();
					if ( d[i].u.removed == true || d[i].u.qty == 0 )
						System.out.print("(Not Currently Available)");
					System.out.println();
				}
				System.out.println();
				System.out.print("Enter the book number : ");
				index = sc.nextInt();
				sc.nextLine();
				if ( index-1 >= bookCounts || index-1 < 0) {
					System.out.println("Please enter a valid index");
					continue;
				}
				obj.borrow(d[index-1].u.name);
				d[index-1].u.qty -= 1;
				break;
				
			case 2:
				if ( obj.count == 0 ) {
					System.out.println("\nNo books to be returned\n");
					continue;
				}
				System.out.println();
				for ( i = 0; i < obj.count; i++ ) {
					if ( obj.returned[i] == false )
						System.out.println(i+1 + ". " + obj.name[i]);
					else
						System.out.println(i+1 + ". " + obj.name[i] + " (already returned)");
				}
				System.out.println();
				System.out.print("Enter the book number : ");
				index = sc.nextInt();
				sc.nextLine();
				if ( index-1 >= obj.count || obj.returned[index-1] == true || index-1 < 0) {
					System.out.println("Please enter a valid index");
					continue;
				}
				obj.returned[index-1] = true;
				break;
				
			}
		}
	}
	
	public static void mainMenu() {
		int choice = 0;
		while ( choice != 3 ) {
			System.out.println("1. Users\n2. Login\n3. Exit");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			sc.nextLine();
			switch( choice )
			{
			case 1:
				userMenu();
				System.out.println();
				break;
			case 2:
				if ( adminLogin() == 1 ) {
					adminMenu();
					continue;
				}
				break;
			case 3:
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		try {
			mainMenu();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			sc.close();
		}
	}

}
