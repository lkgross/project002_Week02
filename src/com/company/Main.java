package com.company;

public class Main {
    /*
     Note the CLASS HEADER above.
     Here Main is a class that is a container to hold the program.
     A Java program must have at least on class definition.
     A .java file can have many classes but only one public class.
     The class name must match the file name (before the .java).
     */

    /**
     * isOdd: A method to print whether a number is odd
     * @param number
     */

    public static void main(String[] args) {
        /*
         Every Java application must have a method named main.
         Note the method header!
         The "static method" main can be thought of as a "function".
         In Java we use the language of "methods": static methods and "instance methods".
         What does void mean?
         What is String[] args?
         We'd like to call other methods from inside main.
         */

        // There is a newline character \n included with a println.
        System.out.print("Hello, World!");
        System.out.println("Hello, World!");

        System.out.println(8/2);
        /* These are not floating point numbers, so the division
         * is going to get rid of the decimal.
         * This is integer division.
         */
        System.out.println(7/2);

        // Make one or both numbers decimals to do floating-point division.
        System.out.println(7./2.);
        System.out.println(7./2);
        System.out.println(7/2.);

        System.out.println(40 * 14.25);

        /* Java is a strongly typed language.
         * Variables must be declared.
         */
        double hoursWorked = 40; // Inline initialization.
        double hourlyWage; // Declare variables in Java!
        hourlyWage = 14.25; // Assign a value to a variable.
        System.out.println(hoursWorked * hourlyWage);
        if (hoursWorked < 0){
            throw new IllegalArgumentException();
        }

        boolean integerEntered;
        integerEntered = false;
        System.out.println(!integerEntered);
        System.out.println(true && false);
        System.out.println(true || false);

        // The modulus operator (%) gives the remainder.
        System.out.println(8 % 2);
        System.out.println(13 % 12);

        // Call a method.
        isOdd(8);
        System.out.println(isOdd2(7));

        String name = "Laura"; // "Short" inline initialization
        String name2 = new String("Laura"); // "Long" inline initialization

        System.out.println(name2);
        char initial = 'L';
        char initial2 = 'G';
        System.out.println(initial);
        System.out.println(initial2);
        System.out.println(initial + initial2);

        String stringI = "5";
        int i = Integer.parseInt(stringI);
        System.out.println(i * 3);

        int j = Integer.parseInt("5");
        System.out.println(j * 3);

        System.out.println(Integer.parseInt("5") * 3);

        System.out.println(Math.sqrt(2));
        System.out.println(Math.E);
        System.out.println(Math.PI);
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.sin(Math.PI/2)); // Argument to sine is in radians.
        System.out.println(Math.sin(90)); // Here the argument is 90 radians!

        System.out.println(j);
        System.out.println((double) j);

    }

    public static void isOdd(int number) {
        // This method does not return a value.
        // We can use + to concatenate (join together) two "strings".
        System.out.print("The number " + number + " is odd: ");
        System.out.println((number % 2) == 1);
    }

    /**
     * isOdd2: A method to return whether a number is odd
     * @param number
     * @return
     */
    public static boolean isOdd2(int number) {
        // The return type for the method is boolean. (See header.)
        return (number % 2) == 1;
    }

}
