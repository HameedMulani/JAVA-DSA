package Patterns;
/**
 * "         * 
 *         * * *
 *       * * * * *
 *     * * * * * * *
 *   * * * * * * * * *  "
 * 
 */
public class Hill_Pattern_3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { // [ `Always Patter Start With (i = 1 to N)` ]
            
            for (int j = i; j <= 5; j++){  // Decreasing triangle with Space (j = i to n)
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) { // Increasing triangle with Star (i = 1 to i)
                System.out.print("* ");
            }
            for (int l = 2; l <= i; l++) { // Increasing triangle with Star (i = 2 to i) , because star
                System.out.print("* ");
            }
            
            System.out.println(); // New Line 
        }
    }
}
