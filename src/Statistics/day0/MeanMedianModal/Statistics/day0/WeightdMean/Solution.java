package Statistics.day0.MeanMedianModal.Statistics.day0.WeightdMean;

import java.util.Scanner;

/**
 * Created by rgimenez on 05/06/2017.
 */
public class Solution {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cantidad = sc.nextInt();
        int [] numeros = new int[cantidad];
        int [] pesos = new int[cantidad];
        for (int i=0; i< cantidad; i++){
            numeros[i]= sc.nextInt();
        }
        for (int i=0; i< cantidad; i++){
            pesos[i]= sc.nextInt();
        }
        int suma =0;
        int sumaPesos=0;
        for (int i =0; i< cantidad; i++){
            suma+=(numeros[i]*pesos[i]);
            sumaPesos += pesos[i];
        }
        System.out.printf("%.1f", (float)suma/sumaPesos);
    }
}
