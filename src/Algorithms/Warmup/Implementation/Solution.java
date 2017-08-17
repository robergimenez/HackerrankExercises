package Algorithms.Warmup.Implementation;

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
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        ArrayList<Long> array = new ArrayList<>();
        array.add(a);
        array.add(b);
        array.add(c);
        array.add(d);
        array.add(e);
        Collections.sort(array);
        long mayor =0, menor=0;
        for (int i=0; i<4; i++){
            menor += array.get(i);
            mayor += array.get(array.size()-i-1);
        }
        System.out.println(menor +" " + mayor);
    }
}
