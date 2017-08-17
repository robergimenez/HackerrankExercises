package Algorithms.Warmup.Implementation.LibraryFine;

import java.util.Scanner;

/**
 * Created by rgimenez on 10/07/2017.
 * fechas
 */
public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int dayR=sc.nextInt();
        int monthR = sc.nextInt();
        int yearR = sc.nextInt();
        int dayE = sc.nextInt();
        int monthE = sc.nextInt();
        int yearE= sc.nextInt();
        int tasa=0;
        if (yearE<yearR){
            tasa=10000;
        }else if (monthR>monthE && yearE==yearR){
            tasa=500*(monthR-monthE);
        }else if (dayR>dayE && monthE==monthR && yearE==yearR){
            tasa=15*(dayR-dayE);
        }else {
            tasa=0;
        }
        System.out.println(tasa);
    }
}
