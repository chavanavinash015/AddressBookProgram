package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBook {

    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book program");
       AddressBook ad = new AddressBook();
       ad.addContact();
    }

    public void addContact() {

        String First_Name;
        String Last_Name;
        String Address;
        String City_Name;
        String State_Name;
        int Zip_Code;
        double Phone_Number;
        String Email_Id;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name");
        First_Name = sc.nextLine();
        System.out.println("Enter Last Name");
        Last_Name = sc.nextLine();
        System.out.println("Enter Address");
        Address = sc.nextLine();
        System.out.println("Enter City Name");
        City_Name = sc.nextLine();
        System.out.println("Enter State Name");
        State_Name = sc.nextLine();
        System.out.println("Enter Zip Code");
        Zip_Code = sc.nextInt();
        System.out.println("Enter Phone Number");
        Phone_Number = sc.nextDouble();
        System.out.println("Enter Email Id");
        Email_Id = sc.next();

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
        sc.close();

    }
    public void displyContact(ContactPerson contact){
        System.out.println(contact);

    }
}
