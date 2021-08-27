package code.binary_search;


public class Q8findSmallestGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = {'a', 'c', 'd','j'};
        char target = 'j';
        System.out.println(nextGreatestLetter(letters, target));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
           // int mid = (start + end) / 2; // after addition Interger migth be possible limit goes out of range 
           // new way
        int mid  = start + (end - start) / 2;
            
            if (target < letters[mid]) {
                end  = mid - 1;
                // start = mid + 1; for desending order
            }else{
                start = mid + 1;
                // end = mid - 1; for desending order
            }
        }
        // start = 4 
        // length = 4 
        // 4 % 4 = 0(leetcode Condition), 2 % 4 = 2, 3 % 4 = 3
        return letters[start % letters.length];

    }
    
}