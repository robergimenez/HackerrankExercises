package Algorithms.Warmup.Implementation.JumpingOnTheClouds;

import java.util.Scanner;

/**
 * Created by rgimenez on 16/07/2017.
 */
public class Solution2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nubes = new int[n];
        for(int i=0; i< n; i++){
            nubes[i]=sc.nextInt();
        }
        int saltos=0;
        for(int i=0; i< n; i=i+2, saltos++){
            if(i+1==n){
                break;
            }
            if ((i+2 >n)){
                saltos++;
                break;
            }
            if (nubes[i]==1){
                i--;
            }
        }
        System.out.println(saltos);
    }
}

