package SearchIn2DArray;

import java.util.Arrays;

/**
 * Time Complexity : N * N
 * O(n^2) (two for loop) 
 */
public class SearchIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {45,67,91}
            {54,63,26}
        };
        int target = 26;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] search(int[][] arr, int target) {
        int[] ans = new int[2]; // O(1)
        ans[0] = -1;
        ans[1] = -1;

        for (int i = 0; i < arr[0].length; i++) { // N
            for (int j = 0; j < arr[i].length; j++) { // N
                if (arr[i][j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }
}
