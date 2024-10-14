package Chapter_3;

import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {
        int num1 = (int) (System.currentTimeMillis()%10);
        int num2 = (int) ((System.currentTimeMillis()/10)%10);

        System.out.println("What is " + num1 + " + " + num2 + " = ?");
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();
        sc.close();
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2 == answer));
    }
}
