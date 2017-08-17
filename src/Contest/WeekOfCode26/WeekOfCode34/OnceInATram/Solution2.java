package Contest.WeekOfCode26.WeekOfCode34.OnceInATram;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/* Esta es la solucion optima
Trocear numeros por la mitad.
 */

public class Solution2 {

    static String onceInATram(int x) {
        for (int number = x + 1; ; ++number) {
            String numberString = String.valueOf(number);
            if (isLucky(numberString)) return numberString;
        }
    }

    static boolean isLucky(String number) {
        char[] digits = number.toCharArray();

        int leftSum = 0, rightSum = 0;
        for (int i = 0, j = digits.length - 1; i < j; ++i, --j) {
            leftSum += digits[i];
            rightSum += digits[j];
        }

        return leftSum == rightSum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        String result = onceInATram(x);
        System.out.println(result);
    }
}
