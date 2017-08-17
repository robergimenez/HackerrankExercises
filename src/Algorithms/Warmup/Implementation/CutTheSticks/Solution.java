package Algorithms.Warmup.Implementation.CutTheSticks;

import java.util.*;

/**
 * Created by rgimenez on 10/07/2017.
 * Sorting and ordering
 */
public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cantidad = sc.nextInt();
        ArrayList<Integer> array = new ArrayList<>();
        for (int  i=0; i<cantidad;i++){
            array.add(sc.nextInt());
        }
        System.out.println(array.size());
        while (array.size()>0) {
            Collections.sort(array);
            int minimo=array.get(0);
            int j= array.size();
            for (int i = 0; i < j; i++) {
                if (array.get(i) - minimo >0) {
                    array.add(array.get(i)-minimo);

                }
                array.remove(i);
                i--;
                j--;
            }
            if ((array.size()!=0)) {
                System.out.println(array.size());
            }
        }


    }
}
