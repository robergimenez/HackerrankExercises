package Java.Tutorial.DataStructures.Java2DArray.BitSet;

import java.util.Arrays;
import java.util.BitSet;
import java.util.Scanner;

/**
 * Created by rgimenez on 28/05/2017.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int longitud = sc.nextInt();
        int cantidadOperaciones = sc.nextInt();
        BitSet a = new BitSet(longitud);
        BitSet b = new BitSet(longitud);
        for (int i = 0; i < longitud; i++) {
            a.set(i, false);
            b.set(i, false);
        }
        String operacion = new String();
        operacion = sc.nextLine();
        for (int i = 0; i < cantidadOperaciones; i++) {
            operacion = sc.next();
            int num1 = Integer.parseInt(sc.next());
            int num2 = Integer.parseInt(sc.next());
            switch (operacion) {
                case "AND":
                    if (num1 < num2) {
                        a.and(b);
                    } else {
                        b.and(a);
                    }
                    break;
                case "OR":
                    if (num1>num2) {
                        b.or(a);
                    } else {
                        a.or(b);
                    }
                    break;
                case "XOR":
                    if (num1<num2) {
                        a.xor(b);
                    } else {
                        b.xor(a);
                    }
                    break;
                case "FLIP":
                    if (num1 == 1) {
                        if (a.get(num2)) {
                            a.set(num2, false);
                        } else {
                            a.set(num2, true);
                        }
                    } else {
                        if (b.get(num2)) {
                            b.set(num2, false);
                        } else {
                            b.set(num2, true);
                        }
                    }
                    break;
                case "SET":
                    if (num1 == 1) {
                            a.set(num2, true);
                    } else {
                            b.set(num2, true);
                    }
            }
            System.out.println(a.cardinality() + " " + b.cardinality());
        }
    }
}
