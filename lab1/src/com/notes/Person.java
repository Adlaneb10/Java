package com.notes;

public class Person
{
    private String firstName;
    private String surName;
    private int age;

    //constructor 1
    public Person(String firstName, String surName, int age)
    {
        setFirstName(firstName);
        //this.firstName = firstName;
        setSurName(surName);
        //this.surName = surName;
        setAge(age);
        //this.age = age;
    }

    // functionality needed here.. to set (and retrieve) your attributes
    //gatekeeper methods for your attributes

    // setter methods and getter methods

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public void setSurName(String surName)
    {
        this.surName = surName;
    }
    public void setAge(int age)
    {
        // validation should go in too
        // whatever controls you want on your variable.. add here
        if(age < 0 )
        {
            System.out.println("Error: Invalid age");
        }
        else

        this.age = age;

    }

    // getter method

    public String getFirstName()
    {
        return this.firstName; //i.e. return the value of the firstname
    }

    public String getSurName()
    {
        return this.surName; //i.e. return the value of the firstname
    }
    public int getAge()
    {
        return this.age;
    }
}
