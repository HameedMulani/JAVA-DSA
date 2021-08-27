package code;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLIst {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // initialization -> default Value is Null like Array
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }

        //add Elements
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                list.get(row).add(in.nextInt());  
            }
            
        }

       // output by interation
       for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(list.get(row).get(col) + " ");
            }
            System.out.println();
        }

        // output by sysout
        System.out.println(list);

        
    }
}
