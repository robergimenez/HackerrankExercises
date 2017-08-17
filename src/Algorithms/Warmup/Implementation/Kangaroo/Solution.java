package Algorithms.Warmup.Implementation.Kangaroo;

/**
 * Created by rgimenez on 06/02/2017.
 * Calcular distancias
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        boolean alcanzar = true;
        if ((x1>x2 && v1>v2) || (x2>x1 && v2>v1)) {
            alcanzar = false;
        }else {
            if ((v1-v2)==0 || !((x1 - x2) % (v1 - v2) == 0)) {
                alcanzar = false;
            }
        }
        if (alcanzar) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}