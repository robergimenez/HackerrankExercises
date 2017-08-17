package Tutorials.ThirtyDaysOfCode.Day29.Bitwise;

/**
 * Created by rgimenez on 23/12/2016.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Solution {
    public static void   main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int n=0, k=0;
    ArrayList<Integer> array = new ArrayList<>();
    for (int i=0; i<t; i++){
        n = sc.nextInt();
        k = sc.nextInt();
        for (int j=1; j<n; j++){
            for( int h= j; h<n; h++) {
                array.add(j & h);
            }
        }
        Collections.sort(array);
        for (i=array.size()-1; i>= 0; i--){
            if (array.get(i)<k){
                System.out.println(array.get(array.size()-1));
                break;
            }
        }
        array.clear();
    }

}

}
