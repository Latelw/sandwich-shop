package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to the Sandwich Shop");
        System.out.println("What size would you like?\nSelect 1 for Regular ");
        System.out.println("Select 2 for Large");
        int userChoice = userInput.nextInt();

        // Regular is 5.45 Large is 8.95
        double regularPrice = 5.45;
        double largePrice = 8.95;


        //User needs to choose 1 or 2. Anything else is invalid
        if (userChoice == 1) {
            System.out.println("Regular is $" + regularPrice);


        } else if (userChoice == 2) {
            System.out.println("Large price is $" + largePrice);

        } else System.out.println("Selection Invalid");


        //Ask age
        System.out.println("Enter your age: ");
        int userAge = userInput.nextInt();

        /*
        Add discount of 10% for 17 and under
        Add 20% discount for 65 and older
         */
        if (userAge < 18 && userChoice == 1) {
            regularPrice = regularPrice - (regularPrice * 0.1);
            System.out.println("10% discount");

        } else if (userAge < 18 && userChoice == 2) {
            largePrice = largePrice - (largePrice * 0.1);
            System.out.println("10% discount");

        } else if (userAge > 64 && userChoice == 1) {
            regularPrice = regularPrice - (regularPrice * 0.2);
            System.out.println("20% discount");


        } else if (userAge > 64 && userChoice == 2) {
            largePrice = largePrice - (largePrice * 0.2);
            System.out.println("20% discount");
        }


        if (userChoice == 1) {
            System.out.println("Your total is " + regularPrice);
        } else System.out.println("Your total is $" + largePrice);
    }


}





