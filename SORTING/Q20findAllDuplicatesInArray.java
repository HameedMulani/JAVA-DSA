
/**
 * company: amazone microsoft
 */
import java.util.*;
public class Q20findAllDuplicatesInArray {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));
    }
    public static List<Integer> findDuplicates(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < arr.length) {
            int correctIdx = arr[i] - 1;
            if (arr[i] != arr[correctIdx]) {
                swap(arr, i, correctIdx);
            }else{
                i++;
            }
        }
        // all Duplicates
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                list.add(arr[index]);
            }
        }

        return list;
    }
    private static void swap(int[] arr, int i, int correctIdx) {
        int temp = arr[i];
        arr[i] = arr[correctIdx];
        arr[correctIdx] = temp;
    }
}
