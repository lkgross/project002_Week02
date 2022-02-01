package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello, World!");
        System.out.println(8/2);
        /* These are not floating point numbers, so the division
         * is going to get rid of the decimal.
         * This is integer division.
         */
        System.out.println(7/2);
        System.out.println(7./2.);
        System.out.println(7./2);
        System.out.println(7/2.);
        System.out.println(40 * 14.25);
        double hoursWorked = 40; // Inline initialization.
        double hourlyWage; // Declare variables in Java!
        hourlyWage = 14.25; // Assign a value to a variable.
        System.out.println(hoursWorked * hourlyWage);
        boolean integerEntered;
        integerEntered = false;
        System.out.println(!integerEntered);
        System.out.println(true && false);
        System.out.println(true || false);
        String name = "Laura";
        System.out.println(name);
        char initial = 'L';
        System.out.println(initial);

    }
}
