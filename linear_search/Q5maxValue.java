package code.linear_search;

import java.util.Arrays;
import java.util.Scanner;

public class Q5maxValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = {1, 2, 34, 56, 4};
        System.out.println(Arrays.toString(arr));

        System.out.println(maxVal(arr)); 
    }

    private static int maxVal(int[] arr) {

        int max = arr[0];
        int i = 0;
        while(i < arr.length){
            if (arr[i] >= max) {
                max = arr[i];
            }
            i++;
        }
        return max;
    }
}
