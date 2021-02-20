package com.lab2;

public class Control
{
    public static void main(String[] args)
    {
        Animal p1 = new Animal("Benji");
        Animal p2 = new Animal("Maximus","Dog","Yes");

        // Attributes are not private so this is allowed
        p1.setName("Adam");
        p1.setBreed("Golden Retriever");
        // to print out string
        System.out.println(p1);
        System.out.println(p2);
        p2.makeNoise();

    }

}
