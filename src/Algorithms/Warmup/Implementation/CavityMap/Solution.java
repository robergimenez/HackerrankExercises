package Algorithms.Warmup.Implementation.CavityMap;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        char[][] matriz = new char[n][n];
        String frase;
        for (int i=0; i<n; i++){
             frase = sc.nextLine();
            for (int j=0; j<n; j++){
                matriz[i][j] = frase.charAt(j);
            }
        }
        for (int i=1; i<n-1; i++){
            for (int j=1; j<n-1; j++){
                if (matriz[i][j] > matriz[i-1][j] && matriz[i][j] > matriz[i+1][j] &&matriz[i][j] > matriz[i][j-1]
                        && matriz[i][j] > matriz[i][j+1]){
                    matriz[i][j] = 'X';
                }
            }
        }
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
