package Algorithms.Warmup.Implementation.ViralAdvertisement;

import java.util.Scanner;

/**
 * Created by rgimenez on 03/07/2017.
 */
public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int dias = sc.nextInt();
        int personas = 5;
        int totales=0;

        for (int i=0; i<dias; i++){
            personas = personas/2;
            totales+=personas;
            personas*=3;
        }
        System.out.println(totales);
    }
}
