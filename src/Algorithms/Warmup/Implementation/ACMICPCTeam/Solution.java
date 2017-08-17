package Algorithms.Warmup.Implementation.ACMICPCTeam;

import java.math.BigInteger;
import java.util.BitSet;
import java.util.Scanner;
/* Operaciones binarias con unos y ceros. Operador bit.*/
public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int personas = sc.nextInt();
        int materias = sc.nextInt();
        BigInteger[] array = new BigInteger[personas];
        for (int i=0; i<personas; i++){
            array[i] = sc.nextBigInteger(2);
        }
       BigInteger  suma;
        int mayor =0;
        int cantidad =0;
        int totales=0;
        for (int i=0; i<array.length; i++){
            for (int j=i+1; j<array.length; j++) {
                suma = array[i].or(array[j]);
                cantidad = suma.bitCount();
                if (cantidad > mayor) {
                    totales=1;
                    mayor = cantidad;
                } else if (cantidad == mayor) {
                    totales++;
                }
            }
        }
        System.out.println(mayor);
        System.out.println(totales);

    }
}
