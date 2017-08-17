package Algorithms.Warmup.Implementation.AbsolutePermutation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
1.k == 0: print all the numbers from 1 to N

2.if (n / k) % 2 is not ZERO and n%k is not ZERO, print -1 (as this must be zero to be abolute permutation)

Otherwise, follow the pattern below:

if we go from 1 to N (i),

Permutation is either i+k or i-k. It always starts with i+k.

1.Put i+k to permutaion for k times

2.Switch to i-k for k times

    repeat 1 & 2 until the end.

 */

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            int k = in.nextInt();
            if (k == 0) {
                for (int i=1; i<=n;i++){
                    System.out.print(i + " ");
                }
                System.out.print("\n");
            }else if (n%k == 0 && (n/k)%2 == 0) {
                boolean sumar = true;
                for (int i = 1; i<=n; i++) {
                    if (sumar) {
                        System.out.print(i + k + " ");
                    } else {
                        System.out.print(i - k + " ");
                    }
                    if (i % k == 0) {
                        if (sumar == true) {
                            sumar = false;
                        } else {
                            sumar = true;
                        }
                    }
                }
                System.out.print("\n");
            }else {
                System.out.println("-1");
            }

        }
    }
}
