package Chapter_4;

import java.util.Scanner;

public class HexDigit2Dec {
    public static void main(String[] args) {
        System.out.print("Enter a Hexa Digit: ");
        Scanner input = new Scanner(System.in);
        String hex = input.nextLine();

        if (hex.length() != 1) {
            System.out.println("You must enter exactly one digit!");
            System.exit(0);
        }

        char ch = hex.toUpperCase().charAt(0);
        if (ch >= 'A' && ch <= 'F') {
            int value = ch - 'A' + 10;
            System.out.println("The decimal value is " + value + " for hexadecimal digit " + ch);
        }else if (Character.isDigit(ch)) {
            System.out.println("The decimal value is " + ch + " for hexadecimal digit" + ch);
        }else {
            System.out.println("Invalid input");
        }


    }
}
