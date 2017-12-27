package Algorithms.Warmup.Sorting.BigSorting.CountingSort2;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[100];
        for (int i=0; i<100;i++){
            array[i]=0;
        }
        for (int i=0; i<n;i++){
            int temp=sc.nextInt();
            array[temp] = array[temp]+1;
        }
        for (int i=0; i<100;i++){
            int j=array[i];
            while(j>0) {
                System.out.print(i + " ");
                j--;
            }
        }
    }
}
