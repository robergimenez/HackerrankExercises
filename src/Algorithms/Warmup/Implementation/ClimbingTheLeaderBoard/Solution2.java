package Algorithms.Warmup.Implementation.ClimbingTheLeaderBoard;


/**
 * Created by rgimenez on 30/06/2017.
 * Busqueda Binaria
 */
import javafx.collections.transformation.SortedList;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        TreeSet<Integer> array = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return Integer.parseInt(o1.toString()) - Integer.parseInt(o2.toString());
            }
        });
        array.add(0);
        for (int scores_i = 0; scores_i < n; scores_i++) {
            array.add(in.nextInt());
        }
        int m = in.nextInt();
        int[] alice = new int[m];
        for (int alice_i = 0; alice_i < m; alice_i++) {
            alice[alice_i] = in.nextInt();
        }
        // your code goes here
        //Limpiamos el array de duplicados y ordenado.
        ArrayList<Integer> set1 = new ArrayList<>();
        Iterator<Integer> it = array.iterator();
        while (it.hasNext()) {
            set1.add(it.next());
        }
        // Comenzamos la busqueda binaria

        int cantidad = n;
        int posicio = 0;
        int anterior=0;
        for (int i = posicio; i < alice.length; i++) {
            if(set1.get(set1.size()-1)<=alice[i]){
                System.out.println("1");
                continue;
            }
            if (anterior!=alice[i]) {
                anterior = alice[i];
                posicio = buscar(posicio, alice[i], set1);
                System.out.println(array.size() - posicio);
            }else {
                System.out.println(array.size() - posicio);
            }
        }
    }

    static int buscar(int inicio, int rank, ArrayList<Integer> array) {
        for (int i=inicio; i<array.size(); i++){
            if(array.get(i)>rank){
                return i-1;
            }
        }
        return inicio+1;
    }

}