package Chapter_2;

import java.text.DecimalFormat;
import java.util.Formatter;
import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat  df = new DecimalFormat("#.##");

        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Fahrenheit to " + df.format(celsius) + " degrees Celsius");
    }
}
