package Recursion;

public class Q26BinarySearchWithRecursion {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,7,9,12,44,65};
        System.out.println(search(arr, 7, 0, arr.length-1)); 
    }
    
    public static int search(int[] arr, int target, int s, int e) { /** 1. `s & e` ARGUMENT NEED FOR FUTURE PASS*/
        
     /** 3. RETURN base case */   
        if (s > e) {
            return -1;
        }
    /** 2. BODY OF FUNCTION THIS WILL BE SPECIFIC FOR THIS COLM*/
        int mid = s + (e - s) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] > target) {
            return search(arr, target, s, mid - 1);
        }else{
            return search(arr, target, mid + 1, e);
        }
    }
}
