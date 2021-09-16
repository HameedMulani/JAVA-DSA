package SearchIn2DArray;

import org.graalvm.compiler.debug.CSVUtil.Escape;

public class findInSortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
    }

    public static int[] search(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length; // be cautioous, matrix may be empty
        if (row == 1) {
            
        }
        
        
        return null;


    }

    public static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;

            if(){
                
            }
        }
    }
}
