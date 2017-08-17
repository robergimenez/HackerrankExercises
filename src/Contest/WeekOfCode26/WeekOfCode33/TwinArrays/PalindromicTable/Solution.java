package Contest.WeekOfCode26.WeekOfCode33.TwinArrays.PalindromicTable;

/**
 * Created by rgimenez on 15/06/2017.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] table = new int[n][m];
        int[][] tableAux = new int[n][m];
        int[] array= new int[n*m];
        for(int table_i = 0; table_i < n; table_i++){
            for(int table_j = 0; table_j < m; table_j++){
                table[table_i][table_j] = in.nextInt();
                tableAux[table_i][table_j] = in.nextInt();
            }
        }
        int valor =0;
        while(valor!=-1) {
            valor = esPalindrome(array);
            if (valor >= 0) {
                for (int table_i = 0; table_i < n; table_i++) {
                    for (int table_j = 0; table_j < m; table_j++) {
                        if ( tableAux[table_i][table_j] ==; valor){
                            tableAux[table_i][table_j] = -1;
                        }
                    }
                }
            }
        }
        int area=0;
    }
    public static int area(int[][] matriz){
        int contador=0, mayor=0;
        int [] coordenadaInicio = new int[2]{0,0};
        int[] coordenadaFinal= new int[4]{0,0,0,0};
        for(int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz[i].length;j++){
                if(matriz[i][j]>=0) {
                    if (contador==0){
                        coordenadaInicio[0]=i;
                        coordenadaInicio[1]=j;
                    }
                    contador++;
                }else if (contador>mayor){
                    mayor=contador;
                    coordenadaFinal[0]=coordenadaInicio[0];
                    coordenadaFinal[1]=coordenadaInicio[1];
                    coordenadaFinal[2]=i;
                    coordenadaFinal[3]=j;
                }
            }
        }
        return coordenadaFinal[1]-
    }
    public static int esPalindrome(int[] array){
        int valor=-1;
        HashMap<Integer, Integer> mapa = new HashMap<>();
        for (int i=0; i<array.length; i++){
            for (int j=0; )
            if (mapa.containsKey(array[i])){
                mapa.put(mapa.get(array[i]), mapa.get(array[i]).intValue()+1);
            }else {
                mapa.put(array[i], 1);
            }
        }
        for (int i=0; i< mapa.size(); i++){
            if (mapa.get(array[i])%2!=0){
                //Valor a remover del array.
                return valor = array[i];
            }
        }
        return valor;
    }
}
*/