package Algorithms.Warmup.Implementation.MigratoryBirds;

/**
 * Created by rgimenez on 25/06/2017.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class Solution {

    static int migratoryBirds(int n, int[] ar) {
        // Complete this function
        TreeMap<Integer, Integer> mapa =  new TreeMap<>();
        for (int i=0; i< ar.length;i++){
            if (mapa.containsKey(ar[i])){
                mapa.put(ar[i], mapa.get(ar[i]).intValue()+1);
            }else{
                mapa.put(ar[i], 1);
            }
        }
        Collection c = mapa.values();
        Iterator<Integer> it = c.iterator();
        int mayor=0, numero=0;
        while (it.hasNext()){
            numero = it.next();
            if (numero>mayor){
                mayor=numero;
            }
        }
        int clave=0;
        ArrayList<Integer> array = new ArrayList<>();
        for(int key: mapa.keySet()) {
            if(mapa.get(key).equals(mayor)) {
                array.add(key);
            }
        }
        Collections.sort(array);
        return array.get(0);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
