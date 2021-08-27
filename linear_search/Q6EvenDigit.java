package code.linear_search;

public class Q6EvenDigit {
 
  public static void main(String[] args) {
      int[] nums = {12,345,2,6,7896};
      System.out.println(findNumbers(nums));
      System.out.println(digits2(232321));
  }  

    static int findNumbers(int[] nums) {
        int count = 0;
        for(int number: nums){
            if (even(number)) {
                count++;
            }
        }
        return count;
    }

    //fucntion to check wheather even or not
        static boolean even(int number) {
            
            int numberOfDigits = digits(number);
         /* 
            if(numberOfDigits % 2 == 0){
                return true;
            }
            return false;
         */
            return numberOfDigits % 2 == 0;
        }

        static int digits2(int number){
            if (number < 0) {
                number = number * -1; // -2 * -1 = 2
            }
            return (int)(Math.log10(number)) + 1;
        }

        static int digits(int number){

            if (number < 0) {
                number = number * -1; // -2 * -1 = 2
            }

            if(number == 0){
                return 1;
            }

            int count = 0;
            while (number > 0) {
                count++;
                number = number / 10;
            }
            return count;
        }
}
