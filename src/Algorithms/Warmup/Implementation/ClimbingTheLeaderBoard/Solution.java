package Algorithms.Warmup.Implementation.ClimbingTheLeaderBoard;

/**
 * Created by rgimenez on 30/06/2017.
 */
import javafx.collections.transformation.SortedList;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        TreeSet<Integer> array = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return Integer.parseInt(o2.toString())-Integer.parseInt(o1.toString());
            }
        });
        Integer valor =0;
        for(int scores_i=0; scores_i < n; scores_i++){
            array.add(in.nextInt());
        }
        int m = in.nextInt();
        int[] alice = new int[m];
        for(int alice_i=0; alice_i < m; alice_i++){
            alice[alice_i] = in.nextInt();
        }
        // your code goes here
        //split the set in two.
        ArrayList<Integer> set1 = new ArrayList<>();
        ArrayList<Integer> set2 = new ArrayList<>();
        Iterator<Integer> it =  array.iterator();
        int contador=0;
        while (it.hasNext()){
            if (contador>array.size()/2){
                set2.add(it.next());
            }else {
                set1.add(it.next());
                contador++;
            }
        }
        for (int i=0; i<alice.length;i++) {
            int posicio = n-1;
            if (alice[i] > set1.get(set1.size() - 1)) {
                for (int j = 0; j < set1.size(); j++) {
                    if (alice[i] >= set1.get(j)) {
                        posicio = j + 1;
                        break;
                    }
                }
            } else {
                for (int j=0; j<set2.size();j++){
                    if (alice[i] >= set2.get(j)){
                        posicio = set1.size()+j;
                    }
                }
            }
            System.out.println(posicio);
        }

    }
}
