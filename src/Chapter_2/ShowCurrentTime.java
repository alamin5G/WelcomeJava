package Chapter_2;

import java.util.Scanner;

public class ShowCurrentTime {
    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();
        long totalSecond = currentTimeMillis / 1000;
        currentTimeMillis %= 1000;

        long totalMinute = totalSecond / 60;
        totalSecond %= 60;

        long totalHour = totalMinute / 60;
        totalMinute %= 60;

        totalHour = totalHour % 24;
        System.out.println("Current Time: " + totalHour + ":" + totalMinute + ":" + totalSecond + " GMT");



    }
}
