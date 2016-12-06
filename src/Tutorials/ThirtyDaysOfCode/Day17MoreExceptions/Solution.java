package Tutorials.ThirtyDaysOfCode.Day17MoreExceptions;

/**
 * Created by rgimenez on 04/12/2016.
 */
import java.util.Scanner;

class Calculator{
    int power(double i, double j) throws Exception{
        if (i<0 || j<0){
            throw new Exception("n and p should be non-negative");
        }else
            return (int)Math.pow(i, j);
    }
}
class Solution {

    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        while(T-->0)
        {
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try
            {
                int ans=myCalculator.power(n,p);
                System.out.println(ans);

            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }

    }
}