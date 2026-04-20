package com.pluralsight;

import java.util.Scanner;

public class CarRentalCo {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to Car Rental Co! \n");
        //upgrade: which one of our vehicles would you like to rent + list of vehicles
        // + different rental prices

        System.out.println("To get started, we just need a couple of details from you.\n");

        //details
        System.out.println("For how many days would you like rent? ");
        int days = keyboard.nextInt();

        surcharge(keyboard);
        optionalCost(keyboard);
        double basicCost = 29.99;
        double totalCost = days * (basicCost + optionalCost() + surcharge());

        //display system
        //Receipt
        System.out.println("Awesome! \nNow that we have all the details we need, \nbelow is the cost breakdown.");

        System.out.println("Vehicle rental $" + basicCost);
        System.out.println("Selected preferences: $" + optionalCost());
        System.out.println("Underage driver surcharge: $" + surcharge());
        System.out.println("Total: $" + totalCost);

    }

  // additional calculations
    //methods.1: optional costs
    public static void optionalCost(Scanner optional){
        System.out.println("We also have some optional but super helpful additions. \nJust ""Y"" or ""N"" for Yes or No.");
        //toll tag
        System.out.println("Electric Toll Tag?");
        String tollTag = optional.nextLine();
        double tollTagCost = 0;
        if(tollTag.equalsIgnoreCase("Y")){
            tollTagCost = 3.95;
        }

        //GPS
        System.out.println("GPS?");
        String gps = optional.nextLine();
        double gpsCost = 0;
        if(gps.equalsIgnoreCase("Y")){
            gpsCost = 2.95;
        }

        //Roadside Assist
        System.out.println("Roadside Assistance?");
        String roadsideAssistance = optional.nextLine();
        double roadsideAssistanceCost = 0;
        if(roadsideAssistance.equalsIgnoreCase("Y")){
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

    }

    //method.2: surcharge costs
    public static void surcharge(Scanner getAge) {
        //build input system
        Scanner ageInput = new Scanner(System.in);
        //1: instructions
        System.out.println("What's your age?");
        //2: input environment
        int age = ageInput.nextInt();

        //3: return type
        double surcharge = 0;
        if(age > 21 && age < 25){
            System.out.println("I see you're under 25. You will get extra protection!");
            surcharge = 29.99 * 0.3;
        }else if(age > 25){
            System.out.println("I see you're over 25. You will be charged at the regular rate");
        }else {
            System.out.println("Sorry, you can't rent a car as a " + age + " years old");
        }
    }
}
