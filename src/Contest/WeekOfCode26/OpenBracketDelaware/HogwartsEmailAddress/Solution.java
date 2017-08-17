package Contest.WeekOfCode26.OpenBracketDelaware.HogwartsEmailAddress;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/* Regex
La primera parte del mail, tiene que tener 5 letras,
la segunda parte tiene que acabar en @hogwarts.com
 */

public class Solution {

    static String isValid(String email) {
        // Complete this function
        //Encuentra cualesquiera 5 letras seguido de @hogwarts.com.
        // Importante, hay que poner en el patron, que el punto es ese caracter y no otro cualquiera.
        String regexString = "[a-z]{5}@hogwarts\\.com";
        Pattern p = Pattern.compile(regexString);
        Matcher m = p.matcher(email);
        if (m.matches()){
            return "Yes";
        }else {
            return "No";
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = isValid(s);
        System.out.println(result);
        in.close();
    }
}
