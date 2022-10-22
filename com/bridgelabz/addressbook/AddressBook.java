package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBook {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book program");

        AddressBook ad = new AddressBook();
        ad.addContact();
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
        int Phone_Number = sc.nextDouble();
        System.out.println("Enter Email Id");
        String Email_Id = sc.next();

        ContactPerson cp = new ContactPerson();
        cp.setFirst_Name(First_Name);
        cp.setLast_Name(Last_Name);
        cp.setAddress(Address);
        cp.setCity_Name(City_Name);
        cp.setState_Name(State_Name);
        cp.setZip_Code(Zip_Code);
        cp.setPhone_Number(Phone_Number);
        cp.setEmail_Id(Email_Id);

        displyContact(cp);
        editContact(cp);

    }

    public void displyContact(ContactPerson contact) {
        System.out.println(contact);

    }
    public void editContact(Contactperson contact) {
        int choice = 0;
        while (choice < 1 || choice > 4) {
            System.out.println("\nWhat would you like to update?");
            System.out.println("1. Name");
            System.out.println("2. Phone Number");
            System.out.println("3. Email Id");
            System.out.println("4. Address");
            System.out.print("\nEnter your choice : ");
            choice = sc.nextInt();

            if (!(choice >=1 && choice <= 4))
                System.out.println("\nInvalid choice!\nPlease try again.\n");
        }

        switch (choice) {
            case 1 :
                System.out.print("Enter the updated First Name :	");
                String First_Name = sc.next();
                System.out.print("Enter the updated Last Name :	");
                String Last_Name = sc.next();
                contact.setFirstName(First_Name);
                contact.setLastName(Last_Name);
                break;

            case 2 :
                System.out.print("Enter the updated Phone Number :	");
                String Phone_Number = sc.next();
                contact.setPhoneNumber(Phone_Number);
                break;

            case 3 :
                System.out.print("Enter the updated Email Address :	");
                String Email_Id = sc.next();
                contact.setEmail_Id(Email_Id);
                break;

            case 4 :
                System.out.print("Enter the updated City :	");
                String City_Name = sc.next();
                System.out.print("Enter the updated State :	");
                String State_Name = sc.next();
                System.out.print("Enter the updated zip :	");
                String Zip_Code = sc.next();
                contact.address.setCity(City_Name);
                contact.address.setState(State_Name);
                contact.address.setZip(Zip_Code);
                break;
        }

        System.out.println("\nIs there anything else you'd like to update?");
        System.out.print("Enter 'Yes' or 'No' : ");
        char continueEdit = sc.next().charAt(0);
        if (continueEdit == 'Y' || continueEdit == 'y') {
            editContact(contact);

        }
        else if (continueEdit == 'N' || continueEdit == 'n') {
            System.out.println("\n\nHere is the updated Address Book.");
            displayContact(contact);
        }
        else {
            System.out.println("\nInvalid Input.\nPlease try again!");
        }
    }

}