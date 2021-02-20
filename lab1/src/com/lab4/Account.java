/*
Author: Adlane Boulmelh
Date: 17/02/2021
Account Class to create a constructor and have a deposit and withdraw method.
 */
package com.lab4;

public class Account implements ValidatedAccount
{
    // attributes
    private String accountName;
    private int accountNumber;
    //return "You withdrew " + takeAmount;
    private boolean inCredit = true;
    private double acctBalance;

    private static int currentNumber = 1000;

    // constructor
    public Account(String accountName, int accountNumber, double acctBalance)
    {
        setAccountName(accountName);
        setAccountNumber(currentNumber++);
        //setInCredit(inCredit);
        setAcctBalance(acctBalance);
    }

    // setter and getter methods


    public void setAccountName(String accountName)
    {
        this.accountName = accountName;
    }

    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public void setAcctBalance(double acctBalance)
    {
        this.acctBalance = acctBalance;
    }

    /*public void setInCredit(boolean inCredit)
    {
        this.inCredit = inCredit;
    }*/

    public double getAcctBalance()
    {
        return acctBalance;
    }

    public int getAccountNumber()
    {
        return accountNumber;
    }

    public String getAccountName()
    {
        return accountName;
    }

    /*public boolean getInCredit()
    {
        return inCredit;
    }*/

    // method to deposit amount in to account balance
    public double deposit(double depAmount)
    {
        if (depAmount < 0)
        {
            System.out.println("ERROR: You can't deposit that amount!");
        }
        else {
            acctBalance = acctBalance + depAmount;
        }
        return depAmount;
    }

    // Method to withdraw from your account
    public double withdraw(double takeAmount)
    {
        if (takeAmount < 1)
        {
            System.out.println("ERROR: You can't withdraw a value less than one");
        }
        else {
            acctBalance = acctBalance - takeAmount;
            inCredit = true;
        }
        if(acctBalance < 0)
        {
            inCredit = false;
        }

        return takeAmount;
    }

    @Override
    public String toString()
    {
        String output;
        return output = "\naccountName=" + accountName + '\n' +
                "accountNumber=" + accountNumber +
                "\ninCredit=" + inCredit +
                "\nacctBalance=" + acctBalance +
                "\nYour new balance is " + acctBalance;
    }

    @Override
    public void getDetails() {
        String output ="\nAccount name: " + getAccountName() + "\nAccount Balance: " + getAcctBalance();
        System.out.println(output);
    }

    @Override
    public void valuableAccount() {
        String output2 = "\nValuable ACC\nACCOUNTBal:" + acctBalance;
        System.out.println(output2);
    }
}
