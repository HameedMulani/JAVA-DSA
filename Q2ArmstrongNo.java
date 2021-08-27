package code;

import java.util.Scanner;

public class Q2ArmstrongNo {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        System.out.println(arm(n));
        // for (int i = 100; i < 1000; i++) {
        //     if(arm(i)){
        //         System.out.println(i);
        //     }
        // }
    }

    static boolean arm(int n){
        int original = n;
        int sum = 0;

        while (n > 0){
            int rem = n % 10;
            int cube = rem * rem * rem;
            sum += cube;
            n = n / 10;
        }
        return sum == original;
    }
}
