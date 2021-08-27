package code;

public class Q3print3digitArmstring {
    public static void main(String[] args) {
        
        for (int i = 100; i < 1000; i++) {
            if(arm(i)){
                System.out.println(i);
            }
        }
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
