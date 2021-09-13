import java.util.*;
/**
 * Q17MissingNumber
 * link: 
 */
class Q17MissingNumber {
    public static void main(String[] args) {
        int[] arr = {6, 0, 2, 1, 3};
        sort(arr);
        System.out.println(findMissingNumber(arr));
    }

    public static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            // correctIdx of Element should be element 
            // eg: element -> 3 = index -> 3 i.e = arr[i] 
            // index == element
            int correctIdx = arr[i]; 
            if (arr[i] < arr.length && arr[correctIdx] != arr[i]) {
                // if the not Equal to there corresponding index then Swap
                swap(arr, i, correctIdx); 
            }else{
                i++;
            }
        }
    }

    public static int findMissingNumber(int arr[]) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }
        return arr.length;
    }

    private static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
