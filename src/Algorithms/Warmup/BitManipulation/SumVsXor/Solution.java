package Algorithms.Warmup.BitManipulation.SumVsXor;

/*
Manipulacion de bitset XOR
 */

import java.util.Scanner;

public class Solution {

    static long solve(long n) {
        // Complete this function
        int contar =0;
        while (n>0){
            if ((n&1)==0){
                contar++;
            }
            n >>=1;
        }
        return (long)Math.pow(2, contar);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long result = solve(n);
        System.out.println(result);
    }
}