package com.bridzelab.AddressBookSystem;

import java.util.ArrayList;
//importing scanner object
import java.util.Scanner;

//implementation of address book system
public class AddressBook 
{
	ArrayList<CreateContacts> ccList = new ArrayList<>();

	//scanner object for user input
	static Scanner sc = new Scanner(System.in);
	

	 
	public void addContacts()
	{
		
		//CreateContact object for getters and setters
		CreateContacts cc = new CreateContacts();

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
		ccList.add(cc);
	}
	
	public void displayContacts()
	{
		System.out.println("=========================================");
		for(int i = 0; i<ccList.size();i++) 
		{
			CreateContacts cc = ccList.get(i);
			System.out.println(cc.toString());
		}
	}
	public void editContact()
	{
		System.out.println("Enter the name to edit the contact in address book!!!");
		String name = sc.next();
		for(int i = 0; i<ccList.size();i++) 
		{
			CreateContacts cc = ccList.get(i);
		if(cc.getFirstName().equals(name))
		{
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
	}
		

	}
	public void deleteContact() 
	{
        System.out.println("Enter the First Name!!!!!");
        String firstName = sc.next();
        for(int i = 0; i<ccList.size();i++) 
		{
        	//shallow copy is a new object whose instance variable are identical to the old object
        	CreateContacts cc = ccList.get(i);
        	if(cc.getFirstName().equals(firstName))
        	{
			ccList.remove(i);
        	}
		}
	}
}


