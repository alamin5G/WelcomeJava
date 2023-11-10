package Listing_7;

public class ReturnArrayFromMethod {
    public static void main(String[] args){

        int[] list;
        list = new int[]{7, 6, 5, 4, 3, 2, 1};

        int[] reverse = reverse(list);
        for (int i:reverse) {
            System.out.println(i);
        }

    }

    public static int[] reverse(int[] list){
        int[] result = new int[list.length];

        for(int i = 0, j = result.length-1; i < list.length; i++, j--){
            result[j] = list[i];
        }

        return  result;
    }
}
