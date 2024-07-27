package Listing_2;

import java.util.Scanner;

public class ComputingLoan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter annual interest rate: eg-7.5");
        double annualInterestRate = sc.nextDouble();

        double monthlyInterestRate = annualInterestRate / 1200;

        System.out.println(monthlyInterestRate);

        System.out.println("Enter number of years: ");
        int numberOfYears = sc.nextInt();
        System.out.println("Enter loan amount: ");
        double loanAmount = sc.nextDouble();

        //calculate payment
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears*12));
        double totalPayment = monthlyPayment * numberOfYears * 12;
        System.out.println(totalPayment);
        System.out.println(monthlyPayment);
        System.out.println("Total payment: " + (int) (totalPayment*100)/100.0);
        System.out.println("Monthly Payment: " + (int) (monthlyPayment*100)/100.0);

    }
}
