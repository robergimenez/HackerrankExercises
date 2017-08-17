package Algorithms.Warmup.Implementation.FindingDigits;

import java.util.Scanner;

/**
 * Created by rgimenez on 06/07/2017.
 * Sacar digitos a un numero
 * Operaciones con modulo
 */
public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for (int i=0; i<cases; i++){
            int veces =0;
            int numeroOriginal = sc.nextInt();
            int numero= numeroOriginal;
            int digito=numero%10;
            while (numero>=10){
                if (digito>0 && numeroOriginal%digito==0){
                    veces++;
                }
                numero/=10;
                digito=numero%10;
            }
            if (numero<10 && digito!=0 && numeroOriginal%digito==0){
                veces++;
            }
            System.out.println(veces);

        }
    }
}
