package Listing_2;

public class DisplayCurrentTime {
    public static void main(String[] args){
        long totalMilliSeconds  = System.currentTimeMillis();
        long totalSeconds       = totalMilliSeconds / 1000;
        long currentSeconds     = totalSeconds % 60;
        long totalMinutes       = totalSeconds / 60;
        long currentMinutes     = totalMinutes % 60;
        long totalHours         = totalMinutes / 60;
        long currentHours       = totalHours % 24;
        System.out.println("Current time is " + (currentHours+6) + ":" + currentMinutes + ":" + currentSeconds + " GMT");

    }
}
