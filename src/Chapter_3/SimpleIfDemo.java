package Chapter_3;

import java.util.Scanner;

public class SimpleIfDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("HiEven");
        }

        if (num % 5 == 0) {
            System.out.println("Hi-Five");
        }
    }
}
