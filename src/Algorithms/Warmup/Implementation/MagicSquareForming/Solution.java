package Algorithms.Warmup.Implementation.MagicSquareForming;

/**
 * Created by rgimenez on 28/06/2017.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                int[] matrix = new int[9];

                int[] sums = new int[8];
                for (int i = 0; i < 8; i++) {
                        sums[i] = 0;
                }

                int[][] finalPatterns = {{8, 1, 6, 3, 5, 7, 4, 9, 2},
                        {4, 3, 8, 9, 5, 1, 2, 7, 6},
                        {2, 9, 4, 7, 5, 3, 6, 1, 8},
                        {6, 7, 2, 1, 5, 9, 8, 3, 4},
                        {6, 1, 8, 7, 5, 3, 2, 9, 4},
                        {8, 3, 4, 1, 5, 9, 6, 7, 2},
                        {4, 9, 2, 3, 5, 7, 8, 1, 6},
                        {2, 7, 6, 9, 5, 1, 4, 3, 8}};

                for (int i = 0; i < 9; i++) {
                        matrix[i] = sc.nextInt();
                }

                for (int i = 0; i < 8; i++) {
                        for (int j = 0; j < 9; j++) {
                                if (finalPatterns[i][j] != matrix[j]) {
                                        sums[i] = sums[i] + Math.abs(matrix[j] - finalPatterns[i][j]);
                                }
                        }
                }

                int result = sums[0];

                for (int i = 1; i < 8; i++) {
                        if (sums[i] < result) {
                                result = sums[i];
                        }
                }

                System.out.println(result);
        }
}
