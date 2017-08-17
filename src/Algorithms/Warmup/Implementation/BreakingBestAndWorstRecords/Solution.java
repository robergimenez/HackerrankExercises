package Algorithms.Warmup.Implementation.BreakingBestAndWorstRecords;

/**
 * Created by rgimenez on 16/06/2017.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] getRecord(int[] s){
        // Complete this function
        int mayor=s[0], menor=s[0];
        int contMayor=0, contMenor=0;
        int[] resultado = new int[2];
        for(int i=1; i<s.length;i++){
            if (s[i]>mayor){
                contMayor++;
                mayor=s[i];
            }
            if (s[i]<menor){
                contMenor++;
                menor=s[i];
            }
        }
        resultado[0]=contMayor;
        resultado[1]=contMenor;
        return resultado;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}
