package String_StrBuilders_Prm;

public class Str_Intro {
    public static void main(String[] args) {
        String name = "Kunal Kushwaha";
//        System.out.println(name);

        String a = "Kunal";
        System.out.println(a);
        a = "Kushwaha";
        System.out.println(a);


//comparision

        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char)('a' + 3));

        System.out.println("a" + 1);
        // this is same as after a few steps: "a" + "1"
        // integer will be converted to Integer that will call toString()

        System.out.println("Kunal" + new ArrayList<>());
        System.out.println("Kunal" + new Integer(56));
        String ans = new Integer(56) + "" + new ArrayList<>();
        System.out.println(ans);

        System.out.println("a" + 'b');

// methods
        String name = "Kunal Kushwaha Hello World";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('a'));
        System.out.println("     Kunal   ".strip());
        System.out.println(Arrays.toString(name.split(" ")));


// Pritty Printing 
        float a = 453.1274f;
        //        System.out.printf("Formatted number is %.2f", a);

        //        System.out.printf("Pie: %.3f", Math.PI);

                System.out.printf("Hello my name is %s and I am %s", "Kunal", "Cool");
                



    }
}
