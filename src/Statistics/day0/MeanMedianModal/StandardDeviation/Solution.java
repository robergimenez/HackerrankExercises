package Statistics.day0.MeanMedianModal.StandardDeviation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by rgimenez on 06/06/2017.
 */
public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double media = 0;
        int cantidad = sc.nextInt();
        ArrayList<Double> array = new ArrayList<>();
        for (int i=0; i<cantidad; i++){
            array.add(sc.nextDouble());
            media += array.get(i);
        }
        media/=cantidad;
        Collections.sort(array);
        /*
        if (array.size()%2!=0){
            mediana = array.get(array.size()/2);
        }else{
            mediana = (array.get(array.size()/2)+array.get(array.size()/2+1))/2;
        }
        */
        double resultado =0.0;
        for (int i=0; i<cantidad; i++){
            resultado+=Math.pow((array.get(i) - media), 2);
        }
        resultado = Math.sqrt(resultado/array.size());
        System.out.printf("%.1f", resultado);
    }
}
