package Algorithms.Warmup.Implementation.EqualizeTheArray;

import java.util.*;

/**
 * Created by rgimenez on 17/07/2017.
 */
public class Solution {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        TreeMap<Integer, Integer> arbol = new TreeMap<>();
        for (int i=0; i<n;i++){
            int valor = sc.nextInt();
            if (arbol.containsKey(valor)){
                arbol.replace(valor, arbol.get(valor).intValue()+1);
            }else {
                arbol.put(valor, 1);
            }
        }
        int valorMasAlto =0;
        for (Map.Entry<Integer, Integer> entry:arbol.entrySet()){
            if(valorMasAlto<entry.getValue()){
                valorMasAlto=entry.getValue();
            }
        }
        System.out.println(n-valorMasAlto);


    }
}
