package Algorithms.Warmup.Implementation.DivisibleNumPairs;

/**
 * Created by rgimenez on 25/06/2017.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int divisibleSumPairs(int n, int k, int[] ar) {
        // Complete this function
        int cantidad=0;
        for (int i=0; i<ar.length;i++){
            for(int j=i+1; j<ar.length; j++){
                int suma = ar[i]+ar[j];
                if ((ar[i]+ar[j])%k==0){
                    cantidad++;
                }
            }
        }
        return cantidad;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);
    }
}
