package Listing_2;

import java.util.Scanner;

public class ComputeArea {
    public static void main(String[] args) {
        double radius;
        double area;

        System.out.print("Insert the radius of the circle: ");
        Scanner input = new Scanner(System.in);
        radius = input.nextDouble();
        area = radius * radius * 3.14159;
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}
