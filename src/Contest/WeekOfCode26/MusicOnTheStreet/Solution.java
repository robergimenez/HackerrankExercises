package Contest.WeekOfCode26.MusicOnTheStreet;

/**
 * Created by rgimenez on 01/12/2016.
 * Calcular la ruta óptima
 * Resulve el 100% de los casos.
 */

import java.util.ArrayList;
import java.util.Scanner;
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner(System.in);
    int cortes = sc.nextInt();
    ArrayList<Integer> array = new ArrayList<>();
    for (int i=0; i<cortes; i++){
        array.add(sc.nextInt());
    }
    int m = sc.nextInt(), hmin= sc.nextInt(), hmax = sc.nextInt();

        System.out.println(array.get(0)-hmax);
    }

}
