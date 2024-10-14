package Chapter_4;

import java.util.Scanner;

public class GuessBirthday {
    public static void main(String[] args) {
        String set1 = " 1 3 5 7\n" +
                 " 9 11 13 15\n" +
                 "17 19 21 23\n" +
                 "25 27 29 31";

        String set2 = " 2 3 6 7\n" +
                 "10 11 14 15\n" +
                 "18 19 22 23\n" +
                 "26 27 30 31";

        String set3 =" 4 5 6 7\n" +
                 "12 13 14 15\n" +
                 "20 21 22 23\n" +
                 "28 29 30 31";

        String set4 =" 8 9 10 11\n" +
                 "12 13 14 15\n" +
                 "24 25 26 27\n" +
                 "28 29 30 31";

        String set5 ="16 17 18 19\n" +
                 "20 21 22 23\n" +
                 "24 25 26 27\n" +
                 "28 29 30 31";

        int day = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Is your birthday on set 1? ");
        System.out.println("Set1: " + set1);
        System.out.println("-------------------------");
        System.out.print("Enter 1 for yes and 0 for no: ");
        int answer = input.nextInt();
        if (answer == 1) {
            day = day + 1;
        }

        System.out.println("Is your birthday on set 2? ");
        System.out.println("Set2: " + set2);
        System.out.println("-------------------------");
        System.out.print("Enter 1 for yes and 0 for no: ");
        answer = input.nextInt();
        if (answer == 1) {
            day = day + 2;
        }

        System.out.println("Is your birthday on set 3? ");
        System.out.println("Set3: " + set3);
        System.out.println("-------------------------");
        System.out.print("Enter 1 for yes and 0 for no: ");
        answer = input.nextInt();
        if (answer == 1) {
            day = day + 4;
        }
        System.out.println("Is your birthday on set 4? ");
        System.out.println("Set4: " + set4);
        System.out.println("-------------------------");
        System.out.print("Enter 1 for yes and 0 for no: ");
        answer = input.nextInt();
        if (answer == 1) {
            day = day + 8;
        }
        System.out.println("Is your birthday on set 5? ");
        System.out.println("Set5: " + set5);
        System.out.println("-------------------------");
        System.out.print("Enter 1 for yes and 0 for no: ");
        answer = input.nextInt();
        if (answer == 1) {
            day = day + 16;
        }

        System.out.println("Your Birthday is: " + day);

    }
}
