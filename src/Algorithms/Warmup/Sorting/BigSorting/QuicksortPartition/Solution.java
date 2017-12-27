package Algorithms.Warmup.Sorting.BigSorting.QuicksortPartition;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>mayor = new ArrayList<>();
        ArrayList<Integer>menor = new ArrayList<>();
        ArrayList<Integer>igual = new ArrayList<>();
        int n = sc.nextInt();
        int pivot = sc.nextInt();
        igual.add(pivot);
        for (int i=0; i< n-1;i++){
            int temp = sc.nextInt();
            if (temp==pivot){
                igual.add(temp);
            }else if(temp>pivot){
                mayor.add(temp);
            }else {
                menor.add(temp);
            }
        }
        for(int i:menor){
            System.out.print(i + " ");
        }
        for(int i:igual){
            System.out.print(i + " ");
        }
        for(int i:mayor){
            System.out.print(i + " ");
        }

    }
}
