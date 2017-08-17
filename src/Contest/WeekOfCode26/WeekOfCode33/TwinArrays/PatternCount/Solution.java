package Contest.WeekOfCode26.WeekOfCode33.TwinArrays.PatternCount;

/**
 * Created by rgimenez on 15/06/2017.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int patternCount(String s){
        // Complete this function
        char[] c = s.toCharArray();
        int contarPatrones=0;
        boolean patron = false, patron2=false;
        for (int i=0; i<s.length();i++){
            if (c[i] == '1' && !patron2){
                patron=true;
                continue;
            }
            if (patron && c[i]=='0'){
                patron2= true;
                continue;
            }else if (patron2&& c[i]=='1'){
                contarPatrones++;
                //patron=false;
                patron2=false;
            }else {
                patron=false;
                patron2=false;
            }
        }
        return contarPatrones;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = patternCount(s);
            System.out.println(result);
        }
    }
}
