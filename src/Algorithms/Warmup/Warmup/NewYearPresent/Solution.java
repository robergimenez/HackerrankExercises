package Algorithms.Warmup.Warmup.NewYearPresent;

/**
 * Created by rgimenez on 27/11/2016.
 */
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> l = new ArrayList<>();
        int total=0;
        for(int i=0; i < n; i++) {
            l.add(in.nextInt());
        }
        int lado =0;
        boolean comprobar= true;
        int tamAntes=l.size();int tamDesp=0;
        while(comprobar){
            if (tamAntes==tamDesp){
                comprobar=false;
            }else {
                lado = sumar(l);
                tamAntes = l.size();
                l = filtrar(l, lado);
                tamDesp = l.size();
            }
        }
        String resultado="";
        if(l.size()<4) {
            resultado = "0";
        }else {
            resultado = Collections.max(l).toString();
        }
        System.out.println(resultado);
    }
    public static ArrayList<Integer> filtrar(ArrayList<Integer> list, int lado){
        for (int i=0; i< list.size()-1; i++){
            if (list.get(i)>lado){
                list.remove(i);
            }
        }
        return list;
    }

    public static int sumar(ArrayList<Integer> list){
        int suma=0;
        for (int i=0; i<list.size()-1;i++){
            suma+=list.get(i);
        }
        return suma/4;
    }
}