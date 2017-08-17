package Algorithms.Warmup.Implementation.MagicSquareForming;

/**
 * Created by rgimenez on 29/06/2017.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] s = new int[3][3];
        for(int s_i=0; s_i < 3; s_i++){
            for(int s_j=0; s_j < 3; s_j++){
                s[s_i][s_j] = in.nextInt();
            }
        }
        //  Print the minimum cost of converting 's' into a magic square
        int cantidad=0;
        //El centro tiene que ser igual a 5
        if (s[1][1]!=5){
            cantidad = Math.abs(s[1][1]-5);
            s[1][1] = 5;
        }
        //Las sumas de los angulos tienen que ser igual a 15
        ArrayList<Integer> array = new ArrayList<>();
        array.add(s[0][0] + s[0][1] + s[0][2]);
        array.add(s[1][0] + s[1][1] + s[1][2]);
        array.add(s[2][0] + s[2][1] + s[2][2]);
        array.add(s[0][0] + s[1][0] + s[2][0]);
        array.add(s[0][1] + s[1][1] + s[2][1]);
        array.add(s[0][2] + s[1][2] + s[2][2]);
        array.add(s[0][0] + s[1][1] + s[2][2]);
        array.add(s[2][0] + s[1][1] + s[0][2]);
        for (int i=0; i<array.size(); i++){
            if(array.get(i)!=15){
                if(i<3){
                    //Las esquinas tienen que ser pares
                    if(s[i][0]%2!=0){

                    }
                }else if(i<7){

                }else {

                }
            }
        }

    }
}
