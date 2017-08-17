package Contest.WeekOfCode26.WeekOfCode34.OnceInATram.MaximumGCDAndSum;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution2 {

    static int maximumGcdAndSum(int[] A, int[] B) {
        // Complete this function
        Arrays.sort(A);
        Arrays.sort(B);
        int gcdA=0, gcdB=0;
        for (int i=A.length-1;i>=0;i--){
            for (int j=B.length-1; j>0; j--){
                if (A[i]%B[j]==0){
                    gcdA=A[i];
                    i=-1;j=-1;
                }
            }
        }
        for (int i=A.length-1;i>=0;i--){
            for (int j=B.length-1; j>0; j--){
                if (B[j]%A[i]==0){
                    gcdB=B[j];
                    i=-1;j=-1;
                }
            }
        }
        return gcdA+gcdB;
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
