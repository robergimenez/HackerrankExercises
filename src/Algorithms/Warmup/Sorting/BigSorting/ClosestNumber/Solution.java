package Algorithms.Warmup.Sorting.BigSorting.ClosestNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/* Encontrar diferencia absoluta minima

 */
public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i=0; i<n;i++){
            array[i]=sc.nextInt();
        }
        Arrays.sort(array);
        ArrayList<Integer>solucion = new ArrayList<>();
        int minimo = Math.abs(array[0]-array[1]);
        solucion.add(array[0]);
        solucion.add(array[1]);
        for (int i=2;i<n-1;i++){
            if (Math.abs(array[i]-array[i+1])<minimo){
                minimo=Math.abs(array[i]-array[i+1]);
                solucion.clear();
                solucion.add(array[i]);
                solucion.add(array[i+1]);
            }else if (Math.abs(array[i]-array[i+1])==minimo){
                solucion.add(array[i]);
                solucion.add(array[i+1]);
            }
        }
        for (int i:solucion){
            System.out.print(i +" ");
        }
    }
}
