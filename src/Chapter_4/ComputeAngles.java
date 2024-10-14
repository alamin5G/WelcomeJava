package Chapter_4;

import java.util.Scanner;

public class ComputeAngles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the x point 1: ");
        double x = input.nextDouble();
        System.out.print("Enter the y point 1: ");
        double y = input.nextDouble();

        System.out.print("Enter the x point 2: ");
        double x2 = input.nextDouble();
        System.out.print("Enter the y point 2: ");
        double y2 = input.nextDouble();

        System.out.print("Enter the x point 3: ");
        double x3 = input.nextDouble();
        System.out.print("Enter the y point 3: ");
        double y3 = input.nextDouble();

        double a = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        double b = Math.sqrt((x - x3) * (x - x3) + (y - y3) * (y - y3));
        double c = Math.sqrt((x - x2) * (x - x2) + (y - y2) * (y - y2));

        double A = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
        double B = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
        double C = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));

        // Display results
        System.out.println("The three angles are " + Math.round(A * 100) / 100.0 + " " +
                Math.round(B * 100) / 100.0 + " " + Math.round(C * 100) / 100.0);
    }
}
