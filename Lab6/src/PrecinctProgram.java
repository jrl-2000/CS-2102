//Jonathan Lopez
//CS 2102 B term 2020
//Lab 6

import java.util.Scanner;

public class PrecinctProgram {

    public static void main(String[] args){
        System.out.println("hello, world");
        String message = "hello, world";
        System.out.println(message);
        int day;
        day = 17;
        System.out.println("Today is Wed, Nov " + day + ".");
        Precinct worcester12;
        worcester12 = new Precinct("Worcester12", "130 Winter Street", 1673);
        System.out.println(worcester12);
        Scanner keyboard = new Scanner(System.in);
        int day1 = 7;
        System.out.println("Here's today's date:" + "Nov" + day + "," + "2010");
        int day2 = 7;
        System.out.println("Here's today's date: " + "Nov " + day + ", " +" 2010");
        int num1;
//        int num2;
//
//        num1 = keyboard.nextInt();
//        num2 = keyboard.nextInt();
        Precinct w12 = new Precinct("Worcester 12", "130 Winter Street", 1673);
        System.out.println("Enter the new population: ");
        int newPopulation = keyboard.nextInt();
        System.out.println("Enter the new name: ");
        keyboard.nextLine(); // Skips to the next line to prevent the name
        // reading to be ""
        String newName = keyboard.nextLine();
        System.out.println("Enter the new address: ");
        String newAddress = keyboard.nextLine();
        Precinct newW12 = new Precinct(newName, newAddress, newPopulation);
        System.out.println(newW12.toString());



    }



}
