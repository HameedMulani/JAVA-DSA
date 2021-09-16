package String_StrBuilders_Prm;
/**
 * 
 * String Concatination time coplexcity : O(n^2)
 * 1 + 2+ 3+ 4+ 5+ ......n 
 * sum of n Numbers  = n(n+1)/2
 *                   = (n^2 + n)/2  
 *                   ignore less dominating terms and constants 
 *                   = O(n^2)  (very bad) solution StringBuider 
 */
public class PerformanceOfStr {
    public static void main(String[] args) {
        String alfa = "";
        for (int i = 0; i <26; i++) {
            char ch = (char)('a' + i);
            alfa += ch;  // every Iteration i is creating New String Object of string and 1) copy then 2) append 
        }

        System.out.println(alfa);
        // working of String 
        System.out.println("ab" + 'c');
        System.out.println("abc" + 'd');
        System.out.print("abcd" + 'e');

    }
}
