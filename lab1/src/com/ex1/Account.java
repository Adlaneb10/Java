package com.ex1;

public class Account
{
    private String accName;
    private String owner;
    private double balance;
    private String comment;
    // constructor wont put in for now

    // sample overloaded methods

    public void deposit(double amount)
    {
        balance = balance + amount;
    }

    // need a 2nd version of this method that records the reason
    // system design decision

    public void deposit(double amount, String reason)
    {
        balance = balance + amount;
        comment = reason;
    }

    public double removeMoney()
    {
        return balance;
    }

}


