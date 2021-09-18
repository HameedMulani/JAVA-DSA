package Patterns;
/**
 *  patter Devided into two Parts above and Below
 *  with the help of 2 triangle prited all trinagle Pattern
 */
public class Damroo_patter_4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            // Increasing Triangle space
            for (int space1 = 1; space1 <= i; space1++) {
                System.out.print("  ");
            }
            // Decreasing Triangle Star
            for (int star1dec = i; star1dec <= 5; star1dec++){
                System.out.print("* ");
            }
            // decreasing trinagle start but start form 2
            for (int star2dec = i; star2dec < 5 ; star2dec++) {
                System.out.print("* ");
            }
            // New Line
            System.out.println();
        }

        // Part 2
        for (int i = 1; i <= 5; i++) {
            // Decreasing triangle Space
            for (int space2 = i; space2 <= 5; space2++){
                System.out.print("  ");
            }
            // increasing Triangle star
            for (int star1in = 1; star1in <= i; star1in++) {
                System.out.print("* ");
            }

            // increasing triangle start but start from 2      
            for (int star2in = 2; star2in <= i; star2in++) {
                System.out.print("* ");
            }
            // New line 
            System.out.println();
        }
    }
    
} 
