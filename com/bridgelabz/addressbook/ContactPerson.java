package com.bridgelabz.addressbook;

public class ContactPerson {

    private String First_Name;
    private String Last_Name;
    private String Address;
    private String City_Name;
    private String State_Name;
    private int Zip_Code;
    private double Phone_Number;
    private String Email_Id;

    public String getFirst_Name() {

        return First_Name;
    }

    public void setFirst_Name(String first_Name) {

        First_Name = first_Name;
    }

    public String getLast_Name() {

        return Last_Name;
    }

    public void setLast_Name(String last_Name) {

        Last_Name = last_Name;
    }

    public String getAddress() {

        return Address;
    }

    public void setAddress(String address) {

        Address = address;
    }

    public String getCity_Name() {

        return City_Name;
    }

    public void setCity_Name(String city_Name) {
        City_Name = city_Name;
    }

    public String getState_Name() {

        return State_Name;
    }

    public void setState_Name(String state_Name) {

        State_Name = state_Name;
    }

    public int getZip_Code() {
        return Zip_Code;
    }

    public void setZip_Code(int zip_Code) {

        Zip_Code = zip_Code;
    }

    public double getPhone_Number() {

        return Phone_Number;
    }

    public void setPhone_Number(double phone_Number) {

        Phone_Number = phone_Number;
    }

    public String getEmail_Id() {

        return Email_Id;
    }

    public void setEmail_Id(String email_Id) {
        Email_Id = email_Id;
    }

    @Override
    public String toString() {
        return "ContactPerson{" +
                "First_Name='" + First_Name + '\'' +
                ", Last_Name='" + Last_Name + '\'' +
                ", Address='" + Address + '\'' +
                ", City_Name='" + City_Name + '\'' +
                ", State_Name='" + State_Name + '\'' +
                ", Zip_Code=" + Zip_Code +
                ", Phone_Number=" + Phone_Number +
                ", Email_Id='" + Email_Id + '\'' +
                '}';
    }
}
