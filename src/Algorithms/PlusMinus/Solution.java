package Algorithms.PlusMinus;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by rgimenez on 28/11/2016.
 */
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        int positivos = 0; int nulos = 0;int  negativos = 0;
        int numero =0;
        for (int i=0; i<total;i++){
            numero = scan.nextInt();
            if (numero>0){
                positivos++;
            }else if(numero==0){
                nulos++;
            }else {
                negativos++;
            }
        }
        scan.close();
        System.out.println((double)positivos/total);
        System.out.println((double)negativos/total);
        System.out.println((double)nulos/total);
    }
}