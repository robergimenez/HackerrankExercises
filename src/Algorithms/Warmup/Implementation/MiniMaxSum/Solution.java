package Algorithms.Warmup.Implementation.MiniMaxSum;

/**
 * Created by rgimenez on 28/11/2016.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Long> array = new ArrayList<Long>();
        for (int i=0; i<5;i++){
            array.add(in.nextLong());
        }
        in.close();
        Collections.sort(array);
        long minimo=0, maximo=0;
        for (int i=0; i<4; i++){
            minimo += array.get(i);
            maximo += array.get(4-i);
        }

    }
}
