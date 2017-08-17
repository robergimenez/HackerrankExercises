package Algorithms.Warmup.Implementation.CountingValley;

import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by rgimenez on 26/06/2017.
 */
public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cantidad = sc.nextInt();
        sc.nextLine();
        String cadena = sc.nextLine();
        String[] caracteres = cadena.split("");
        int valles=0, total=0, previo=0;
        for (int i=0; i<cantidad; i++){
            if (caracteres[i].equals("U")){
                valles+=1;
            }else{
                valles-=1;
            }
            if (previo==0 && valles<0){
                total++;
                previo=valles;
            }else {
                previo=valles;
            }
        }
        System.out.println(total);
    }
}
