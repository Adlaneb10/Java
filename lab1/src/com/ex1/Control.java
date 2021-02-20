package com.ex1;

public class Control {
    public static void main (String[] args)
    {
        Account a1 = new Account();
        a1.deposit(100);
        a1.deposit(200, "Payment to mum");
        /* only do when there is a return value in method */
        Double myBalance = a1.removeMoney();
    }
}
