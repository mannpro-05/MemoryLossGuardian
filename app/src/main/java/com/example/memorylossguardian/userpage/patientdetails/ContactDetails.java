package com.example.memorylossguardian.userpage.patientdetails;

public class ContactDetails {
    private String contactName;
    private String contactNumber;

    public ContactDetails()
    {

    }
    public ContactDetails(String contactName, String contactNumber) {
        this.contactName = contactName;
        this.contactNumber = contactNumber;
    }

    public String getContactName() {
        return contactName;
    }

    public String getContactNumber() {
        return contactNumber;
    }
}
