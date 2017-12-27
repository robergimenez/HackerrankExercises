package Algorithms.Warmup.Sorting.BigSorting.InsertionSort1;

import java.util.*;

public class Solution {

    public static void insertIntoSorted(int[] ar) {
        // Fill up this function
        int temp = 0;
        for (int i = ar.length - 1; i > 0; i--) {
            if (ar[i] < ar[i - 1]) {
                temp = ar[i];
                ar[i] = ar[i - 1];
                printArray(ar);
                ar[i - 1] = temp;
            }
        }
        printArray(ar);
        /*
        if (ar[0]==temp) {
            printArray(ar);
        }
        */
    }


    /* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        insertIntoSorted(ar);
    }


    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
 }
