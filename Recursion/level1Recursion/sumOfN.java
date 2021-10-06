package Recursion.level1Recursion;

public class sumOfN {
    public static void main(String[] args) {
        int n = 15;
        System.out.println(sum(n));
    }

    private static long sum(long n) {   
        // base case 
        if (n <= 1) {
            return 1;
        }

        return n + sum(n-1);
    }
}
