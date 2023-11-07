package Listing_2;

import java.util.Scanner;

public class ComputeAreaWithConstant {
    public static void main(String[] args){
        final double PI = 3.14159 ; //declaring one constant

        Scanner input = new Scanner(System.in);

        System.out.print("Insert the radius value: ");
        double radius =  input.nextDouble();
        double area = radius * radius * PI;
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}
