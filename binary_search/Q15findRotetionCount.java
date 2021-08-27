package code.binary_search;

// find pivot in rotated array
// ans = pivot + 1;

public class Q15findRotetionCount {
    public static void main(String[] args) {
        int[] nums = {3,4,5,6,7,0,1,2};
        System.out.println(countRotation(nums));
    }
    static int countRotation(int[] arr){
        int count = searchPivot(arr) ;
        return count + 1;
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
}