package Algorithms.Warmup.Strings.SuperReducedString.StringConstruction;

/* Spent a lot of time trying to substring from the string. See solution2.java.
This new reformulation, only counts the different chars in the string.
 */

import java.util.*;

public class Solution {

    static int stringConstruction(String s) {
        // Complete this function
        return (int)s.chars().distinct().count();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = stringConstruction(s);
            System.out.println(result);
        }
        in.close();
    }
}
