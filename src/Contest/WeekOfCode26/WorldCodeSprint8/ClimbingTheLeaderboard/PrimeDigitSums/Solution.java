package Contest.WeekOfCode26.WorldCodeSprint8.ClimbingTheLeaderboard.PrimeDigitSums;

/**
 * Created by rgimenez on 18/12/2016.
 * Prime numbers
 */
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        int n =0;
        double minN=0;
        double maxN =0;
        for(int a0 = 0; a0 < q; a0++) {
            n = in.nextInt();
            // your code goes here
            minN = Math.pow(10,n);
            maxN = Math.pow(10, n+1);
            for (double i = minN; i < maxN; i++){

            }
        }
    }
}
