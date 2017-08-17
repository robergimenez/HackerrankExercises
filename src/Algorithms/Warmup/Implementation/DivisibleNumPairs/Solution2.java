package Algorithms.Warmup.Implementation.DivisibleNumPairs;

import java.util.Scanner;

/**
 * Created by rgimenez on 25/06/2017.
 */
public class Solution2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        int count = 0;
        for(int a_i=0; a_i < n; a_i++){
            int num = in.nextInt();
            int remainder = num % k;
            int complement = (remainder==0)?k:remainder;
            count += a[k - complement];
            a[remainder]++;
        }
        System.out.println(count);
    }
}
