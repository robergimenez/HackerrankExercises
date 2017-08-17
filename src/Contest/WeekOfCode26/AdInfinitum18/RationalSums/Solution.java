package Contest.WeekOfCode26.AdInfinitum18.RationalSums;

/**
 * Created by rgimenez on 15/06/2017.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int M = 1000000007;

    static int rationalSums(int n, int[] a, int[] b) {
        // Complete this function
        boolean[] hasLFactor = new boolean[5001];
        for(int i=0; i<a.length; ++i)
            hasLFactor[a[i]]=true;
        long[] lFactorCofs = new long[5001];
        for(int i=0; i<=5000; ++i) {
            if(!hasLFactor[i]) continue;

            long Q_x=0, exp=1;
            for(int j=0; j<b.length; ++j, exp=(-exp*i)%M+M)
                Q_x=(Q_x+b[j]*exp)%M;

            long P_x=1;
            for(int j=0; j<=5000; ++j)
                if(j!=i&&hasLFactor[j])
                    P_x=P_x*(j-i)%M;
            if(P_x<0)
                P_x+=M;
            P_x=modI(P_x, M);
            lFactorCofs[i]=Q_x*P_x%M;
        }
        //System.out.println(Arrays.toString(lFactorCofs));
        long sum=0;
        for(int i=0; i<5000; ++i) {
            long Cof=lFactorCofs[i];
            //System.out.println("cof: "+Cof);
            sum=(sum+Cof*modI(i+1, M))%M;
            lFactorCofs[i+1]=(Cof+lFactorCofs[i+1])%M;
            //System.out.println("sum: "+sum);
        }
        return (int)sum;
    }

    static long modI(long a, long m)
    {
        long m0 = m, t, q;
        long x0 = 0, x1 = 1;
        while(a>1)
        {
            q = a / m;
            t = m;
            m = a % m;
            a = t;
            t = x0;
            x0 = x1 - q * x0;
            x1 = t;
        }
        if(x1<0)
            x1 += m0;
        return x1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[n-1];
        for(int b_i = 0; b_i < n-1; b_i++){
            b[b_i] = in.nextInt();
        }
        int result = rationalSums(n, a, b);
        System.out.println(result);
    }
}
