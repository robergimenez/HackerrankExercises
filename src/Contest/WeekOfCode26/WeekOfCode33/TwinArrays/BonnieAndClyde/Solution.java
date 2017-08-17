package Contest.WeekOfCode26.WeekOfCode33.TwinArrays.BonnieAndClyde;

/**
 * Created by rgimenez on 16/06/2017.
 * Nodos, nodes
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
        int q = in.nextInt();
        int bonnie, clyde, sushi;
        boolean[][] matriz = new boolean[n][n];
        for (int a0 = 0; a0 < m; a0++) {
            int u = in.nextInt();
            int v = in.nextInt();
            matriz[u-1][v-1] = true;
            matriz[v-1][u-1] = true;
        }
        for (int a0 = 0; a0 < q; a0++) {
            bonnie = in.nextInt();
            clyde = in.nextInt();
            sushi = in.nextInt();
            ArrayList<Integer> array = new ArrayList<>();
            ArrayList<Integer> visitados = new ArrayList<>();
            int posicion=0;
            boolean condicion = true, bBonnie=false, bClyde=false;
            while (condicion && !(bBonnie && bClyde)) {
                if (visitados.size() == 0) {
                    posicion = sushi;
                    visitados.add(posicion);
                    posicion = ruta(posicion, matriz, visitados);
                    if (posicion >= 0) {
                        array.add(posicion);
                    }else {
                        if (array.contains(bonnie)){
                            if (array.contains(clyde)){
                                array.clear();
                                visitados.clear();
                                condicion=false;
                                break;
                            }else{
                                bBonnie=true;
                            }
                        }
                        if (array.contains(clyde)){
                            if (array.contains(bonnie)){
                                array.clear();
                                visitados.clear();
                                condicion=false;
                                break;
                            }else{
                                bClyde=true;
                            }
                        }
                    }
                }else if(posicion>=0){
                    while (posicion>=0) {
                        posicion = ruta(array.get(0), matriz, visitados);
                        visitados.add(array.get(0));
                        if (posicion >= 0) {
                            array.remove(array.get(0));
                            array.add(posicion);
                        } else {
                            if (visitados.contains(bonnie)) {
                                if (visitados.contains(clyde)) {
                                    array.clear();
                                    visitados.clear();
                                    condicion = false;
                                    break;
                                } else {
                                    bBonnie = true;
                                }
                            }
                            if (visitados.contains(clyde)) {
                                if (visitados.contains(bonnie)) {
                                    array.clear();
                                    visitados.clear();
                                    condicion = false;
                                    break;
                                } else {
                                    bClyde = true;
                                }
                            }
                        }
                    }
                }else {

                }
            }
            if (bBonnie && bClyde){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }

    private static int ruta(int sushi, boolean[][] matriz, ArrayList<Integer> visitados) {
        for (int i = 0; i < matriz.length; i++) {
            if (!visitados.contains(i+1)) {
                if (matriz[sushi-1][i]) {
                    return (i + 1);
                }
            }
        }
        return -1;
    }
}
