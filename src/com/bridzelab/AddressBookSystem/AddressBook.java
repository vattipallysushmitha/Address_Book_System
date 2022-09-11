/*Purpose==>Refactor to add multiple Address Book to the System. 
* 		   -Each Address Book has a unique Name 
* 		   -Use Console to add new Address Book
*          -Maintain Dictionary of Address Book Name to Address Book
*Author==>Sushmitha
*Sign==>11-10-2022         
*/
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
	

	 //method to add contacts in Address Book
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
	
	//method to display the contacts in Address Book 
	public void displayContacts()
	{
		System.out.println("=========================================");
		for(int i = 0; i<ccList.size();i++) 
		{
			CreateContacts cc = ccList.get(i);
			System.out.println(cc.toString());
		}
	}
	
	//method to edit the contact in Address Book
	public void editContact()
	{
        //Get First Name to Edit the Contact
        System.out.println("Enter the First Name : ");
        String name = sc.next();

        //check if the Given User with First Name
        boolean isAvailable = false;
        for(CreateContacts cc : ccList)
        {
    		if(cc.getFirstName().equals(name))
            {
                	isAvailable = true;
                    System.out.println("Enter the Last Name :");
                    cc.setLastName(sc.next());
                    System.out.println("Enter the Address :");
                    cc.setAddress(sc.next());
                    System.out.println("Enter the City :");
                    cc.setCity(sc.next());
                    System.out.println("Enter the State :");
                    cc.setState(sc.next());
                    System.out.println("Enter the Zip Code :");
                    cc.setZip(sc.next());
                    System.out.println("Enter the Phone Number :");
                    cc.setPhoneNumber(sc.next());
                    System.out.println("Enter the EMail ID :");
                    cc.setMail(sc.next());
                    break;
            }
        }
        if(!isAvailable) 
        {
            System.out.println("Contact Number Not Found.");
        }
    }

    //Method to Delete the Existing Contact
    public void deleteContact() 
    {
        //Get First Name to Edit the Contact
        System.out.println("Enter the first name to delete the existing contcat in Address Book");
        String name = sc.next();

        //check if the Given User with First Name
        boolean isAvailable = false;
        for(CreateContacts cc : ccList) 
        {
    		if(cc.getFirstName().equals(name))
            {
                isAvailable = true;
                ccList.remove(cc);
                break;
            }
        }
        if(!isAvailable) 
        {
            System.out.println("Contact not Found in the Address Book!!!");
        }
    }
    public void contactOptions(AddressBook addressBook)
    {
        int select;
        
		//Show Menu for user to Select Operation on AddressBook
        do 
        {
            System.out.println("***** ADDRESS BOOK MANAGEMENT *****");
            System.out.println("1. ADD NEW CONTACT\n2. EDIT CONTACT\n3. DELETE CONTACT" +
                    "\n4. DISPLAY CONTACT\n5. EXIT");
            System.out.println("Please Select the Operation Number : ");
            select = addressBook.sc.nextInt();

            switch (select) 
            {
                case 1:
                    addressBook.addContacts();    //Adding New Contact Details
                    break;
                case 2:
                    addressBook.editContact();  //Edit Contact Details
                    break;
                case 3:
                    addressBook.deleteContact();    //Delete the Contact Details
                    break;
                case 4:
                    addressBook.displayContacts();   //Show Contact Details
                    break;
                case 5:
                    System.out.println("Thank You for Using Address Book.");
                    break;
                default:
                    System.out.println("Please Select the Operation between 1 to 5 only.");
                    break;
            }
        }
        while( select != 5 );
    }

}


