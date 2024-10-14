package Chapter_3;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lotteryNumber = (int) (Math.random() * 100);

        System.out.println("Enter your lottery number: (2 digit only) ex- 56");
        int guess = input.nextInt();
        int lotteryDigit1 = guess/10;
        int lotteryDigit2 = guess%10;

        int guessDigit1 = guess/10;
        int guessDigit2 = guess%10;

        System.out.println("Lottery number is " + lotteryNumber);

        if (guess == lotteryNumber){
            System.out.println("Exact Match: you win $10000!");
        }else if(guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1){
            System.out.println("Guess all digits: You win $3000");
        }else if(guessDigit1 == lotteryDigit1 ||
                guessDigit1 == lotteryDigit2 ||
                guessDigit2 == lotteryDigit2 ||
                guessDigit2 == lotteryDigit1){
            System.out.println("Match one digit: you win $1000");
        }else {
            System.out.println("Sorry! Wrong number");
        }
    }
}
