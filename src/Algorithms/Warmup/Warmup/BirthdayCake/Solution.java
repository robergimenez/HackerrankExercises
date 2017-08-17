package Algorithms.Warmup.Warmup.BirthdayCake;

/**
 * Created by rgimenez on 16/06/2017.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function
        int mayor=0, veces=0;
        for (int i=0; i< ar.length;i++){
            if (ar[i]>mayor){
                mayor=ar[i];
                veces=1;
            }else if(ar[i]==mayor){
                veces++;
            }
        }
        return veces;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
