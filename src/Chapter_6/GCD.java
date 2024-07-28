package Chapter_6;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("The GCD for " + a + " and " + b + " is " + " = " + gcd(a, b));
    }

    private static int gcd(int a, int b) {
        int gcd = 1;
        int k = 2;
        while (k <= a && k <= b) {
            if (a % k == 0 && b % k == 0) {
                gcd = k;
            }
            k++;
        }
        return gcd;
    }
}
