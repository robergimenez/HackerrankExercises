package Algorithms.Warmup.Implementation.LarrysArray;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        int lon = sc.nextInt();
        int[] array = new int[lon];
        for (int i=0; i<casos;i++){
            for (int j=0; j<lon;j++){
                array[i] = sc.nextInt();
            }

        }
    }
}
