package Recursion.level1Recursion;


public class nto1 {
    public static void main(String[] args) {
        int n = 5;
        // getnNto1fun(n);
        // System.out.println("---");
        // get1toNfuc(n);
        getBoth(n);
    }

    private static void getnNto1fun(int n) {
        // base case
        if (n == 0) {
            return;
        }
        System.out.println(n);
        getnNto1fun(n-1);
    }

    private static void get1toNfuc(int n) {
        //base case 
        if (n == 0) {
            return;
        }
        
        get1toNfuc(n-1);
        System.out.println(n);

    }

    private static void getBoth(int n) {
        //base case 
        if (n == 0) {
            return;
        }  

        System.out.println(n);
        getBoth(n-1);
        System.out.println(n);

    }

}
