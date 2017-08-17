package Java.Tutorial.DataStructures.Java2DArray.List;

import sun.plugin.javascript.navig.Array;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by rgimenez on 07/01/2017.
 */
public class Solution {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> array = new ArrayList<>();
        for (int i =0; i< n; i++){
            array.add(sc.nextInt());
        }
        n = sc.nextInt();
        String accion = sc.nextLine();
        for (int i=0; i<n; i++){
            accion = sc.nextLine();
            if (accion.equals("Insert")){
                int posicion = sc.nextInt();
                int numero = sc.nextInt();
                array.add(posicion,numero);
                if (sc.hasNextLine()) {
                    sc.nextLine();
                }
            }else{
                int posicion = sc.nextInt();
                array.remove(posicion);
                if (sc.hasNextLine()) {
                    sc.nextLine();
                }
            }
        }
        for (int element: array){
            System.out.print(element + " ");
        }
    }
}
