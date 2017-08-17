package Contest.WeekOfCode26.AdInfinitum18.PithagoreanTriplet;

/**
 * Created by rgimenez on 15/06/2017.
 */
import java.io.*;
import java.util.*;
import java.math.BigInteger;


public class Solution {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        BigInteger b=sc.nextBigInteger();

        if(!b.mod(new BigInteger("2")).equals(BigInteger.ZERO))
        {
            //if odd
            BigInteger c=b.pow(2);
            c=c.subtract(new BigInteger("1"));
            c=c.divide(new BigInteger("2"));
            BigInteger a=c.add(new BigInteger("1"));
            System.out.println( b +" "+a +" "+c);
        }
        else
        {
            ///if even
            BigInteger c=b.divide(new BigInteger("2"));
            c=c.pow(2);
            c=c.subtract(new BigInteger("1"));

            BigInteger a=c.add(new BigInteger("2"));
            System.out.println( b +" "+a +" "+c);
        }
    }
}
