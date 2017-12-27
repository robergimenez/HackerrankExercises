package Algorithms.Warmup.Sorting.BigSorting.InsertionSortAdvancedAnalysis;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int veces = sc.nextInt();
        for (int i=0; i<veces; i++){
            int cantidad = sc.nextInt();
            int[] array = new int[cantidad];
            for (int j=0; j<cantidad;j++){
                array[j]= sc.nextInt();
            }
            int swaps = 0;
            for (int j=1; j<cantidad;j++){
                int init=j-1;
                int temp;
                while (init>=0 && array[j]<array[init]){
                    temp   = array[init];
                    array[init] = array[j];
                    array[j]=temp;
                    init--;
                    swaps++;
                    j--;
                }
            }
            System.out.println(swaps);
        }
    }
}
