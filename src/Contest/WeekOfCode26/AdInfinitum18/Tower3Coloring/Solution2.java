package Contest.WeekOfCode26.AdInfinitum18.Tower3Coloring;

/**
 * Created by rgimenez on 15/06/2017.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution2 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        long mod = (long) (1e9 + 7);
        long c = power(3l, n, mod - 1);
        long d = power(3l, c, mod);
        System.out.println(d);


    }

    static long power(long x, long y, long p) {

        if (y == 0) return 1 % p;
        if (y == 1) return x % p;
        long res = 1;
        x = x % p;
        while (y > 0) {
            if ((y & 1) > 0)
                res = (res * x) % p;

            y = y >> 1; // y = y/2
            x = (x * x) % p;
        }
        return res;
    }
}