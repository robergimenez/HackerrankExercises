package Algorithms.Warmup.Strings.SuperReducedString.MarsExploration;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int contador =0;
        for (int i =0; i<=S.length()-3;i+=3){
            String temp = S.substring(i, i+3);
            if(!S.substring(i, i+3).matches("SOS")){
                if (S.substring(i, i+3).charAt(0)!='S')contador++;
                if (S.substring(i, i+3).charAt(1)!='O')contador++;
                if (S.substring(i, i+3).charAt(2)!='S')contador++;
            }
        }
        System.out.println(contador);
    }
}
