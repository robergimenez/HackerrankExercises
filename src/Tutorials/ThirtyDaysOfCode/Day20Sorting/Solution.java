package Tutorials.ThirtyDaysOfCode.Day20Sorting;

import java.util.Scanner;

/**
 * Created by rgimenez on 07/12/2016.
 */
public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int cantidad = in.nextInt();
        int[] array = new int[cantidad];
        for (int i=0; i<cantidad; i++){
            array[i]= in.nextInt();
        }
        int numeroCambios=0, posicionFinal=cantidad-1;
        int posicionCambio;
        while(posicionFinal>0){
            posicionCambio=0;
            for (int i =0; i<posicionFinal;i++){
                if (array[i] > array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1]= temp   ;
                    posicionCambio=i;
                    numeroCambios++;
                }
            }
            posicionFinal=posicionCambio;
        }
        System.out.println("Array is sorted in " +numeroCambios + " swaps.\n" +
                "First Element: " + array[0] +"\n" +
                "Last Element: " + array[array.length-1]);
    }
}
