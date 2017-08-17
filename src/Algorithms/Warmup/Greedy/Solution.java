package Algorithms.Warmup.Greedy;

import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] calories = new int[n];
        for(int calories_i=0; calories_i < n; calories_i++){
            calories[calories_i] = in.nextInt();

        }
        // your code goes here
        Arrays.sort(calories);
        double calorias =0;
        for (int i=calories.length-1; i>=0;i--){
            int test = Math.abs(i+1-calories.length);
            double test2 = Math.pow(2, test);
            calorias+=(calories[i]*Math.pow(2,Math.abs(i+1-calories.length)));
        }
        DecimalFormat df = new DecimalFormat("#");
        System.out.println(df.format(calorias));
    }
}