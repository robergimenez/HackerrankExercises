package Tutorials.ThirtyDaysOfCode.Day11;

import java.util.Scanner;

 /**
 *
 * @author rgimenez
 */

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int[] reloj= new int[4];
        int mayor=-10000;
        for(int i=0; i < 4; i++){
            reloj[0] = arr[i][0]+arr[i][1]+arr[i][2]+arr[i+1][1]+arr[i+2][0]+arr[i+2][1]+arr[i+2][2];
            reloj[1] = arr[i][1]+arr[i][2]+arr[i][3]+arr[i+1][2]+arr[i+2][1]+arr[i+2][2]+arr[i+2][3];
            reloj[2] = arr[i][2]+arr[i][3]+arr[i][4]+arr[i+1][3]+arr[i+2][2]+arr[i+2][3]+arr[i+2][4];
            reloj[3] = arr[i][3]+arr[i][4]+arr[i][5]+arr[i+1][4]+arr[i+2][3]+arr[i+2][4]+arr[i+2][5];
            for (int j=0; j<4; j++){
                if (mayor<reloj[j]){
                    mayor=reloj[j];
                }
            }
        }
        System.out.println(mayor);
    }
} {
}
