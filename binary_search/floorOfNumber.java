package code.binary_search;

public class floorOfNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 8, 13, 15, 18, 19, 20, 26, 36, 39, 41, 48};// asending order
        int target = 25;
        int ans = findFloorNumber(arr, target);
        System.out.println(ans);
    }

    private static int findFloorNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if(target > arr[arr.length - 1]){
            return -1;
        }

        while (start <= end) {
           // int mid = (start + end) / 2; // after addition Interger migth be possible limit goes out of range 
        //    new way
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
        
        return end;
    }
}
