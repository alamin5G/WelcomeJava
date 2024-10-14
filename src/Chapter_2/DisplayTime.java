package Chapter_2;

import java.util.Scanner;

public class DisplayTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter time in seconds: ");
        long seconds = input.nextInt();
        long minutes = seconds / 60;
        seconds = seconds % 60;
        long hours = minutes / 60;
        minutes = minutes % 60;
        int days = (int) hours / 24;
        hours = hours % 24;
        int months = days / 30;
        days = days % 30;
        int years = months / 12;
        months = months % 12;
        System.out.println("Your inputted second equals to " + years + " year " + months + " month " + days + " day " + hours + " hour " + minutes + " minute " + seconds + " seconds");
    }
}
