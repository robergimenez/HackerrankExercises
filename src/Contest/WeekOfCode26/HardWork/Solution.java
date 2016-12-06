package Contest.WeekOfCode26.HardWork;

/**
 * Created by rgimenez on 03/12/2016.
 * Encontrar el mayor de los senos de trigonometria
 */
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.math.*;
public class Solution {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
        ArrayList<Double> array = new ArrayList<>();
    for (double i =1; i<n; i++){
        for(double j=1; j<n;j++){
            for (double k=1; k<n; k++){
                if ((i + j + k) == n){
                    array.add((Math.sin(i)) +
                            Math.sin((j)) +
                            Math.sin((k)));
                    }

                    }
                }
            }
        Collections.sort(array);
        System.out.println(String.format("%.9f", array.get(array.size()-1)));
    }
}
