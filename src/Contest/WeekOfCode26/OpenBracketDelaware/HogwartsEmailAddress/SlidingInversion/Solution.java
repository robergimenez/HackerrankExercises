package Contest.WeekOfCode26.OpenBracketDelaware.HogwartsEmailAddress.SlidingInversion;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int inversionCount(int n, int m, int[] a) {
        // Complete this function
        int[] temp = new int[m];
        int distancia=0;
        for (int i=0; i<n-m+1;i++){
            for (int j=0; j<m;j++){
                temp[j]=a[i+j];
            }
            Arrays.sort(temp);
            for (int j=0;j<m;j++){
                for (int k=j; k<m;k++){
                    if (a[i+j]==temp[k]){
                        if ((k-j)>1){
                            distancia+=1;
                        }
                        distancia+=k-j;
                        break;
                    }
                }
            }
            temp = new int[m];
        }
        return distancia;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int result = inversionCount(n, m, a);
        System.out.println(result);
        in.close();
    }
}
