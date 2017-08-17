package Algorithms.Warmup.Implementation.QueensAttackII;
/**
 * Created by rgimenez on 17/07/2017.
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
        int k = in.nextInt();
        int[][] tablero = new int[n][n];
        //Inicializamos el tablero.
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                tablero[i][j]=0;
            }
        }
        int rQueen = in.nextInt()-1;
        int cQueen = in.nextInt()-1;
        for(int a0 = 0; a0 < k; a0++){
            int rObstacle = in.nextInt();
            int cObstacle = in.nextInt();
            // your code goes here
            //Colocamos las piezas en el tablero
            tablero[rObstacle-1][cObstacle-1]=1;
        }
        //vertical superior
        int mov =0;
        for (int i=rQueen+1;i<n;i++){
            if (tablero[i][cQueen]==0){
                mov++;
            }else {
                break;
            }
        }
        //diagonal superior izda.
        for (int i=rQueen+1, j=cQueen-1; i<n && j>=0 ; i++, j--){
            if (tablero[i][j]==0){
                mov++;
            }else {
                break;
            }
        }
        //diagonal superior dcha.
        for (int i=rQueen+1, j=cQueen+1; i<n && j<n ; i++, j++){
            if (tablero[i][j]==0){
                mov++;
            }else {
                break;
            }
        }
        //horizontal izda.
        for (int i=cQueen-1; i>=0; i--){
            if (tablero[rQueen][1]==0){
                mov++;
            }else {
                break;
            }
        }
        //horizontal dcha
        for (int i=cQueen+1; i<n; i++){
            if (tablero[rQueen][1]==0){
                mov++;
            }else {
                break;
            }
        }
        //vertical inferior
        for (int i=rQueen-1;i>=0;i--){
            if (tablero[i][cQueen-1]==0){
                mov++;
            }else {
                break;
            }
        }
        //diagonal superior izda.
        for (int i=rQueen-1, j=cQueen-1; i>=0 && j>=0 ; i--, j--){
            if (tablero[i][j]==0){
                mov++;
            }else {
                break;
            }
        }
        //diagonal inferior dcha.
        for (int i=rQueen-1, j=cQueen+1; i>=0 && j<n ; i--, j++){
            if (tablero[i][j]==0){
                mov++;
            }else {
                break;
            }
        }
        System.out.println(mov);
    }
}
