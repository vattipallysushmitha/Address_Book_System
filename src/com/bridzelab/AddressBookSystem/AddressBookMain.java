package com.bridzelab.AddressBookSystem;
//importing scanner object
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
        	System.out.println("***********************************");
        	System.out.println("Welcome to Address Book System!!!!!");
        	System.out.println("***********************************");

		while(true) 
		{
			System.out.println("select option what you have to enter!!!");
			System.out.println("===================================");
			System.out.println("1.AddContact \n2.Display\n3.Edit Contact\n4.Delete\n5.Add multiple Contacts\n6.Exit");
            int select = ab.sc.nextInt();
			switch(select)
			{
			case 1:
				ab.addContacts();
				System.out.println("sucessfully Added the contacts to the Address Book");

				break;
			case 2:
				ab.displayContacts();
				System.out.println("sucessfully Displayed the contacts of Address Book");
				break;
			case 3 :
				ab.editContact();
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
