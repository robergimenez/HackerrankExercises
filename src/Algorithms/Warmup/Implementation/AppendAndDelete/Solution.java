package Algorithms.Warmup.Implementation.AppendAndDelete;

/**
 * Created by rgimenez on 07/07/2017.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();
        if (s.length()<t.length()){
            String temp = s;
            s=temp;
            t=s;
        }
        String respuesta = "Yes";
        for (int i=0; i<s.length(); i++){
           if (s.charAt(i)!=t.charAt(i)){
               if (i>=k){
                   respuesta = "No";
                   i=s.length();
               }else{
                   i=s.length();
               }
           }
        }
        System.out.println("Yes");


    }
}

