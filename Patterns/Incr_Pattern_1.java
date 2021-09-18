package Patterns;

/**
 * VIP
 * Pattern_1 
 * INCREASING PATTERN i = 1 - n and j = 1 - i [TRICk]
 */
public class Incr_Pattern_1 {
public static void main(String[] args) {
    for (int i = 1 ; i <= 5; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
    
}

// Output:

/**     * * * * * 
 *      * * * *
 *      * * *
 *      * *
 *      *
 */