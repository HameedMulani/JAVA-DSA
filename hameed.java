package code;

import java.util.Scanner;

public class hameed {
    public static void main(String[] args) {
        System.out.println("Enter Ur wish marks");
        Scanner input = new Scanner(System.in);
        int percent = input.nextInt();
        percent = percent + 4;
        System.out.println(percent);
    }
}
