package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    static Scanner sc = new Scanner(System.in);

    ArrayList<ContactPerson> contactList = new ArrayList<>();

    public void manageAddressBook() {
        int  choice = 0;

        do {
            do {
                System.out.println("\nWhich of the following operations would you like to perform?");
                System.out.println("1. Add a New contact");
                System.out.println("2. Edit an Existing contact");
                System.out.println("3. Delete an Existing contact");
                System.out.println("4. Display the Address Book");
                System.out.println("5. Exit");
                System.out.print("\nEnter your choice : ");
                choice = sc.nextInt();

                if (!(choice >=1 && choice <= 5))
                    System.out.println("\nInvalid choice!\nPlease try again.\n");
            }while (!(choice >=1 && choice <= 5));

            switch (choice)
            {
                case 1 :
                    addContact();
                    break;

                case 2 :
                    editContact();
                    break;

                case 3 :
                    deleteContact();
                    break;

                case 4 :
                    displayAddressBook();
                    break;

                case 5 :
                    System.out.println("\nEXITED");
                    break;
            }
        }while(choice != 5);
    }

    public ContactPerson getContactToModify(String name) {
        ContactPerson cp = null;
        
    static ContactPerson cp = new ContactPerson();
    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book program");


        for(int i = 0; i < contactList.size(); i++) {
            ContactPerson temp = contactList.get(i);
            if(name.equalsIgnoreCase(temp.getFirst_Name())) {
                cp = temp;
            }
        }
        return cp;
    }

    public void addContact() {

//        String First_Name;
//        String Last_Name;
//        String Address;
//        String City_Name;
//        String State_Name;
//        int Zip_Code;
//        double Phone_Number;
//        String Email_Id;


        System.out.println("Enter First Name");
        String First_Name = sc.nextLine();
        System.out.println("Enter Last Name");
        String Last_Name = sc.nextLine();
        System.out.println("Enter Address");
        String Address = sc.nextLine();
        System.out.println("Enter City Name");
        String City_Name = sc.nextLine();
        System.out.println("Enter State Name");
        String State_Name = sc.nextLine();
        System.out.println("Enter Zip Code");
        int Zip_Code = sc.nextInt();
        System.out.println("Enter Phone Number");
        double Phone_Number = sc.nextDouble();
        System.out.println("Enter Email Id");
        String Email_Id = sc.next();


        cp.setFirst_Name(First_Name);
        cp.setLast_Name(Last_Name);
        cp.setAddress(Address);
        cp.setCity_Name(City_Name);
        cp.setState_Name(State_Name);
        cp.setZip_Code(Zip_Code);
        cp.setPhone_Number(Phone_Number);
        cp.setEmail_Id(Email_Id);

        contactList.add(cp);
    }
    @Override
    public String toString() {
        return "\nAddressBook [\nContact List" + contactList + "\n]";
    }

    public void displayContact(ContactPerson cp) {
        System.out.println(cp);
    }

    public void displayAddressBook() {
        System.out.println("\n\n------- Address Book -------");
        for (int i = 0; i < contactList.size(); i++)
            System.out.println("\n"+contactList.get(i));
        System.out.println();
    }

    public void editContact() {
        ContactPerson cp = null;
        String name = null;

        System.out.print("\nEnter the First Name of the contact you want to edit : ");
        name = sc.next();
        while (cp == null) {
            cp = getContactToModify(name);
            if (cp == null) {
                System.out.print("\nNo such entry exists!\nPlease enter a valid First Name : ");
                name = sc.next();
                cp = getContactToModify(name);
            }
        }
        makeEdits(cp);
    }

    public void makeEdits(ContactPerson cp) {
        int choice = 0;
        while (choice < 1 || choice > 8) {
            System.out.println("\nWhat would you like to update?");
            System.out.println("1. Name");
            System.out.println("2. Last Name");
            System.out.println("3. Address");
            System.out.println("4. City Name");
            System.out.println("5. State Name");
            System.out.println("6. Zip Code");
            System.out.println("7. Phone Number");
            System.out.println("8. Email Id");
            System.out.print("\nEnter your choice : ");
            choice = sc.nextInt();

            if (!(choice >=1 && choice <= 8))
                System.out.println("\nInvalid choice!\nPlease try again.\n");
        }

        switch (choice) {
            case 1 :
                System.out.print("Enter the updated First Name :	");
                String First_Name = sc.next();
                cp.setFirst_Name(First_Name);
                break;
            case 2 :
                System.out.print("Enter the updated Last Name :	");
                String Last_Name = sc.next();
                cp.setLast_Name(Last_Name);
                break;
            case 3 :
                System.out.print("Enter the updated Address :	");
                String Address = sc.nextLine();
                cp.setAddress(Address);
                break;
            case 4 :
                System.out.print("Enter the updated City :	");
                String City_Name = sc.next();
                cp.setCity_Name(City_Name);
                break;
            case 5 :
                System.out.print("Enter the updated State :	");
                String State_Name = sc.next();
                cp.setState_Name(State_Name);
                break;
            case 6 :
                System.out.print("Enter the updated zip :	");
                int Zip_Code = sc.nextInt();
                cp.setZip_Code(Zip_Code);
                break;
            case 7 :
                System.out.print("Enter the updated Phone Number :	");
                double Phone_Number = sc.nextDouble();
                cp.setPhone_Number(Phone_Number);
                break;
            case 8 :
                System.out.print("Enter the updated Email Address :	");
                String Email_Id = sc.next();
                cp.setEmail_Id(Email_Id);
                break;
        }
        System.out.println("\nIs there anything else you'd like to update?");
        System.out.print("Enter 'Yes' or 'No' : ");
        char continueEdit = sc.next().charAt(0);
        if (continueEdit == 'Y' || continueEdit == 'y') {
            makeEdits(cp);

        }
        else if (continueEdit == 'N' || continueEdit == 'n') {
            System.out.println("\n\nHere is the updated Address Book.");
            displayContact(cp);
        }
        else {
            System.out.println("\nInvalid Input.\nPlease try again!");
        }
    }

    public void deleteContact() {
        ContactPerson cp = null;
        String name = null;

        System.out.print("\nEnter the First Name of the contact you want to delete : ");
        name = sc.next();
        while (cp == null) {
            cp = getContactToModify(name);
            if (cp == null) {
                System.out.println("\nNo such entry exists!\nPlease enter a valid First Name.");
                name = sc.next();
                cp = getContactToModify(name);
            }
        }
        contactList.remove(cp);
    }
}


    public void deleteContact(ContactPerson cp) {
        cp.setFirst_Name(null);
        cp.setLast_Name(null);
        cp.setAddress(null);
        cp.setCity_Name(null);
        cp.setState_Name(null);
        cp.setZip_Code(0);
        cp.setPhone_Number(0);
        cp.setEmail_Id(null);

        System.out.println("\n\nHere is the updated Address Book.");
       displayContact(cp);
     }
   }    
}


