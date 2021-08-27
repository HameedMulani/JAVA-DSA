package code.binary_search;

import java.util.Arrays;

public class Q9FindFirstandLastPositionofElement {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 7;
        int[] ans = searchRange(nums, target);
        System.out.println(Arrays.toString(ans));
        
    }

    static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};
        // check accurance 
        int start = searchNumber(nums, target, true); // check First accurence
        int end = searchNumber(nums, target, false); // check Last accurrence
        
        ans[0] = start;
        ans[1] = end;
        return ans; 
    }

    static int searchNumber(int[] nums, int target, boolean findStartIndex){

        int start = 0;
        int end = nums.length - 1;

        int ans = -1;

        while (start <= end) {
           // int mid = (start + end) / 2; // after addition Interger migth be possible limit goes out of range 
           // new way
        int mid  = start + (end - start) / 2;
            
            if (target < nums[mid]) {
                end  = mid - 1;
            }else if(target > nums[mid]){
                start = mid + 1;
            }else{
                // potential ans found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
