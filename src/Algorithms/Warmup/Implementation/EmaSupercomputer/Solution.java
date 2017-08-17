package Algorithms.Warmup.Implementation.EmaSupercomputer;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        sc.nextLine();
        String[] linea = new String[r];
        int mayor=0;
        int menor=0;
        for (int i=0; i<r; i++){
            linea[i] = sc.nextLine();
        }
        int indice=0;
        for (int i=1; i<r-1; i++){
            indice =linea[i].indexOf("G");
            if (indice!=-1 && indice<c){
                mayor=1;
                int seguidas =0;
                for (int j=indice+1; j<c-1;j++){
                    if (linea[i].charAt(j)=='G' && linea[i-1].charAt(j)=='G' && linea[i+1].charAt(j)=='G'
                            && linea[i].charAt(j-1)=='G'&& linea[i].charAt(j-1)=='G'){
                        mayor=5;
                    }
                }
            }
        }

    }
}
