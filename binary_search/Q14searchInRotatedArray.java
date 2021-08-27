package code.binary_search;
// microsoft, amazone

// find pivot(max element in array)
// search in first half  => simple BS (0, pivot)
//othervise, search in second half => (pivot+1, arr.length - 1) 

public class Q14searchInRotatedArray {
    public static void main(String[] args) {
        // int[] nums = {2,2,2,2,3,0,1,2}; // for duplicates
        int[] nums = {3,4,5,6,7,0,1,2};
        int target = 7;
        // System.out.println(searchPivot(nums, 7));
        int ans = search(nums, target);
        System.out.println(ans);
    }

    static int search(int[] nums, int target) {
        int pivot = searchPivot(nums);
        // int pivot = searchPivotInDuplicate(nums); // for duplicates element

        if (pivot == -1) {
            // it means its nt a Rotated Array
            // so, Do Simple Binary Search 
            return binarySearch(nums, target, 0, nums.length - 1);
        }
        if(target == nums[pivot]){
            return pivot;
        }
        if (target >= nums[0]){ // = Equalto Sign need for 1st Element of nums
            return binarySearch(nums, target, 0, pivot - 1);
        }   
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    static int searchPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases(conditions) of finding in roteted array are over here
            if(mid < end && arr[mid] > arr[mid + 1] ){ // case 1
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){ // case 2
                return mid-1;
            }
            if(arr[start] >= arr[mid]){ // case 3 (arr[start] >= arr[mid])
                end = mid - 1;
            }else{ // case 4 (arr[start] < arr[mid])
                start = mid + 1;
            }
        }
        return -1; 
    }


    private static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
           // int mid = (start + end) / 2; // after addition Interger migth be possible limit goes out of range 
           // new way
        int mid  = start + (end - start) / 2;
            
            if (target < arr[mid]) {
                end  = mid - 1;
                // start = mid + 1; for desending order
            }else if(target > arr[mid]){
                start = mid + 1;
                // end = mid - 1; for desending order
            }else{

                //ans found
                return mid;
            }
        }
        
        return -1;
    }

    static int searchPivotInDuplicate(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases(conditions) of finding in roteted array are over here
            if(mid < end && arr[mid] > arr[mid + 1] ){ // case 1
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){ // case 2
                return mid-1;
            }
            // if element at mid, sart, end equal then just skip the duplicates     
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                // skip duplicates
                // NOTE: what if these element at start and end were the pivote??
                // check if start is pivot
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                // check if end pivot
                if(arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so ppivot should be in rigth
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[end] < arr[mid] )){
                start = mid + 1;
           }else{
               end = mid - 1;
           }

        }
        return -1; 
    }
}
