package code;

import java.util.*;
// import java.util.Scanner;

public class Q4ReverseSwapArray {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);

        int[] arr = {1, 2, 34, 56, 4, 97};
        System.out.println(Arrays.toString(arr)); 
        // int idx1 = in.nextInt();
        // int idx2 = in.nextInt();
        // swap(arr, idx1 - 1, idx2 - 1); // by index

        reverse(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }

    }

    static void swap(int[] arr, int index1, int index2) {
        
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
