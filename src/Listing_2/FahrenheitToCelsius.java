package Listing_2;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Fahrenheit Degree: ");
        double fahrenheit = input.nextDouble();

        //convert fahrenheit to celsius
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println(fahrenheit + " degree fahrenheit is equal to " + celsius + " degree celsius.");
    }
}
