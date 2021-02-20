/*
Author: Adlane Boulmelh
Date: 17/02/2021
Account Class to create a constructor and have a withdraw method with added penalty functionality.
 */

package com.lab4;

public class CurrentAccount extends Account
{
    private double penaltyAmount;

    public CurrentAccount(String accountName, int accountNumber, double acctBalance, double penaltyAmount)
    {
        // super class from Account
        super(accountName,accountNumber, acctBalance);
        this.penaltyAmount = penaltyAmount;
    }

    //  methods
    public double withdraw(double takeAmount)
    {
        super.withdraw(takeAmount);
        penaltyAmount = penaltyAmount + 10;
        return penaltyAmount;
    }

    // method to check if balance is greater than 0
    public void checkCredit()
    {
       if (getAcctBalance()>0)
       {
           System.out.println("You are in credit");
       }else{
           System.out.println("You are not in credit");
       }
    }

    // prints warning message to user if balance is less than 100
    public void checkCredit(String warningMessage)
    {
        if(getAcctBalance() < 100)
        {
            System.out.println(warningMessage);
        }
    }

    public String toString()
    {
        super.toString();
        return super.toString() + "Penalty amount" + penaltyAmount;
    }

}
