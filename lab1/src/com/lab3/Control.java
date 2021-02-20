package com.lab3;
 // main class
public class Control {
    public static void main(String[] args)
    {
        // instantiate employee p1
        Employee p1 = new Employee("John", "Smith", 1234, 45000);
        System.out.println(p1);
        p1.calculatePay();

        // subclass instantiate hourlyemployee p2
        HourlyEmployee p2 = new HourlyEmployee("Mary","Jones", 4856, 65000, 42, 22);
        System.out.println("\n\n");
        System.out.println(p2);
        p2.calculatePay();

        // subclass insantiate SalesEmployeee p3
        SalesEmployee p3 = new SalesEmployee("Adam","Benson", 7895, 35000, 17000);
        System.out.println("\n\n");
        System.out.println(p3);
        p3.calculatePay();


    }
}
