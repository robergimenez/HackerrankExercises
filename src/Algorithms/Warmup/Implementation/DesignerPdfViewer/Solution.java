package Algorithms.Warmup.Implementation.DesignerPdfViewer;

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
        int[] h = new int[26];
        for(int h_i=0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        char[] caracteres = new char[word.length()];
        word.getChars(0,word.length(),caracteres, 0);
        int mayor =0;
        for (char c: caracteres) {
            //A corresponde el valor 10. Resto para obtener el 0.
            if (h[Character.getNumericValue(c)-10] > mayor) {
                mayor = h[Character.getNumericValue(c)-10];
            }
        }
            System.out.println(mayor*1*word.length());
        }
    }