package com.pluralsight;

import java.util.Scanner;

public class CarRentalCo {
    public static void main(String[] args) {

        System.out.println("Welcome to Car Rental Co!");
        //upgrade: which one of our vehicles would you like to rent + list of vehicles
        // + different rental prices

        System.out.println("To get started, we just need a couple of details from you.");
        //details
        surcharge()




        //final factors

        double basicCost = 29.99;

    }

  // additional calculations
    //methods.1: optional costs

    //method.2: surcharge costs
    public static void surcharge(Scanner age) {
        //build input system
        Scanner ageInput = new Scanner(System.in);
        //1: instructions
        System.out.println("What's your age?");
        //2: input environment
        int age = ageInput.nextInt();

        //3: return type
        if(age > 21 && age < 25){
            System.out.println("I see you're under 25. You will get extra protection!");
            double basicCost = 29.99 * 1.3;
        }else if(age > 25){
            System.out.println("I see you're over 25. You will be charged at the regular rate");
            double basicCost = 29.99;
        }else {
            System.out.println("Sorry, you can't rent a car as a " + age + " years old");
        }
    }
}
