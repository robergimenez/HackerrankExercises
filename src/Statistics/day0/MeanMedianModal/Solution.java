package Statistics.day0.MeanMedianModal;

import java.util.*;

/**
 * Created by rgimenez on 04/06/2017.
 */
public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int cantidad = sc.nextInt();
            int suma=0;
        TreeMap<Integer, Integer> arbol = new TreeMap<>();
            ArrayList array = new ArrayList(cantidad);
            for (int i =0; i<cantidad; i++) {
                array.add(sc.nextInt());
                suma += (int)array.get(i);
                if (arbol.get(array.get(i)) == null) {
                    arbol.put((int)array.get(i), 1);
                } else {
                    //System.out.println(arbol.get(array[i]));
                    arbol.put((int)array.get(i), arbol.get(array.get(i)) + 1);
                }
            }
            double mediana=0.0;
            int mitad=0;
            Collections.sort(array);
            if (cantidad%2!=0) {
                /*
                int med = (int)arbol.keySet().toArray()[arbol.size()/2];
                mediana = (float) med*1.0;
                */
                mediana  = ((int)array.get(mitad-1)+(int)array.get(mitad))/2;
            }else {
                mitad = (int) cantidad / 2;
                //System.out.println(arbol.keySet().toArray()[arbol.size()/2]);
                //mediana = (float) ((int) arbol.keySet().toArray()[mitad - 1] + (int) arbol.keySet().toArray()[mitad]) / 2;
                mediana = (float)((int)array.get(mitad-1)+ (int)array.get(mitad))/2;
            }
            System.out.printf("%.1f", (float)suma/cantidad);
            System.out.println();
            System.out.printf("%.1f", mediana);
                System.out.println();
            int minimo=0;
            int valor=0;
            int minimoKey=0;
            Collection values = arbol.values();
            Iterator iter = values.iterator();
                    int i=0;
                    while (iter.hasNext()){
                        valor = (int)iter.next();
                        if (minimo<valor){
                            minimo=valor;
                            minimoKey = (int)arbol.keySet().toArray()[i];
                        }
                        i++;
                    }
            System.out.println(minimoKey+ "\n");

        }
    }
