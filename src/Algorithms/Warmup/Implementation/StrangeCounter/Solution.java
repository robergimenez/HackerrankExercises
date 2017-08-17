package Algorithms.Warmup.Implementation.StrangeCounter;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double t = in.nextDouble();
        double x = Math.pow(2,Math.floor(Math.log10((t+2)/3)/Math.log10(2.)))*3;
        long respuesta = (long)(2*x-2-t);
        System.out.println(respuesta);
    }
}

