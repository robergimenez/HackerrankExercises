package Algorithms.Warmup.Implementation.GradingStudents;

/**
 * Created by rgimenez on 16/06/2017.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int[] grades){
        // Complete this function
        int multiplo=0, contador;
        for (int i=0; i<grades.length;i++){
            if (grades[i]>=38){
                contador=0;
                multiplo=grades[i];
                while(multiplo%5!=0){
                    multiplo++;
                    contador++;
                }
                if (contador<3){
                    grades[i]=multiplo;
                }
            }
        }
        return grades;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


    }
}
