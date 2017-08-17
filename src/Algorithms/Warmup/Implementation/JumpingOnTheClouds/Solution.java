package Algorithms.Warmup.Implementation.JumpingOnTheClouds;

/**
 * Created by rgimenez on 06/07/2017.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = new int[n];
        int energia =100;
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        for(int c_i=k; c_i < n; c_i=c_i + k){
            energia--;
            if(c[c_i]!=0){
                energia = energia-2;
            }
            if (c_i+k==n){
                energia--;
            }
        }
        energia--;
        System.out.println(energia);
    }
}
