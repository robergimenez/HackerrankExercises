package Algorithms.Warmup.Implementation.BeautifulTriplets;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cantidad = sc.nextInt();
        int diferencia = sc.nextInt();
        int[] array = new int[cantidad];
        for (int i=0; i<cantidad;i++){
            array[i]=sc.nextInt();
        }
        Arrays.sort(array);
        int encontrado=0;
        for (int i=array.length-1;i>=0;i--){
            for (int j=i-1; j>=0; j--){
                if (array[i]-array[j]==diferencia){
                    for (int k=j-1; k>=0;k--){
                        if (array[j]-diferencia==array[k]){
                            encontrado++;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(encontrado);
    }
}

