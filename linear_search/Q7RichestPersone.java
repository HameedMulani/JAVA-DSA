package code.linear_search;

/**
 * RichestPersone
 */
public class Q7RichestPersone {
    public static void main(String[] args) {
        
    }
    // person = row
    // accout = col
    public int maximumWealth(int[][] accounts) {

        int max = Integer.MIN_VALUE;

        for (int[] account2 : accounts) {
            //for every row take nee sum 
            int rowsum = 0;
            for (int element : account2) {
                rowsum = rowsum + element;
            }
           // now we have sum of accounts of person
            // check with overall ans
            if(rowsum > max){
                max = rowsum;
            }
        }
        return max;

        
    }
    
}