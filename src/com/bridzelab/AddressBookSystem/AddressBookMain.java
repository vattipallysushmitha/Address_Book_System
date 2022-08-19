package com.bridzelab.AddressBookSystem;

import java.util.Scanner;

public class AddressBookMain
{
		//calling Address Book object
        static AddressBook ab = new AddressBook();
        
        //Scanner object for user input
        static Scanner sc = new Scanner(System.in); 

	public static void main(String[] args) 
	{
		//welcome message for address book
		System.out.println("===================================");
		System.out.println("Welcome to Address Book System!!!!!");
		while(true) 
		{
			System.out.println("select options");
			System.out.println("===================================");
			System.out.println("1.AddContact \n2.display\n3.Edit Contact\n4.Delete\n5.Add multiple Contacts\n6.Exit");
            int choice = ab.sc.nextInt();
			switch(choice)
			{
			case 1:
				ab.addContacts();
				break;
			case 2:
				ab.displayContacts();
				break;
			case 3 :
				System.out.println("Invalid");

				break;
			case 4 :
				System.out.println("Invalid");

				break;
			case 5 :
				System.out.println("Invalid");

				break;
			case 6 :
				System.out.println("Thank You For Adding Contact Details to Address Book ");
				
			}
	}

}


	
		
	}
