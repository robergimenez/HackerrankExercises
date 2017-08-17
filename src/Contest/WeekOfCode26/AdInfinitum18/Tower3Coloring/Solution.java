package Contest.WeekOfCode26.AdInfinitum18.Tower3Coloring;


/**
 * Created by rgimenez on 10/06/2017.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int towerColoring(int n){
        double mod = 1000000007;
        double resultado = Math.pow(Math.pow(3,3),n)%mod;
        return (int) resultado;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = towerColoring(n);
        System.out.println(result);
    }
}