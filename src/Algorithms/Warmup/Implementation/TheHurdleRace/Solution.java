package Algorithms.Warmup.Implementation.TheHurdleRace;

/**
 * Created by rgimenez on 01/07/2017.
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
        ArrayList<Integer> array = new ArrayList<>();
        for(int height_i=0; height_i < n; height_i++){
            array.add(in.nextInt());
        }
        // your code goes here
        Collections.sort(array);
        if (array.get(array.size()-1)-k>=0){
            System.out.println(array.get(array.size()-1)-k);
        }else {
            System.out.println("0");
        }
    }
}
