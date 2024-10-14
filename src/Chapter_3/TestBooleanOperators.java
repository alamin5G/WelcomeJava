package Chapter_3;

import java.util.Scanner;

public class TestBooleanOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int a = input.nextInt();
        if (a % 2 == 0 && a % 3 == 0) {
            System.out.println(a + " is divisible by 2 and 3");
        }

        if (a % 3 == 0 || a % 2 == 0) {
            System.out.println(a + " is divisible by 3 or 2");
        }

        if (a % 2 == 0 ^ a % 3 == 0) {
            System.out.println(a + " is divisible by 2 or 3 but not both");
        }
    }
}
