package Algorithms.Warmup.Implementation.ExtraLongFactorial;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by rgimenez on 06/07/2017.
 * BigInteger
 * Factoriales
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        BigInteger factorial = factorial(numero);
        System.out.println(factorial);

    }

    static BigInteger factorial(int a) {
        BigInteger factorial = new BigInteger("1");
        if (a == 0) {
            return BigInteger.ONE;
        }else{
                do {
                    factorial= factorial.multiply(BigInteger.valueOf(a));
                }while (a-- > 1);
            }
        return factorial;
    }
}
