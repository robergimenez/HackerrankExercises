package Java.Tutorial.DataStructures.Java2DArray;

/**
 * Created by rgimenez on 01/01/2017.
 * hour glass
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        ArrayList<Integer> cantidad= new ArrayList<>();
        for (int i =0; i<4; i++){
            for (int j =0; j<4; j++){
                cantidad.add(arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]);
            }
        }
        Collections.sort(cantidad);
        System.out.println(cantidad.get(cantidad.size()-1));
    }
}
