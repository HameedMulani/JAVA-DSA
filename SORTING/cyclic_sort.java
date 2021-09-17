package code.SORTING;
import java.util.*;

/**
 * cyclic_sort(VIP) (check-swap-move)
 * Company: Amazon, Google, Microsoft
 * Time Complexcity : Linear-O(n) // Only One Loop (while)
 */
public class cyclic_sort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 1, 3}; // array should be "Continous" or in range 0 to (n) // not a Stable
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            // correctIdx of Element should be element - 1 
            // eg: element -> 3 = index -> 2 i.e = arr[i] - 1,  index = element - 1 
            int correctIdx = arr[i] - 1; 
            if (arr[correctIdx] != arr[i]) {
                // if the not Equal to there corresponding index then Swap
                swap(arr, i, correctIdx); 
            }else{
                i++;
            }
        }
    }

    private static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}