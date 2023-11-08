package Listing_5;

import java.util.Scanner;

public class MethodLearning {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number that will count sum from 1 to your number: ");
        int times = input.nextInt();

        int sum = sumOfNumber(times);
        System.out.println("The sum of 1 to " + times + " = " + sum); // sum printed here
    }

    private static int sumOfNumber(int times) {
         int value = 0;
        for ( int i = 1; i <= times; i++) {
            value = value + i;
        }
        return value; // returned
    }
}
