package Algorithms.Warmup.Implementation.OrganizingContainersOfBalls;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int[][] M = new int[n][n];
            int [] sumaFilas = new int[n];
            int [] sumaColumnas = new int[n];
            for(int M_i=0; M_i < n; M_i++){
                for(int M_j=0; M_j < n; M_j++){
                    M[M_i][M_j] = in.nextInt();
                    sumaFilas[M_j] += M[M_i][M_j];
                    sumaColumnas[M_i] += M[M_i][M_j];
                }
            }
            // your code goes here
            Arrays.sort(sumaFilas);
            Arrays.sort(sumaColumnas);
            if (sumaColumnas[0]==sumaFilas[0]){
                    System.out.println("Possible");
            }else {
                System.out.println("Impossible");
            }
        }
    }
}
