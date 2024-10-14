package Chapter_4;

import java.util.Scanner;

public class OrderTwoCities {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        String firstCity = input.nextLine();
        System.out.print("Enter the second city: ");
        String secondCity = input.nextLine();

        if(firstCity.compareTo(secondCity) < 0) {
            System.out.println("The cities in alphabetical order are " + firstCity + " " + secondCity);
        }else{
            System.out.println("The cities in alphabetical order are " + secondCity + " " + firstCity);
        }
    }
}
