/*
Auhtor: Adlane Boulmelh
Date: 28/01/2021
Control: Vehicle class with information on vehicle and owner
*/
package com.lab;


public class Vehicle
{
    // attributes
    private String owner;
    private String regNum;
    private int maxSpeed;
    private String colour;
    private String transmission;
    private int numWheels;
    private boolean carRecent;


    // Constructors
    public Vehicle(String owner, String regNum)
    {
        this.owner = owner;
        this.regNum = regNum;

    }

    public Vehicle(String owner, String regNum, int maxSpeed, String colour, String transmission, int numWheels)
    {
        this.owner = owner;
        this.regNum = regNum;
        this.maxSpeed = maxSpeed;
        this.colour = colour;
        this.transmission = transmission;
        this.numWheels = numWheels;

    }

    // Method
    public String toString()
    {
        String output;

        return output = "Owner : " + owner + " Reg NUM: " + this.regNum + " Max speed is " + this.maxSpeed + " Colour is " + this.colour + " Transmission: " + this.transmission + " Number of wheels " + this.numWheels;

    }

    public boolean setRecentCar()
    {
        String carYear = regNum.substring(0,2);
        int year = Integer.parseInt(carYear);

        if( year >= 2)
        {
            carRecent = true;
        }
        else
        {
            carRecent = false;
        }
        return carRecent;


    }



}

