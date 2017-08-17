package Algorithms.Warmup.Implementation.SherlockAndSquares;

import java.util.Scanner;

/**
 * Created by rgimenez on 09/07/2017.
 * Calcular el numero de cuadrados perfectos entre dos numeros.
 * Raices cuadradas
 */
public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        for (int i=0; i<casos; i++){
            int a= sc.nextInt();
            int b = sc.nextInt();
            int minimo=0, maximo = 0;
            for (int j=a; j<=b;j++){
                if (Math.sqrt(j)-(int)Math.sqrt(j)==0){
                    minimo=j;
                    break;
                }
            }
            for (int j=b; j>=a;j--){
                if (Math.sqrt(j)-(int)Math.sqrt(j)==0){
                    maximo=j;
                    break;
                }
            }
            int cantidad=(int)Math.sqrt(maximo)-(int)Math.sqrt(minimo)+1;
            if ((maximo==minimo)){
                if (Math.sqrt(minimo)-(int)Math.sqrt(minimo)==0){
                    cantidad=1;
                }else {
                    cantidad = 0;
                }
            }
            if (minimo==0 || maximo==0){
                cantidad=0;
            }
            System.out.println(cantidad);
        }
    }
}
