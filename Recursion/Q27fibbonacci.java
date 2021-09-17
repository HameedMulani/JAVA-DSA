package Recursion;
/** 
 * 0, 1, 2, 3, 5, 8, 13,.. n 
 * 0th + 1th = 2th
 * (n-2)th + (n-1)th = nth // common sence
 * 
 * time complexity: many says O(2^n) some correct 
 * but it is O((goldenRatio)^n) correct very bad
 * 
 */
public class Q27fibbonacci {
    public static void main(String[] args) {
        
        int n = 49; // for int n = 50; not getting ans by computer 
        int ans = fibo(n);
        System.out.println(ans);
    }

    private static int fibo(int n) { 
        // Base Case
        if (n <= 1)
            return n;

        // Recursive call
        return fibo(n - 2) + fibo(n - 1);
    }
}