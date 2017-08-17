package Contest.WeekOfCode26.AdInfinitum18.Tower3Coloring;

/**
 * Created by rgimenez on 15/06/2017.
 */
import java.math.BigInteger;
import java.util.Scanner;

public class Solution3 {
    private static BigInteger towerColoring(int n) {
        final BigInteger p = BigInteger.valueOf(1000000007);
        final BigInteger a = BigInteger.valueOf(3);
        final BigInteger d = a.modPow(BigInteger.valueOf(n), p.subtract(BigInteger.ONE));
        final BigInteger result = a.modPow(d, p);

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger result = towerColoring(n);
        System.out.println(result);
    }
}
