package Algorithms.Warmup.DynamicProgramming.StockMaximize;

/* Encontrar la maxima rentabilidad, el mayor numero*/

import java.text.DecimalFormat;
import java.util.*;

public class Solution2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        double total=0;
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int arr_i = 0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            total=0;
            int mayor=arr[arr.length-1];
            for (int i=arr.length-2;i>=0;i--){
                if (mayor<=arr[i]){
                    mayor=arr[i];
                }else{
                    double[] temp = acciones(arr,i, mayor);
                    total += temp[0];
                    i = (int)temp[1];
                    mayor=0;

                }
            }
            DecimalFormat df = new DecimalFormat("#.##");
            System.out.println(df.format(total));
        }
        in.close();
    }
    public static double[] acciones(int[] cotizaciones, int posicion, int mayor){
        double total=0;
        double precioVenta = cotizaciones[posicion+1];
        //double test = cotizaciones[posicion+1]*(double)(posicion+1);
        double venta = cotizaciones[posicion+1]*(double)(posicion+1) - cotizaciones[posicion];
        while ((posicion-1) >= 0 && cotizaciones[posicion - 1] < mayor) {
            total += cotizaciones[posicion-1];
            posicion--;
        }
        double [] totales = new double[2];
        totales[0]=venta-total-(precioVenta*posicion);
        totales[1]=posicion;
        return totales;
    }
}
