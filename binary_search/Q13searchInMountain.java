package code.binary_search;

public class Q13searchInMountain {

    public static int main(String[] args) {
        int[] arr ={0,1,2,4,2,1};
        int peak = peakIndexInMountainArray(arr);
        int target = 3;
        int firstTry =  orderAgnosticBS(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }
        return orderAgnosticBS(arr, target, peak+1, arr.length-1);
    }


    static int orderAgnosticBS(int[] arr, int target, int start, int end){
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
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        
            while(start < end){
                int mid = start + (end - start) / 2;

                if(arr[mid] > arr[mid + 1]){
                    // it means u r in Decrearing Order
                    // mid also the ans
                    end = mid;
                }else{
                    // it means u r in Increasing Order 
                    // we knows that [mid + 1] element is > mid so, we ignoring mid element
                    start = mid + 1;
                } 
            }
        // because of the 2 checks above the come at best element
        // break when start == end 
        return start; 
        }

}

