package Chapter_10;

import java.util.Date;
import java.util.Scanner;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    public Loan(){

    }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.loanDate = new Date();
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public int getNumberOfYears() {
        return numberOfYears;
    }
    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }
    public double getLoanAmount() {
        return loanAmount;
    }
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Date getLoanDate() {
        return loanDate;
    }
    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public double getMonthlyPayment(){
        double monthlyInterestRate = getAnnualInterestRate()  / 1200;
        return getLoanAmount() * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, getNumberOfYears() * 12)));

    }

    public double getTotalPayment(){
        return getMonthlyPayment() * getNumberOfYears() * 12;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter annual interest rate: ");
        double annualInterestRate = input.nextDouble();
        System.out.println("Enter number of years: ");
        int numberOfYears = input.nextInt();
        System.out.println("Enter loan amount: ");
        double loanAmount = input.nextDouble();
        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);
        System.out.println("Loan was created successfully on " + loan.getLoanDate() +  " for a total of " + loan.getLoanAmount());
        System.out.println("Monthly payment is " +  loan.getMonthlyPayment());
        System.out.println("Total payment is " + loan.getTotalPayment());

    }
}
