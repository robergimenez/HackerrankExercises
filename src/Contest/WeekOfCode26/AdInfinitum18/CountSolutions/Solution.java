package Contest.WeekOfCode26.AdInfinitum18.CountSolutions;

/**
 * Created by rgimenez on 15/06/2017.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int countSolutions(long a, long b, long c, long d){
        /*long a2pb2 = a*a+b*b;
        long c2 = c*2L+1L;

        for( long xx = 0; xx < c; xx++ ){

        }*/

        c++;
        d++;
        long xx;
        int count = 0;
        for( long x = 1; x < c; x++ ){
            xx = a*x*4L + b*b - x*x*4L;
            long sq = (int)Math.sqrt(xx);
            if( sq*sq != xx ){
                sq++;
                if( sq*sq != xx ){
                    continue;
                }
            }

            if( ((b-sq)&1) == 0 ){
                if( (b-sq)/2L > 0 && (b-sq)/2L < d ) count++;
            }
            if( sq != 0 && ((b+sq)&1) == 0 ){
                if( (b+sq)/2L > 0 && (b+sq)/2L < d ) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();
            int result = countSolutions(a, b, c, d);
            System.out.println(result);
        }
    }
}
