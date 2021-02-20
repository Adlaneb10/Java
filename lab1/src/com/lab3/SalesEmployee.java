package com.lab3;

public class SalesEmployee extends Employee
{
    private double commissionEarned;

    public SalesEmployee(String firstName, String surName, int staffNumber, double annualSalary, double commissionEarned)
    {
        super(firstName, surName, staffNumber, annualSalary);
        this.commissionEarned = commissionEarned;
    }

    public double getCommissionEarned()
    {
        return commissionEarned;
    }

    public void setCommissionEarned(double commissionEarned)
    {
        this.commissionEarned = commissionEarned;
    }

    // method to calculate pay in subclass SalesEmployee


    public double calculatePay()
    {
        double total = this.getAnnualSalary() / 12 + commissionEarned;
        System.out.println(total);
        return total;
    }
}
