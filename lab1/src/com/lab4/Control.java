/*
Author: Adlane Boulmelh
Date: 17/02/2021
Control class to carry out main methods and tasks from account class
 */
package com.lab4;

public class Control
{
    public static void main(String[] args)
    {
        // instantiate account A1
        Account a1 = new Account("Adlane", 123456, 5000 );
        a1.deposit(500);
        a1.withdraw(1500);
        System.out.println(a1);
        // part 2 Deposit Account
        DepositAccount d1 = new DepositAccount("Adam", 4587,250000,2);
        d1.withdraw(500);
        System.out.println(d1);

        // part 3 Current account
        CurrentAccount c1 = new CurrentAccount("Ben",78945,10, 0);
        c1.withdraw(100);
        c1.checkCredit();
        c1.checkCredit("Your balance is less than €100");
        System.out.println(c1);
        c1.getDetails();
        c1.valuableAccount();
    }

}
