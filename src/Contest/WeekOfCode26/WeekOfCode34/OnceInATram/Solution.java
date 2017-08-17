package Contest.WeekOfCode26.WeekOfCode34.OnceInATram;

/**
 * Created by rgimenez on 17/07/2017.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String onceInATram(int x) {
        // Complete this function
        String s = x+"";
        int cantidad = 0;
        int ticket=0;
        for (int i=0; i<3;i++){
            cantidad += Character.getNumericValue(s.charAt(i));
        }
        for (int i=0; i<3;i++){
            ticket += Character.getNumericValue(s.charAt(i+3));
        }
        if(cantidad==ticket){
            return (x+9)+"";
        }else if(cantidad<ticket){
            int n = Character.getNumericValue(s.charAt(3))+1;
            if (n>=10){
                cantidad++;
            }
                int n2 = n*100;
                int t = cantidad-n;
            return ((x/1000)+""+(n2+t))+"";
        }else {
            return (x+(cantidad-ticket))+"";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        String result = onceInATram(x);
        System.out.println(result);
    }
}
