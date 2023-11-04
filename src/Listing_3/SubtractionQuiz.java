package Listing_3;

import java.util.Scanner;

public class SubtractionQuiz {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //Generating random numbers
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        if (number1 <= number2){
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        System.out.print("What is " + number1 + " - " + number2 + " = ? ");
        int result = input.nextInt();

        if (number1-number2 == result){
            System.out.println("Your answer is correct!");
        }else {
            System.out.println("Your answer is wrong!");
        }

    }
}

