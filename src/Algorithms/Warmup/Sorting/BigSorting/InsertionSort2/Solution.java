package Algorithms.Warmup.Sorting.BigSorting.InsertionSort2;

import java.io.*;
import java.util.*;

public class Solution {

    public static void insertionSortPart2(int[] ar)
    {
        // Fill up the code for the required logic here
        // Manipulate the array as required
        // The code for Input/Output is already provided
        for (int i=0; i<ar.length-1;i++){
            if (ar[i]>ar[i+1]){
                int j=i;
                while (j >=0 && ar[j + 1] < ar[j]) {
                    int temp= ar[j+1];
                    ar[j+1]=ar[j];
                    ar[j]=temp;
                    j--;
                }
            }
            printArray(ar);
        }
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        insertionSortPart2(ar);

    }
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
