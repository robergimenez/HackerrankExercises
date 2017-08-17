package Contest.WeekOfCode26.AdInfinitum18.ParityParty;

/**
 * Created by rgimenez on 15/06/2017.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution
{

    public static final long REM=7340033;
    public static long[] invarray = new long[50001];

    public static long msqr(long a)
    {
        return((a*a)%REM);
    }

    public static long powit(long a, long n)
    {
        if (n == 0) return(1);
        if (n%2 == 0) return(msqr(powit(a,n/2))%REM);
        return((a*msqr(powit(a,n/2))%REM));
    }

    public static long inv(long a, long n)
    {
        long q,res,temp,curr,prev,num,den;
        res=a % n;
        if (res == 0) return(0);
        if (res == 1) return(1);
        if (res < 0) res+=n;
        curr=1;
        prev=0;
        num=n;
        den=res;
        do
        {
            q=num/den;
            temp=curr;
            curr=((q*curr+prev) % n);
            prev=temp;
            temp=den;
            den=num % den;
            num=temp;
        }
        while (den != 1);
        if (((res*curr) % n) == 1) return(curr);
        else return(n-curr);
    }

    public static long binom(long n, long k)
    {
        long mult;
        int index;
        if (k == 0) return(1);
        if (k < 0) return(0);
        if (k > n) return(0);
        if (k == 1) return(n);
        if (k == n) return(1);
        if (2*k > n) return(binom(n,n-k));
        index=(int)(k);
        mult=(n*invarray[index])%REM;
        return((mult*binom(n-1,k-1))%REM);
    }

    public static long f(long b, long a, long r)
    {
        long term,prod,mult,temp1,temp2;
        int s,low,high,index;
        term=0;
        low=0;
        if (r > b) low=(int)(r-b);
        high=(int)(r);
        if (a < r) high=(int)(a);
        temp1=binom(b,r-low);
        temp2=binom(a,low);
        if (low %2 == 1) temp2=-temp2;
        for (s=low;s<=high;++s)
        {
            mult=(temp1*temp2)%REM;
            term=(term+mult)%REM;
            temp2=(temp2*(s-a))%REM;
            temp2=(temp2*invarray[s+1])%REM;
            temp1=(temp1*(r-s))%REM;
            index=(int)(b-r+s+1);
            temp1=(temp1*invarray[index])%REM;
        }
        return(term);
    }

    public static long parityParty(long n, long a, long b, long c)
    {
        long temp1,temp2,term,denom,sign,mult,prod,sum;
        int r,s;
        if (n < a) return(0);
        denom=powit(2,a+b);
        denom=inv(denom,REM);
        sum=0;
        for (r=0;r<=a+b+c;++r)
        {
            temp1=(f(b,a,r)*powit(a+b+c-2*r,n))%REM;
            temp2=(temp1*denom)%REM;
            sum=(sum+temp2)%REM;
        }
        if (sum < 0) sum+=REM;
        return(sum);
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int i;
        long n = in.nextLong();
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        for (i=1;i<50001;++i) invarray[i]=inv(i,REM);
        long result = parityParty(n, a, b, c);
        System.out.println(result);
    }
}
