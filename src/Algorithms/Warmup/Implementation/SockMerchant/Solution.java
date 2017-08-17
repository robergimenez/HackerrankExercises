package Algorithms.Warmup.Implementation.SockMerchant;

/**
 * Created by rgimenez on 25/06/2017.
 * Counting Frequency
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int sockMerchant(int n, int[] ar) {
        // Complete this function
        TreeMap<Integer,Integer> mapa = new TreeMap<>();
        for (int i=0; i<n; i++){
            if (mapa.containsKey(ar[i])){
                mapa.put(ar[i], mapa.get(ar[i]).intValue()+1);
            }else{
                mapa.put(ar[i], 1);
            }
        }
        int cantidad=0;
        for (Map.Entry<Integer, Integer> entrada: mapa.entrySet()){
            if (entrada.getValue()%2 ==0) {
                cantidad += entrada.getValue()/2;
            }else if(entrada.getValue()>2){
                cantidad += (entrada.getValue()-1)/2;
            }
        }
        return cantidad;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int cantidad = sockMerchant(n, ar);
        System.out.println(cantidad);
    }
}
