package Algorithms.Warmup.Implementation.PickingNumbers;

/**
 * Created by rgimenez on 29/06/2017.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int media=0, x=0;
        for(int a_i=0; a_i < n; a_i++){
            x = in.nextInt();
            a[a_i] = x;
            media+=x;
        }
        media /=n;
        int cantidad=0;
        for(int a_i=0; a_i < n; a_i++){
            if (Math.abs(a[a_i]-media)<=1){
                cantidad++;
            }
        }
        System.out.println(cantidad);
    }
}
