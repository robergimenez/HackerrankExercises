package Contest.WeekOfCode26.OpenBracketDelaware.HogwartsEmailAddress.SortedSubmatrix;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] a = new int[n][m];
        int submatrix=n*m;
        // Buscamos primero submatrices en horizontal
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < m; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
            if (a[a_i][m-1]>=a[a_i][m-2]){
                submatrix++;
            }
        }
        // Submatrices verticales
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < m-1; a_j++){
                if (a[a_i][a_j] <= a[a_i][a_j+1]){
                    submatrix++;
                }

            }
        }
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < m-1; a_j++){
                if (a[a_j][a_i] <= a[a_j+1][a_i]){
                    submatrix++;
                }

            }
        }
        //Busco filas completas
        boolean completo = true;
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = m-1; a_j >0; a_j--) {
                if (a[a_i][a_j - 1] > a[a_i][a_j]) {
                    completo = false;
                    a_j = 0;
                }
            }
            if (completo){
                submatrix++;
            }else {
                completo = true;
            }
        }
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = m-1; a_j >0; a_j--) {
                if (a[a_j-1][a_i] > a[a_j][a_i]){
                    completo=false;
                    a_j=0;
                }
            }
            if (completo){
                submatrix++;
            }else {
                completo = true;
            }
        }
        System.out.println(submatrix);
        in.close();
    }
}