package Algorithms.Warmup.Implementation.DrawingBook;

/**
 * Created by rgimenez on 25/06/2017.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(float n, int p){
        // Complete this function
        if ((n-p)/2 < p/2){
            if (n%2==0){
                n++;
            }
            return (int)(n-p)/2;
        }else {
            return p/2;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}
