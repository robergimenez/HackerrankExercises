package Algorithms.Warmup.Implementation.ServiceLane;

import java.util.Scanner;

public class Solution {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        int camino = sc.nextInt();
        int casos = sc.nextInt();
        int[] carretera = new int[camino];
        for (int i=0; i<camino;i++){
            carretera[i]=sc.nextInt();
        }
        for (int i=0; i<casos;i++){
            int inicio = sc.nextInt();
            int fin = sc.nextInt();
            int minimo=4;
            for (int j =inicio;j<=fin;j++){
                if (carretera[j]<minimo){
                    minimo=carretera[j];
                    if (carretera[j]==1){
                        j=fin;
                    }
                }
            }
            System.out.println(minimo);
        }
        sc.close();
    }
}
