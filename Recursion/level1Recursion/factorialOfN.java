package Recursion.level1Recursion;

public class factorialOfN {
    public static void main(String[] args) {
        int n = 0;
        System.out.println(factorial(n));
    }

    private static long factorial(long n) {
        // base case 
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n-1);

    }
}
