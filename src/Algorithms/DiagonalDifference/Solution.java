package Algorithms.DiagonalDifference;

/**
 * Created by rgimenez on 28/11/2016.
 */
import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int filas = scan.nextInt();
        //int filasTotales = filas^2;
        int[][] array = new int[filas][filas];
        for (int i=0; i<filas;i++){
            for(int j=0; j<filas; j++){
                array[i][j] = scan.nextInt();
            }
        }
        scan.close();
        int diag1=0; int diag2=0;
        for (int i=0; i<filas;i++){
            diag1 += array[i][i];
            diag2 += array[i][filas-i-1];
        }
        int resultado = positivar(diag1) + positivar(diag2);
        System.out.println(resultado);

    }

    public static int positivar(int i){
        if (i<0){
            i *=(-1);
        }
        return i;
    }
}
