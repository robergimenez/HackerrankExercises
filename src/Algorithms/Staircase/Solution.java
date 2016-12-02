package Algorithms.Staircase;

import java.util.Scanner;

/**
 * Created by rgimenez on 28/11/2016.
 */
public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cantidad = sc.nextInt();
        sc.close();
        String resultado="";
        int j=0;
        for (int i=0; i<cantidad; i++){
            for(j=0; j<cantidad-i-1; j++){
                resultado +=" ";
            }
            for(j=cantidad-i-1; j<cantidad; j++){
                resultado += "#";
            }
            System.out.println(resultado);
            resultado = "";
        }
    }
}
