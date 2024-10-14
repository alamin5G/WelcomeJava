package Chapter_2;

import java.util.Scanner;

public class ComputeAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        double average = (double) (a + b + c) / 3;
        System.out.println("The average is " + (average * 100)/ 100.0);
    }

}
