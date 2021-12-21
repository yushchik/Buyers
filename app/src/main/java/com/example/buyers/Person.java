package com.example.buyers;

public class Person {
    private String firstName;
    private String lastName;
    private String emailPerson;
    private String phoneNumber;

    public Person(String firstName, String lastName, String emailPerson, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailPerson = emailPerson;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailPerson() {
        return emailPerson;
    }

    public void setEmailPerson(String emailPerson) {
        this.emailPerson = emailPerson;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
