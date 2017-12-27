package Algorithms.Warmup.GraphTeory.EvenTree;

import java.util.*;

public class Solution4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nodos = sc.nextInt();
        int vertices = sc.nextInt();
        int[][] matriz = new int[nodos][nodos];
        for (int i=0; i<vertices;i++){
            int j = sc.nextInt()-1;
            int k= sc.nextInt()-1;
            matriz[k][j]=1;
            matriz[j][k]=1;
        }
        int v=0;
        int resultado=0;
        for (int i=0; i<vertices;i++){
            for (int j=1; j<vertices; j++){
                if (matriz[i][j]==1){
                    resultado+=visitarNodo(j,vertices,matriz);
                    v++;
                }
            }
            if (v%2==1){
                resultado++;
                breakNodo(i,vertices,matriz);
            }
            v=0;
        }
        System.out.println(resultado);
    }
    //Esta funcion es para visitar los nodos y buscar los impares
    static int visitarNodo(int i, int v, int[][] m) {
        int resultado = 0;
        int veces=0;
            for (int j = 0; j < v; j++) {
                if (m[i][j] == 1) {
                    visitarNodo(j, v, m);
                    veces++;
                }
            }
            if (veces % 2 != 0) {
                breakNodo(i,v,m);
                return resultado++;

            } else {
                return 0;
            }
    }
    //Esta funcion me permite desligar el nodo del arbol
    static void breakNodo(int i, int v, int[][] m){
        for (int k=i+1; k<v; k++){
            if (m[i][k]==1){
                breakNodo(k,v,m);
            }
        }
        for (int k=0;k<v;k++){
            m[i][k]=0;
        }
    }
}