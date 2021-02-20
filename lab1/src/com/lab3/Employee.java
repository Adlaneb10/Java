/*
Author: Adlane Boulmelh C19367031
Date: 10/02/2021
Control: Create Employee class with subclass HourlyEmployee and SalesEmployee
 */

package com.lab3;

public class Employee
{
    // attributes declared
    private String firstName;
    private String surName;
    private int staffNumber;
    private double annualSalary;

    // constructor
    public Employee(String firstName, String surName, int staffNumber, double annualSalary)
    {
        setFirstName(firstName);
        setSurName(surName);
        setStaffNumber(staffNumber);
        setAnnualSalary(annualSalary);
    }

    // setter and getter methods
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setSurName(String surName)
    {
        this.surName = surName;
    }

    public void setStaffNumber(int staffNumber)
    {
        this.staffNumber = staffNumber;
    }

    public void setAnnualSalary(double annualSalary)
    {
        this.annualSalary = annualSalary;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getSurName()
    {
        return surName;
    }

    public int getStaffNumber()
    {
        return staffNumber;
    }

    public double getAnnualSalary()
    {
        return annualSalary;
    }

    // method that returns monthly pay of annual salary
    public double calculatePay()
    {
        double monthly = annualSalary / 12;
        System.out.println(monthly);
        return monthly;
    }

    public String toString()
    {
        String output;
        return output = "Employee info\n" + "Firstname: " + this.firstName + "\nSurname: "
                + this.surName + "\nStaff Number: " + this.staffNumber + "\nAnnual Salary: €"
                + this.annualSalary;
    }
}
