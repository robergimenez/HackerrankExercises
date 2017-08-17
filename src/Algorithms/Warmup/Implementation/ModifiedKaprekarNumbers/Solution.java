package Algorithms.Warmup.Implementation.ModifiedKaprekarNumbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/* Integer to array
*
 */

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double inicio = sc.nextInt();
        double fin = sc.nextInt();
        double n=0;
        ArrayList<Integer> respuesta = new ArrayList<>();
        for (int i=(int)inicio; i<=fin; i++) {
            n = Math.pow(i, 2);
            ArrayList<Double> array = new ArrayList<Double>();
            int n1 = 0, n2 = 0, veces=0;
            if (n>9) {
                while (n > 1) {
                    array.add( n % 10);
                    n /= 10;
                }
                Collections.reverse(array);
                int veces2=0;
                if (array.size() % 2 != 0) {
                    veces = Math.round(array.size()/2);
                    veces2 = veces+1;

                } else {
                    veces = Math.round(array.size()/2);
                    veces2=veces;
                }
                // Convertir el array en entero de nuevo
                for(int j = 0; j < veces; j++){
                    n1 += (array.get(j).intValue())*Math.pow(10,veces-j-1);
                }
                for(int j = array.size()-veces2; j < array.size(); j++){
                    n2 += array.get(j).intValue()*Math.pow(10,array.size()-j-1);
                }
                if (n1 + n2 == i) {
                    respuesta.add(i);
                }
            }else {
                if (n%10 + n/10 == n ||n==1){
                    respuesta.add((int)n);
                }
            }
        }
        if (respuesta.size()==0){
            System.out.println("INVALID RANGE");
        }else {
            for (int i = 0; i < respuesta.size(); i++) {
                System.out.print(respuesta.get(i) + " ");
            }
        }
        sc.close();
    }
}
