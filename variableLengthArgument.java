package code;

import java.lang.String;
import java.util.Arrays;

public class variableLengthArgument {
    public static void main(String[] args) {
        fun();
        multiple(94, 97, "Hameed", "Mulani");
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v){    
        System.out.println(a + " " + b + " "+ Arrays.toString(v));
        // System.out.println(Arrays.toString(v));

    }

}
