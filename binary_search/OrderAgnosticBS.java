package code.binary_search;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        // int[] arr = { 1, 3, 5, 8, 13, 15, 18, 19, 20, 26, 36, 39, 41, 48};// asending order/ increasing
        int[] arr = {90 ,80, 75, 50 ,45, 40, 30 ,25, 21, 20, 10, 1}; // decsending order/ decreasing
        int target = 21; // index 8
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }


    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending or descending 
        boolean isAsc = arr[start] < arr[end];
        // if (arr[start] < arr[end]) {
        //     isAsc = true;
        // }else{
        //     isAsc = false;
        // }
        while (start <= end) {
           // int mid = (start + end) / 2; // after addition Interger migth be possible limit goes out of range 
           //new way
            int mid  = start + (end - start) / 2;
           
            if(arr[mid] == target){
                return mid;
            }
            
            if(isAsc){
                if (target < arr[mid]) {
                    end  = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if (target > arr[mid]) {
                    end  = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        
        }
        return -1;
    }
}
