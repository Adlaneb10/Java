package com.notes;

public class Patient
{
    private String firstName;
    private String dateOfBirth;

    public Patient(String firstName, String dateOfBirth)
    {
        setFirstName(firstName);
        setDateOfBirth(dateOfBirth);
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public void setDateOfBirth(String dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName()
    {
        return this.getFirstName();
    }
}
