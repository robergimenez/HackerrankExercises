package Algorithms.Warmup.Implementation.BetweenTwoSets;

    /**
     * Created by rgimenez on 24/06/2017.
     */

    /**
     * Created by rgimenez on 06/02/2017.
     * Multiplos
     * Maximo comun multiplo y minimo comun divisor
     * MCD, mcm, mcd
     * Algoritmo Euclides
     */
    import java.io.*;
    import java.util.*;
    import java.text.*;
    import java.math.*;
    import java.util.regex.*;

    public class Solution {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int m = in.nextInt();
            int[] a = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            int[] b = new int[m];
            for(int b_i=0; b_i < m; b_i++){
                b[b_i] = in.nextInt();
            }
            long maxComun = MCD(b);
            long minComun = MCM(a);
            int cantidad = 0;
            int multiplo=2;
            for (long i=minComun; i<=maxComun;multiplo++){
                if (maxComun%i==0){
                    cantidad++;
                }
                i=minComun*multiplo;
                //multiplo++;
            }
            System.out.println(cantidad);
        }
        /*
        private static boolean divisor (int a, int b){
            return ( a % b == 0)?true:false;
        }
    */
        private static long MCM(long a, int b){
            return(a/MCD(a,b)*b);
        }

        private static long MCD(long a, long b){
            long aux;
            if (a<b){
                aux=b;
                b=a;
                a=aux;
            }
            long resto=a%b;
            while (resto!=0){
                a=b;
                b = resto;
                resto = a%b;
            }
            return b;
        }
        private static long MCD(int[] a){
            long max = a[0];
            for (int i=1; i<a.length; i++){
                max = MCD(max, a[i]);
            }
            return max;
        }

        private static long MCM(int[] a){
            long min = a[0];
            for (int i=1; i<a.length;i++){
                min = MCM(min, a[i]);
            }
            return min;
        }
    }