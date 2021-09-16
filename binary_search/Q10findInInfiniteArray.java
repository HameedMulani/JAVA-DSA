package code.binary_search;
/**
 * Qestion link 
 * Compony = Amazon 
 * https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
 */
public class Q10findInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170,321,434,544,600,650, 699, 700, 750,780,790,799, 820};
        int target = 140;
        System.out.println(findSmallToBig(arr, target));
    }

    static int findSmallToBig(int[] arr, int target){
        // first find the range
        // first find with a box of size =  2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while (target > arr[end]) {
            int newStart = end + 1;
            // double the box{arr} value
            // end = previous end + sizeofbox * 2
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        int ansindex = binarySearch(arr, target, start, end);
        return ansindex;
    }
    private static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
           // int mid = (start + end) / 2; // after addition Interger migth be possible limit goes out of range 
           // new way
        int mid  = start + (end - start) / 2;
            
            if (target < arr[mid]) {
                end  = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                //ans found
                return mid;
            }
        }
        
        return -1;
    }

}
