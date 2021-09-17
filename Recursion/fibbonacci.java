package Recursion;
/** 
 * 0, 1, 2, 3, 5, 8, 13,.. n 
 * 0th + 1th = 2th
 * (n-2)th + (n-1)th = nth // common sence
 */
public class fibbonacci {
    public static void main(String[] args) {
        
        int n = 7;
        int ans = fibo(n);
        System.out.println(ans);
    }

    private static int fibo(int n) {
        if(n == 0){
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibo(n - 2) + fibo(n - 1);
    }
}
