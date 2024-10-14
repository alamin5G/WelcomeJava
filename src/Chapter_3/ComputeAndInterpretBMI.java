package Chapter_3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ComputeAndInterpretBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter the height in inches: ");
        double height = input.nextDouble();

        final double KILOGRAMS_PER_POUND = 0.45359237; // Constant
        final double METERS_PER_INCH = 0.0254; // Constant

        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = height * METERS_PER_INCH;
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("BMI is " + df.format(bmi));

        if (bmi < 18.5) {
            System.out.println("You are underweight");
        }else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("You are normal");
        }else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("You are overweight");
        }else{
            System.out.println("Obese");
        }
    }
}
