package Java.Tutorial.DataStructures.Java2DArray.Subarray;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by rgimenez on 07/01/2017.
 * recursive
 */

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i =0; i<n; i++){
            array[i] = sc.nextInt();
        }
        int negativos=0;
        for (int i=0; i<n;i++){
            if(array[i]<0){
                negativos++;
            }
        }
        for (int i=0; i<n; i++){
            int cantidad =array[i];
            for(int j=i+1; j<n; j++){
                cantidad += array[j];
                if (cantidad <0){
                    negativos++;
                }
            }
            cantidad=0;
        }
        System.out.println(negativos);
    }
}