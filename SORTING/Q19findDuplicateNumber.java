/**
 * company : microsoft
 */

public class Q19findDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,2};
        System.out.println(findDuplicate(arr));
    }
    public static int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                // correctIdx of Element should be element - 1 
                // eg: element -> 3 = index -> 2 i.e = arr[i] - 1 
                // index = element - 1 
                int correctIdx = arr[i] - 1; 
                if (arr[correctIdx] != arr[i]) {
                    // if the not Equal to there corresponding index then Swap
                    swap(arr, i, correctIdx); 
                }else{
                    return arr[i];
                }
            
            }else{
                i++;
            }
        }
        return -1;
        
    }

    public static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
