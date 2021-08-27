package code.SORTING;

import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr) {
        //step n - 1
        for (int i = 0; i < arr.length; i++) {
            // find max in remaining arra and swap with correct index
            int last = arr.length - i - 1; 
            /**   last = ""arr.length - i - 1""; 
             * pass 1 : last = 5-0-1 = 4 
             * pass 2 : last = 5-1-1 = 3
             * pass 3 : last = 5-2-1 = 2
             * pass 4 : last = 5-3-1 = 1
             * pass 5 : last = 5-4-1 = 0
             */
            int maxIndex = getMaxIndex(arr, 0, last); // find max
            swap(arr, maxIndex, last); // swap max with last 

        }
    }
        static int getMaxIndex(int[] arr, int start, int end) {
            int max = start;
            for (int i = start; i <= end; i++) {
                if (arr[max] < arr[i]) {
                    max = i;
                }
            }
            return max;
        }

        static void swap(int[] arr, int first, int second) {
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;

        }

        // for (int i = 0 ; i < arr.length ; i++)
        // {
        //     int max = i;
        //     for(int j = i+1 ; j < arr.length ; j++)
        //     {
        //         if(arr[j] < arr[max])
        //         max = j;
        //     }
        //     int temp = arr[i];
        //     arr[i] = arr[max];
        //     arr[max] = temp;

}  
