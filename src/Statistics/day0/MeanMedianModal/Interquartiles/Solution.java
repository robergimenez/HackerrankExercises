package Statistics.day0.MeanMedianModal.Interquartiles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by rgimenez on 05/06/2017.
 */
public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cantidad = sc.nextInt();
        ArrayList<Integer> numeros = new ArrayList<>(cantidad);
        ArrayList<Integer> frecuencias =  new ArrayList<>(cantidad);
        for (int i=0; i<cantidad; i++){
            numeros.add(sc.nextInt());
        }
        for (int i=0; i<cantidad; i++){
            frecuencias.add(sc.nextInt());
        }
        ArrayList<Integer> array = new ArrayList<>();
        for(int i=0; i<numeros.size();i++){
            for (int j=0; j<frecuencias.get(i); j++){
                array.add(numeros.get(i));
            }
        }
        Collections.sort(array);
        double q1=0.0, q3=0.0;
        if (array.size()%2!=0){
            if (array.size()/2%2!=0){
                q1 = array.get(Math.round(array.size() / 4));
                q3 = array.get(Math.round(array.size() * 3 / 4));
            }else{
                q1 = (array.get(Math.round(array.size()/4)-1) + array.get(Math.round(array.size() / 4)))/2;
                q3 = (array.get(Math.round(array.size()*3/4)+1) + array.get(Math.round(array.size()*3 / 4)))/2;
            }
        }else{
            if((array.size()/2)%2!=0) {
                q1 = array.get(Math.round(array.size() / 4));
                q3 = array.get(Math.round(array.size() * 3 / 4));
            }else  {

                q1 = (array.get(Math.round(array.size()/4)-1) + array.get(Math.round(array.size() / 4)))/2;
                q3 = (array.get(Math.round(array.size()*3/4)+1) + array.get(Math.round(array.size()*3 / 4)))/2;
            }
        }
        //System.out.printf("%.1d", q3-q1);
        System.out.println(q3-q1);
    }
}
