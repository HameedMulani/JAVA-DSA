import java.util.Arrays;

public class Q21setMismatch {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
    public static int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIdx = nums[i] - 1;
            if (nums[i] != nums[correctIdx]) {
                int temp = nums[i];
                nums[i] = nums[correctIdx];
                nums[correctIdx] = temp;
            }else{
                i++;
            }
        }
        // find Duplicate and  missing Number
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        for (int index = 0; index < nums.length; index++) {
            // int correctIdx = nums[index] - 1;
            if (nums[index] != index + 1) {
                ans[0] = nums[index];
                ans[1] = index + 1;
                break;
            }
        }
        return ans;
        
    }
}
