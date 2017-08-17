package Algorithms.Warmup.Implementation.FlatlandSpaceStations;

import java.util.Arrays;
import java.util.Scanner;

/*Grafo unidireccional

 */
public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ciudades = sc.nextInt();
        int cantEstaciones = sc.nextInt();
        int[] estaciones = new int[cantEstaciones];
        int distancia = 0;
        for (int i=0; i<cantEstaciones; i++){
            estaciones[i] = sc.nextInt();
        }
        Arrays.sort(estaciones);
        if (ciudades - estaciones[estaciones.length-1]-1>(estaciones[0]-0)) {
            distancia = ciudades - estaciones[estaciones.length - 1] - 1;
        }else {
            distancia = estaciones[0]-0;
        }
        for (int i=cantEstaciones-1; i>0;i--){
            if ((estaciones[i]-estaciones[i-1])/2>distancia){
                distancia =(estaciones[i]-estaciones[i-1])/2;
            }
        }
        System.out.println(distancia);
        sc.close();
    }
}
