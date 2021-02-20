/*
Author: Adlane Boulmelh
Date: 17/02/2021
Account Class to create a constructor and have a over ride withdraw method.
with a to string method
 */
package com.lab4;

public class DepositAccount extends Account
{
    private double interestRate;

    public DepositAccount(String accountName, int accountNumber, double acctBalance, double interestRate)
    {
        super(accountName,accountNumber,acctBalance);
        this.interestRate = interestRate;
    }

    public double withdraw(double takeAmount)
    {
        takeAmount = takeAmount;
        String output;
        toString();
        return takeAmount;
    }

    public String toString()
    {
       super.toString();
        return super.toString() + "\n" + "You cannot withdraw from a deposit account";
    }

}
