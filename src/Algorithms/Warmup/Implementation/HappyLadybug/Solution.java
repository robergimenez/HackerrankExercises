package Algorithms.Warmup.Implementation.HappyLadybug;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Q = in.nextInt();
        for(int a0 = 0; a0 < Q; a0++){
            int n = in.nextInt();
            String b = in.next();
            ArrayList<Character> array = new ArrayList<>();
            String respuesta = "YES";
            for (int i=0;i<n;i++) {
                array.add((b.charAt(i)));
            }
            char c=' ';
            int contar=0;
            for (int i=0;i<n;i++) {
                if (!array.contains('_')) {
                    if (i == 0) {
                        c = array.get(i);
                    } else if (array.get(i).equals(c)) {
                        contar++;
                    } else if (contar != 0) {
                        c = array.get(i);
                    } else {
                        respuesta = "NO";
                        break;
                    }
                }
                if (Collections.frequency(array, array.get(i))<=1 && array.get(i)!= '_'){
                    respuesta="NO";
                    break;
                }
            }
            System.out.println(respuesta);
        }
        in.close();
    }
}
