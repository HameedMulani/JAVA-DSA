
/**
 * QAllMissingInArray
 * company: google
 * link: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
 */
import java.util.*;


public class Q18AllMissingInArray {
public static void main(String[] args) {
    int[] arr = {4,3,2,7,8,2,3,1};
    sort(arr);
    System.out.println(missingNumber(arr));
}
    /** sort array */
    public static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            // correctIdx of Element should be element - 1 
            // eg: element -> 3 = index -> 2 i.e = arr[i] - 1 
            // index = element - 1 
            int correctIdx = arr[i] - 1; 
            if (arr[correctIdx] != arr[i]) {
            // if the not Equal to there corresponding index then Swap
                    swap(arr, i, correctIdx); 
            }else{
                i++;
            }
        }
     }
        // SEARCH FOR ALL MISSING NUMBER
        public static ArrayList<Integer> missingNumber(int arr[]) {
                ArrayList<Integer> list = new ArrayList<>();
                for (int index = 0; index < arr.length; index++) {
                    if (arr[index] != index + 1 ) {
                        list.add(index + 1);
                    }
                }
                return list;
            }
    
        public static void swap(int[] arr, int first, int last) {
                int temp = arr[first];
                arr[first] = arr[last];
                arr[last] = temp;
            }
    
}