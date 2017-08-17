package Contest.WeekOfCode26.WeekOfCode34.OnceInATram.MaximumGCDAndSum;

/**
 * Created by rgimenez on 18/07/2017.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int maximumGcdAndSum(int[] A, int[] B) {
        // Complete this function
        int gcdA = gcd(A);
        int gcdB = gcd(B);
        return gcdA+gcdB;

    }
    private static int gcd(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b; // % is remainder
            a = temp;
        }
        return a;
    }
    private static int gcd(int[] input) {
        int result = input[0];
        int mayor = result;
        for (int i = 0; i <input.length; i++) {
            result = gcd(result, input[i]);
            if(mayor<result){
                mayor=result;
            }
        }
        return mayor;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] A = new int[n];
        for(int A_i = 0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }
        int[] B = new int[n];
        for(int B_i = 0; B_i < n; B_i++){
            B[B_i] = in.nextInt();
        }
        int res = maximumGcdAndSum(A, B);
        System.out.println(res);
    }
}

