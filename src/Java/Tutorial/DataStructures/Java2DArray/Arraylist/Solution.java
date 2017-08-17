package Java.Tutorial.DataStructures.Java2DArray.Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by rgimenez on 07/01/2017.
 */
public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<int[]> array = new ArrayList<>();
        for (int i=0; i<n; i++) {
            int cantidad = sc.nextInt();
            int[] fila = new int[cantidad];
            for (int j = 0; j < cantidad; j++) {
                fila[j] = sc.nextInt();
            }
            array.add(fila);
        }
        n = sc.nextInt();
        String mensaje="";
        for (int i=0; i<n; i++){
            int filaNumeros = sc.nextInt();
            int posicion = sc.nextInt();
            try {
                //int [] test = array.get(filaNumeros);
                //mensaje = test[posicion]
                mensaje = array.get(filaNumeros-1)[posicion-1] +"";
            }catch(Exception e){
                mensaje = "ERROR!";
            }finally {
                System.out.println(mensaje);
            }
        }
    }
}
