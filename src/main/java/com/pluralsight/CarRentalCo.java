package com.pluralsight;

import java.util.Scanner;

public class CarRentalCo {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        double basicCost = 29.99;

        System.out.println("Welcome to Car Rental Co! \n");
        /* upgrade: using Switch Statement~?
         * which one of our vehicles would you like to rent + list of vehicles
         * + different rental prices
         */

        System.out.println("Our rental cost start as low as $" + basicCost + "!\n");
        System.out.println("To get started, we just need a couple of details from you.\n");

        //details
        //get total days
        System.out.print("For how many days would you like to rent a vehicle? ");
        int totalDays = keyboard.nextInt();

        //get additional charges
        double surcharge = determineSurcharge(keyboard);
        double optionalCost = provideOptionalCost(keyboard);

        //total fee
        double totalCost = totalDays * (basicCost + optionalCost + surcharge);

        //display system
        //Receipt
        System.out.println("\nAwesome! \n\n" +
                           "Now that we have all the details we need,\n" +
                           "below is the cost breakdown.\n");

        System.out.printf("Vehicle rental: $%.2f", (basicCost * totalDays));
        System.out.printf("\nAdditional services: $%.2f", optionalCost);
        System.out.printf("\nUnderage driver surcharge: $%.2f", surcharge);
        System.out.printf("\nTotal: $%.2f", totalCost);

    }

  // additional calculations
    //methods.1: optional costs
    public static double provideOptionalCost(Scanner optional){
        System.out.println("\nWe also have some optional but super helpful serices. " +
                           "\nTo apply, Just type (Y) for Yes or (N) for No.\n");
             optional.nextLine(); //clear buffer
        //toll tag
        System.out.print("Electric Toll Tag: ");
        String tollTag = optional.nextLine().toLowerCase();

        //toll tag cost
        double tollTagCost = 0;
        if(tollTag.equals("Y")){
            tollTagCost = 3.95;
        }

        //GPS
        System.out.print("GPS: ");
        String gps = optional.nextLine().toLowerCase();

        //GPS cost
        double gpsCost = 0;
        if(gps.equals("Y")){
            gpsCost = 2.95;
        }

        //Roadside Assist
        System.out.print("Roadside Assistance: ");
        String roadsideAssistance = optional.nextLine().toUpperCase();

        //roadside assist cost
        double roadsideAssistanceCost = 0;
        if(roadsideAssistance.equals("Y")){
            roadsideAssistanceCost = 3.95;
        }

        /* output switch
        switch(tollTag){
            case "y" -> basicCost += ;
            case "n" -> basicCost += 0;
        }
         */

        //total optional cost
        double optionalCosts = tollTagCost + gpsCost + roadsideAssistanceCost;

        //return
        return optionalCosts;
    }

    //method.2: surcharge costs
    public static double determineSurcharge(Scanner getAge) {

        //1: instructions
        System.out.print("What's your age? ");
        //2: input environment
        int age = getAge.nextInt();

        //3: return type
       double surcharge = 0;
        if(age > 21 && age < 25){
            System.out.println("I see you're under 25. " +
                               "\nYou will get underage protection fee.");
            surcharge = 29.99 * 0.3;
        }else if(age >= 25){
            System.out.println("I see you're over 25. " +
                               "\nYou will be charged at the regular rate");
        }else {
            System.out.println("Sorry, you can't rent a car at " + age);
        }
        //return
        return surcharge;
    }
}
