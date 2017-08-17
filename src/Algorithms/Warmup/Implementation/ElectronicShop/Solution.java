package Algorithms.Warmup.Implementation.ElectronicShop;

/**
 * Created by rgimenez on 27/06/2017.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getMoneySpent(int[] keyboards, int[] drives, int s){
        // Complete this function
        ArrayList<Integer> teclados = new ArrayList<>();
        ArrayList<Integer> unidades = new ArrayList<>();
        for (int i=0; i<keyboards.length; i++){
            if (keyboards[i]<s) {
                teclados.add(keyboards[i]);
            }
        }
        for (int i=0; i< drives.length; i++){
            if (drives[i]<s) {
                unidades.add(drives[i]);
            }
        }
        Collections.sort(teclados);
        Collections.sort(unidades);
        int mayor=-1;
            for (int i=0; i<teclados.size(); i++){
                for(int j=0; j<unidades.size(); j++){
                    if (teclados.get(i)+unidades.get(j)>mayor && teclados.get(i)+unidades.get(j)<=s){
                        mayor = teclados.get(i)+unidades.get(j);
                    }
                }
            }
            return mayor;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] keyboards = new int[n];
        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] drives = new int[m];
        for(int drives_i=0; drives_i < m; drives_i++){
            drives[drives_i] = in.nextInt();
        }
        //  The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
        int moneySpent = getMoneySpent(keyboards, drives, s);
        System.out.println(moneySpent);
    }
}
