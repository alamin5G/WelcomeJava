package java384class.arrays;


import java.util.Arrays;

public class StudentScore {

    public static int[] highLow(int[] arr){
        int size = arr.length;
        if (size > 1){
            for (int i = 0; i < size; i++) {
                for (int j = i+1; j < size; j++) {
                    if (arr[i] > arr[j]){
                        swap(arr, i, j);
                    }
                }
            }
        }

        return new int[]{arr[size-1],arr[0]};
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {
        int[] array = {4, 9, 3, 6, 8, 10, 7, 6};

        System.out.println(Arrays.toString(highLow(array)));
    }
}
