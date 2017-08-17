package Contest.WeekOfCode26.WeekOfCode33.TwinArrays;

/**
 * Created by rgimenez on 14/06/2017.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int twinArrays(int[] ar1, int[] ar2){
        // Complete this function
        int[] minimo1, minimo2;
        minimo1 = encontrarMinimo(ar1);
        minimo2 = encontrarMinimo(ar2);
        if (minimo1[1] == minimo2[1]) {
            int max = encontrarMaximo(ar1);
            int max2 = encontrarMaximo(ar2);
            for (int i=0; i<ar1.length; i++){
                if (ar1[i]==minimo1[0]){
                    ar1[i]=max;
                }
                if (ar2[i]==minimo2[0]){
                    ar2[i]=max2;
                }
            }
            int[] min1Temp =  encontrarMinimo(ar1);
            int[] min2Temp = encontrarMinimo(ar2);
            if (min1Temp[0]>min2Temp[0]){
                return minimo1[0] + min2Temp[0];
            }else{
                return minimo2[0] + min1Temp[0];
            }
        }else{
            return minimo1[0]+minimo2[0];
        }
    }

    static int encontrarMaximo(int[] array){
        int maximo=array[0];
        for (int i=1; i<array.length;i++){
            if (array[i]>maximo){
                maximo=array[i];
            }
        }
        return maximo;
    }
    static int[] encontrarMinimo(int[] array){
        int minimo=array[0], posicion=0;
        for (int i=1; i<array.length;i++){
            if (array[i]<minimo){
                minimo=array[i];
                posicion=i;
            }
        }
        int[] nuevo = new int[2];
        nuevo[0]= minimo;
        nuevo[1]= posicion;
        return nuevo;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar1 = new int[n];
        for(int ar1_i = 0; ar1_i < n; ar1_i++){
            ar1[ar1_i] = in.nextInt();
        }
        int[] ar2 = new int[n];
        for(int ar2_i = 0; ar2_i < n; ar2_i++){
            ar2[ar2_i] = in.nextInt();
        }
        int result = twinArrays(ar1, ar2);
        System.out.println(result);
    }
}
