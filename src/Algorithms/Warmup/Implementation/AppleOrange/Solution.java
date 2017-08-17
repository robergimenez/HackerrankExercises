package Algorithms.Warmup.Implementation.AppleOrange;

/**
 * Created by rgimenez on 06/02/2017.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int manzana=0, naranja=0;
        int manzanas=0, naranjas=0;
        for(int apple_i=0; apple_i < m; apple_i++){
            manzana = a+ in.nextInt();
            if (manzana>=s && manzana<=t){
                manzanas++;
            }
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            naranja = b+in.nextInt();
            if (naranja>=s && naranja<=t){
                naranjas++;
            }
        }
        System.out.println(manzanas);
        System.out.println(naranjas);
    }
}
