package com.notes;

public class Control
{
    public static void main (String[] args)
    {
        Person p1 = new Person("Joe","Murphy",12);
        System.out.println(p1.getAge());
        // rogue code or careless code
        //p1.age = 13; // compiler is happy with this bad code
        // an example of having unprotected attributes in your class
        //external code can put bad data in to your attributes
        p1.setAge(13); // you call methods against your objects

        // print out value of p1's firstname;

        System.out.println(p1.getFirstName());
        System.out.println(p1.getSurName());
    }
}