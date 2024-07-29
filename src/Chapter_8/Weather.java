package Chapter_8;

public class Weather {
    public static void main(String[] args) {
        final int NUMBER_OF_DAYS = 10;
        final int NUMBER_OF_HOURS = 24;

        int[][][] array = {
                {{1, 2}, {3, 4}},
                {{5, 6},{7, 8}}
        };
        System.out.print(array[0][0][0]);
        System.out.println(" "+ array[0][0][1]);
        System.out.print(array[0][1][0]);
        System.out.println(" "+ array[0][1][1]);
        System.out.print(array[1][0][0]);
        System.out.println( " " + array[1][0][1]);
        System.out.print(array[1][1][0]);
        System.out.println( " " + array[1][1][1]);
    }
}
