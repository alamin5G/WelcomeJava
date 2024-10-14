package Chapter_4;

import java.util.Scanner;

public class LotteryUsingStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lottery = "" + (int) (Math.random() * 10) + (int) (Math.random() * 10);
        System.out.print("Enter your lottery pick (two digits): ");
        String guess = sc.nextLine();

        // Get digits from lottery
        char lotteryDigit1 = lottery.charAt(0);
        char lotteryDigit2 = lottery.charAt(1);

        // Get digits from guess
         char guessDigit1 = guess.charAt(0);
         char guessDigit2 = guess.charAt(1);

        System.out.println("Lottery number is " + lottery);

        if (guess.equals(lottery)) {
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
