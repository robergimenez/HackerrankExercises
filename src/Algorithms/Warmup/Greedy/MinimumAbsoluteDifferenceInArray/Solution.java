package Algorithms.Warmup.Greedy.MinimumAbsoluteDifferenceInArray;

import java.io.*;
import java.util.*;
public class Solution {

    static int minimumAbsoluteDifference(int n, int[] arr) {
        // Complete this function
        Arrays.sort(arr);
        int menor= Math.abs(arr[0]-arr[1]);
        for (int i=0;i<arr.length-1;i++){
            if (Math.abs(arr[i]-arr[i+1])<menor){
                menor=Math.abs(arr[i]-arr[i+1]);
            }
        }
        return menor;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = minimumAbsoluteDifference(n, arr);
        System.out.println(result);
        in.close();
    }
}
