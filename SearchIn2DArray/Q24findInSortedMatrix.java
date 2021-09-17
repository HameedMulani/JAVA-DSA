package SearchIn2DArray;

import java.util.Arrays;

public class Q24findInSortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        int target = 1;
        System.out.println(Arrays.toString(search(arr, target)));
    }

    public static int[] search(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length; // be cautioous, matrix may be empty
        if (row == 1) {
            return binarySearch(matrix, 0, 0, col-1, target);
        }

        int rStart = 0;
        int rEnd = row - 1;
        int cMid = col / 2;
        // run the loop till 2 rows are remaining // (binary Search in Martix)
        while (rStart < (rEnd - 1)) { // when this is ture it will have more than 2 rows
            int mid = rStart + (rEnd - rStart) / 2;
            if(matrix[mid][cMid] == target){
                return new int[]{mid, cMid};
            }
            if(matrix[mid][cMid] < target ){
                rStart = mid;
            }else{
                rEnd = mid; 
            }      
        }

        // now we have 2 rows
        // check whether the target is in col of 2 rows
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }if (matrix[rEnd][cMid] == target) {  // here, rEnd == rStart + 1 both are same
            return new int[]{rEnd, cMid};
        }

        // search in 1st half
        if (target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }
        // search in 2st half
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][col - 1]) {
            return binarySearch(matrix, rStart, cMid + 1 , col - 1, target);
        }
        // search in 3st half
        if (target <= matrix[rEnd][cMid - 1]) {
            return binarySearch(matrix, rEnd, 0, cMid - 1, target);
        }else{
            //  search in 4st half
            /** condition : (target >= matrix[rStart + 1][cMid + 1])  */
            return binarySearch(matrix, rEnd, cMid + 1 , col - 1, target);
        }

    }

    /** simple binary search who apply on individual row + pearticular col to col 
     * search in the row privided between colms provided
    */
    public static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if(matrix[row][mid] == target){        // mid == target
                return new int[]{row, mid};
            }
            if(matrix[row][mid] > target){        // mid > target
                cEnd = mid - 1;
            }else{              
                cStart = mid + 1;                  // mid < target
            }
        }
        return new int[]{-1,-1};
    }
}
