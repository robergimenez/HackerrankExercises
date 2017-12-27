package Algorithms.Warmup.Sorting.BigSorting.FullCountingSort;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder[] palabras = new StringBuilder[100];
        sc.nextLine();
        for (int i=0; i<100;i++){
            palabras[i]= new StringBuilder();
        }
        for (int i=0; i<n;i++){
            String palabra = sc.nextLine();
            String[] temp = palabra.split(" ");
            if (i<n/2){
                palabras[Integer.parseInt(temp[0])].append("- ");
            }else {
                palabras[Integer.parseInt(temp[0])].append(temp[1] +" ");
            }
        }
        for (int i=0; i<n;i++){
            System.out.print(palabras[i]);
        }
    }
}
