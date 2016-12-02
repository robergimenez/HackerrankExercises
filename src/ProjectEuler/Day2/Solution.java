package ProjectEuler.Day2;

/**
 * Created by rgimenez on 26/11/2016.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Difference {
    private int[] elements;
    public int maximumDifference=0;

    Difference(int[] array){
        this.elements = array;
    }

    protected void computeDifference(){
        ArrayList<Integer> elementos = new ArrayList<>();
        for (int i=0; i<elements.length; i++){
            if (elements[i] <0){
                elementos.add(elements[i]*(-1));
            }else {
                elementos.add(elements[i]);
            }
        }
        Collections.sort(elementos);
        this.maximumDifference= elementos.get(elementos.size()-1) - elementos.get(0);
    }
}

    public class Solution {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            sc.close();

            Difference difference = new Difference(a);

            difference.computeDifference();

            System.out.print(difference.maximumDifference);
        }
    }
