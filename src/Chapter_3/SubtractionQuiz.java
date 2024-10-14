package Chapter_3;

import java.util.Scanner;

public class SubtractionQuiz {
    public static void main(String[] args) {
        int num1 = (int) (1 + Math.random() * 10);
        int num2 = (int) (1 + Math.random() * 10);

        System.out.println(num1 + " - " + num2 + " = ?");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        if (answer == num1 - num2){
            System.out.println("You are correct!");
        }else{
            System.out.println("You are incorrect!");
            System.out.println(num1 + " - " + num2 + " should be " + (num1 - num2));
        }
    }
}
