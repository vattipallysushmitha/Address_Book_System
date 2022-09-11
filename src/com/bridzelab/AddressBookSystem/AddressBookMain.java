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

        	int choice; //Variable for user Choice

            //Show Menu for user to Select Operation on AddressBook
            do {
                System.out.println("***** ADDRESS BOOK MANAGEMENT *****");
                System.out.println("1. ADD NEW ADDRESSBOOK\n2. EDIT ADDRESSBOOK\n3. DELETE ADDRESSBOOK" +
                        "\n4. DISPLAY ADDRESSBOOKS\n5. SELECT ADDRESSBOOK\n6. EXIT");
                System.out.println("Please Select the Operation Number : ");
                choice = AddressBookMap.userInput();

                switch (choice) {
                    case 1:
                        AddressBookMap.addNewAddressBook();    //Adding New Address Book to System
                        break;
                    case 2:
                        //Edit Address Book Details
                        AddressBookMap.editAddressBook();
                        break;
                    case 3:
                        AddressBookMap.deleteAddressBook();    //Delete the Address Book Details
                        break;
                    case 4:
                        AddressBookMap.displayAddressBooks();  //Show Contact Details
                        break;
                    case 5:
                        AddressBookMap.selectAddressBook();
                        break;
                    case 6:
                        System.out.println("Thank You for using Address Book System.");
                        break;
                    default:
                        System.out.println("Please Select the Operation between 1 to 6 only.");
                        break;
                }
            }while( choice != 6 );
        }
    }