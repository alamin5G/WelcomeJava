package Listing_2;

import java.util.Scanner;

public class MilesToKilometer {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input your miles: ");
        double miles = input.nextDouble();
        final double KILOMETERS_PER_MILE = 1.609;
        double kiloMeter = miles * KILOMETERS_PER_MILE;
        System.out.println(miles + " miles in Kilometer is " + kiloMeter);
    }
}
