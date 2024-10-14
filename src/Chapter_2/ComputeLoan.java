package Chapter_2;
import java.util.Scanner;

public class ComputeLoan{
    public static void main(String[] arg){


        Scanner input= new Scanner (System.in);

        System.out.print("Scan AnnualInterest Rate: ");
        double annualInterestRate=input.nextDouble();

        double monthlyInterestRate=annualInterestRate/1200;

        System.out.print("Scan Number of Year: ");
        double numberOfYears=input.nextDouble();

        System.out.print("Scan Total Loan Amount: ");
        double loanAmount=input.nextDouble();

       if (numberOfYears > 0){
           double monthlyPayment= (loanAmount * monthlyInterestRate) / (1- 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
           double totalYearlyPayment= monthlyPayment * numberOfYears * 12;


           System.out.println("The monthly payment is ="+(int)((monthlyPayment*100)/100.0));
           System.out.println("The total payment is   ="+ (int)((totalYearlyPayment*100)/100.0));

       }else {
           System.out.println("make sure the year is greater than 0");
       }
    }

}
