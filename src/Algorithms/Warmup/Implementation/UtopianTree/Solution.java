package Algorithms.Warmup.Implementation.UtopianTree;

import java.util.Scanner;

/**
 * Created by rgimenez on 01/07/2017.
 */
public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        for (int i=0; i<casos;i++){
            int ciclos = sc.nextInt();
            int altura = 1;
            for (int j=0; j<ciclos; j++){
                if (j%2==0){
                    altura*=2;
                }else {
                    altura+=1;
                }
            }
            System.out.println(altura);
        }
    }
}
