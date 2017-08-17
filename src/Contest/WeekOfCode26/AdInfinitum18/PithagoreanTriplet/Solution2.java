package Contest.WeekOfCode26.AdInfinitum18.PithagoreanTriplet;

/**
 * Created by rgimenez on 15/06/2017.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution2 {

    static long[] pythagoreanTriple(int a){
        if (a % 2 == 1) {
            int k = a / 2;

            long n = k;
            long m = k + 1;

            long b = 2 * m * n;
            long c = m * m + n * n;

            return new long[] { a, b, c };
        } else {
            long n = 1;
            long m = a / 2;

            long b = m * m - n * n;
            long c = m * m + n * n;

            return new long[] { a, b, c };
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        long[] triple = pythagoreanTriple(a);
        for (int i = 0; i < triple.length; i++) {
            System.out.print(triple[i] + (i != triple.length - 1 ? " " : ""));
        }
        System.out.println("");


    }
}
