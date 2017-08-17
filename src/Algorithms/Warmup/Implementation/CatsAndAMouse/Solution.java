package Algorithms.Warmup.Implementation.CatsAndAMouse;

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
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            System.out.println(menor(x,y,z));
        }

    }
    static String menor(int x, int y, int z){
        if (Math.abs(x-z)< Math.abs(y-z)){
            return "Cat A";
        }else if (Math.abs(x-z)> Math.abs(y-z)){
            return "Cat B";
        }else {
            return "Mouse C";
        }
    }
}
