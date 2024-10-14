package Chapter_2;

import java.util.Scanner;

public class SalesTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter purchased amount: ");
        double purchasedAmount = input.nextDouble();
        double tax = purchasedAmount * 0.15;
        System.out.println("Tax is $" + tax);
    }
}
