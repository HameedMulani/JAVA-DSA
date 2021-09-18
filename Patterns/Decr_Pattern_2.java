package Patterns;
/**
 * VIP
 * DECREASING PATTERN [i = 1-n & j = i-n]
 */
public class Decr_Pattern_2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// Output:
/**
 * "    * * * * * 
 *      * * * *
 *      * * *
 *      * *
 *      *          "
 */
