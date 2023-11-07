package Listing_5;

import java.util.Random;
import java.util.Scanner;

public class RepeatAdditionQuiz {
    public static void main(String[] args){
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        Scanner input = new Scanner(System.in);
        System.out.println("What is " + number1 + " + " + number2 + " = ?");
        int result = input.nextInt();
        while (number1+number2 != result){
            System.out.println("Your answer was wrong! Try again!");
            result = input.nextInt();
        }
        System.out.println("Your answer is correct!");
    }
}
