package Contest.WeekOfCode26.BestDivisor;

/**
 * Created by rgimenez on 07/12/2016.
 */
import java.util.*;
public class Solution2 {

        public static int getDigitSum(int k) {
            int sum = 0;

            while (k > 0) {
                sum += k % 10;
                k /= 10;
            }

            return sum;
        }

        public static int getBestDivisor(int n) {
            int maxSum = 1;
            int bestNumber = 1;

            // Check all possible factors of n
            for(int i = 2; i <= n; i++) {
                // If a number is evenly divisible, it's a factor of n
                if ((n % i) == 0) {
                    int digitSum = getDigitSum(i);

                    // Only need to track one number because if two numbers have same digitSum,
                    // smaller (previously stored value) is better.
                    if (digitSum > maxSum) {
                        maxSum = digitSum;
                        bestNumber = i;
                    }
                }
            }

            return bestNumber;
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            in.close();
            System.out.println(getBestDivisor(n));
        }
    }