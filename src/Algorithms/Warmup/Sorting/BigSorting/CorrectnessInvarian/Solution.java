package Algorithms.Warmup.Sorting.BigSorting.CorrectnessInvarian;

import java.io.*;
import java.util.*;

public class Solution {

    public static int insertionSort(int[] A){
        int veces=0;
        for(int i = 1; i < A.length; i++){
            int value = A[i];
            int j = i - 1;
            while (j >=0 && A[j + 1] < A[j]) {
                int temp= A[j+1];
                A[j+1]=A[j];
                A[j]=temp;
                j--;
                veces++;
            }
        }

        return veces;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        System.out.println(insertionSort(ar));
    }
}
