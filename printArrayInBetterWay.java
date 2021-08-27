package code;

import java.util.*;
import java.util.Scanner;
public class printArrayInBetterWay {

    public static void main(String[] args) {
   
        Scanner in = new Scanner(System.in);
        
        int[] arr = new int[5];
        
        
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        
        for(int i : arr){
            System.out.println(i);
        }

        System.out.println(Arrays.toString(arr));// Best way to print


        
    }
    
}
