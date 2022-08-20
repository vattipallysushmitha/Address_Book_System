package com.bridzelab.AddressBookSystem;

//importing scanner object
import java.util.Scanner;

//implementation of address book system
public class AddressBook 
{

	//scanner object for user input
	static Scanner sc = new Scanner(System.in);
	
	//CreateContact object for getters and setters
	CreateContacts cc = new CreateContacts();
	
	
	public void addContacts()
	{
		System.out.println("Enter the contact details to Address Book");
		System.out.println("=========================================");
		System.out.println("Enter the FirstName");
		cc.setFirstName(sc.next());
		System.out.println("Enter the LastName");
		cc.setLastName(sc.next());
		System.out.println("Enter the Address");
		cc.setAddress(sc.next());
		System.out.println("Enter the City");
		cc.setCity(sc.next());
		System.out.println("Enter the State");
		cc.setState(sc.next());
		System.out.println("Enter the Zip");
		cc.setZip(sc.next());
		System.out.println("Enter the PhoneNumber");
		cc.setPhoneNumber(sc.next());
		System.out.println("Enter the mailID");
		cc.setMail(sc.next());

	}
	public void displayContacts()
	{
		System.out.println("=========================================");
		System.out.println(cc.toString());
	    

	    }


	        

	    }

