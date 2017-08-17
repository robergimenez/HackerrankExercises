package Algorithms.Warmup.Implementation.LisaWoorkbook;

import java.util.Scanner;


public class Solution {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        int capitulos = sc.nextInt();
        int probMax = sc.nextInt();
        int[] problemas = new int[capitulos];
        int pagTotales=0;
        int pag=0;
        int respuesta=0;
        int probMin=1, probMx=0;
        for (int i=0; i< capitulos; i++){
            problemas[i]= sc.nextInt();
            while (problemas[i]>0){
                if (problemas[i]<probMax){
                    probMx+=problemas[i];
                }else {
                    probMx+=probMax;
                }
                pag++;
                if (pag>=probMin && pag<= probMx){
                    respuesta++;
                }
                problemas[i]-= probMax;
                probMin+=probMax;

            }
            probMin=1;
            probMx=0;
        }
        System.out.println(respuesta);
        sc.close();
    }
}
