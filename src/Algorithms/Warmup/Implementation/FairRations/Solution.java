package Algorithms.Warmup.Implementation.FairRations;

import java.util.Scanner;

public class Solution {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int cantidad = sc.nextInt();
        int[] pan = new int[cantidad];
        int total=0;
        String respuesta="";
        int suma =0;
        for (int i=0; i<cantidad;i++){
            pan[i]=sc.nextInt();
            total+= pan[i];
        }
        if (total%2!=0){
            respuesta="NO";
        }else {
            for (int i=cantidad-1; i>=0;i--){
                if (pan[i]%2!=0){
                    pan[i]+=1;
                    pan[i-1]+=1;
                    suma= suma+2;
                }
            }
            respuesta = Integer.toString(suma);
        }
        System.out.println(respuesta);
        sc.close();

    }
}
