package Algorithms.Warmup.Implementation.MinimumDistances;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cant = sc.nextInt();
        int[] array = new int[cant];
        for (int i=0; i< cant; i++){
            array[i] = sc.nextInt();
        }
        ArrayList<Integer> distancias = new ArrayList<>();
        for (int i=0; i<array.length;i++){
            for (int j=i+1; j<array.length; j++){
                if (array[i]== array[j]){
                    distancias.add(j-i);
                }
            }
        }
        Collections.sort(distancias);
        if (distancias.size()!=0)
            System.out.println(distancias.get(0));
        else {
            System.out.println("-1");
        }
    }
}
