package com.lab2;

public class Animal
{
    private String name;
    private String breed;
    private String domesticAnimal;

    // constructor for just animal name
    public Animal(String name)
    {
        setName(name);
    }

    public Animal(String name, String breed, String domesticAnimal)
    {
        setName(name);
        setBreed(breed);
        setDomesticAnimal(domesticAnimal);
    }

    // setter methods
    public void setName(String name)
    {
        this.name = name;
    }

    public void setBreed(String breed)
    {
        this.breed = breed;
    }

    public void setDomesticAnimal(String domesticAnimal)
    {
        this.domesticAnimal = domesticAnimal;
    }

    public String getName()
    {
        return this.name;
    }

    public String getBreed()
    {
        return this.breed;
    }

    public String getDomesticAnimal()
    {
        return this.domesticAnimal;
    }

    public char makeNoise()
    {
        if (this.breed == "Dog")
        {
            System.out.println("Bark");
        }
        if (this.breed == "Cat")
        {
            System.out.println("Meoww");
        }
        if (this.breed == "Monkey")
        {
            System.out.println("Oooo Ooo Ahhh ");
        }
        return 0;
    }


    public String toString()
    {
        String ouput;

        return ouput = "This Animal is called " + name + ". it is a " + breed + " " +
                "and " + domesticAnimal + "it is a domestic Animal.";
    }


}
