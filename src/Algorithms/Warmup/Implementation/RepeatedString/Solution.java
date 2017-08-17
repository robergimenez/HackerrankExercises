package Algorithms.Warmup.Implementation.RepeatedString;

/**
 * Created by rgimenez on 16/07/2017.
 * Contar caracteres dentro de una cadena
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
        long n = in.nextLong();
        int longitud = s.length();
        int cantidad=0;
        long resto = n%longitud;
        int veces=0;
        for (int i=0; i<s.length(); i++){
            if(s.charAt(i)=='a'){
                veces++;
            }
        }
        for (int i=0; i<resto; i++){
            if(s.charAt(i)=='a'){
                cantidad++;
            }
        }
        long total = (((n-resto)/longitud)*veces)+cantidad;
        System.out.println(total);
    }
}
