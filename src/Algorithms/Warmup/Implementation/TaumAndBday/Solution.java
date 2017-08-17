package Algorithms.Warmup.Implementation.TaumAndBday;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        long total=0;
        for(int a0 = 0; a0 < t; a0++){
            long b = in.nextLong();
            long w = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();
            long z = in.nextLong();
            if (x>y && (z+y)<x){
                total=(b*y)+ (b*z) + (w*y);
            }else
            if(y>x && y>(z+x)){
                total= (b*x)+(w*x)+(w*z);
            }else {
                total = (b*x)+(w*y);
            }
            System.out.println(total);
        }
    }
}

