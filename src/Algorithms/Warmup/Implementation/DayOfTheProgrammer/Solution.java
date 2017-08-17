package Algorithms.Warmup.Implementation.DayOfTheProgrammer;

/**
 * Created by rgimenez on 25/06/2017.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String solve(int year){
        // Complete this
        String fecha="";
        if (year <= 1917 || year > 1918){
            if (calcularBisiesto(year)){
                fecha = "12.09."+year;
            }else {
                fecha = "13.09."+year;
            }
        }else if (year==1918){
                fecha = "26.09."+year;
        }
        return fecha;
    }

    static boolean calcularBisiesto(int year){
        if (year<=1917 && year%4==0){
            return true;
        }else if(year >= 1918 && (year%4==0 && year%100!=0) || year%400==0){
            return true;
        }else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}