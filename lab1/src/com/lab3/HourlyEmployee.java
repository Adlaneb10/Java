package com.lab3;

public class HourlyEmployee extends Employee
{
    private double hoursWorked;
    private double hourlyRate;

    public HourlyEmployee(String firstName, String surName, int staffNumber, double annualSalary, double hoursWorked, double hourlyRate)
    {
        super(firstName, surName, staffNumber, annualSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    // getter and setter methods
    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    // method to calculate pay
    public double calculatePay()
    {
        double total = hoursWorked * hourlyRate;
        System.out.println(total);
        return total;
    }

}
