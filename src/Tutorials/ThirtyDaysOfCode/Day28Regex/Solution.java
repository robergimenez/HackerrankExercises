package Tutorials.ThirtyDaysOfCode.Day28Regex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.*;

/**
 * Created by rgimenez on 11/12/2016.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        sc.nextLine();
        String[] array = new String[i];
        for (int k = 0; k < i; k++) {
            array[k] = sc.nextLine();
        }

        String myRegExString = "@gmail.com";

// Create a Pattern object (compiled RegEx) and save it as 'p'
        Pattern p = Pattern.compile(myRegExString);

// We need a Matcher to match our compiled RegEx to a String
        Matcher m;

// if our Matcher finds a match
        ArrayList<String> resultado = new ArrayList<String>();
        String[] primeraPalabra;
        for (int j = 0; j < array.length; j++) {
            m = p.matcher(array[j]);
            if (m.find()) {
                // Print the match
                primeraPalabra = (array[j].split(" "));
                resultado.add(primeraPalabra[0]);
            }
        }
        Collections.sort(resultado);
        for (int j = 0; j < resultado.size(); j++)
            System.out.println(resultado.get(j));
    }
}
