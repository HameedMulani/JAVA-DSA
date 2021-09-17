package Recursion;

/**
 * NumberExampleWithRecursion
 */
public class NumberExampleWithRecursion {
    public static void main(String[] args) {
        print(1);
    }

    public static void print(int n) {
        // Base condition || Edge Case
        if (n > 5) {
            return;
        }

        System.out.println(n);
        print(n+1);
    }
    
}