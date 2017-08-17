package Statistics.day0.MeanMedianModal.quartiles;

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
        ArrayList<Integer> array = new ArrayList<>(cantidad);
        int q1=0, q2=0, q3=0;
        for (int i=0; i< cantidad; i++){
            array.add(sc.nextInt());
        }

        Collections.sort(array);
        //if (array.size()<4){System.out(exit0);}
        if (array.size()%2!=0){
            q2 = array.get(Math.round(array.size() / 2));
            if (array.size()/2%2!=0){
                q1 = array.get(Math.round(array.size() / 4));
                q3 = array.get(Math.round(array.size() * 3 / 4));
            }else{
                q1 = (array.get(Math.round(array.size()/4)-1) + array.get(Math.round(array.size() / 4)))/2;
                q3 = (array.get(Math.round(array.size()*3/4)-1) + array.get(Math.round(array.size()*3 / 4)))/2;
            }
        }else{
            int min = array.get(array.size()/2-1);
            int max =array.get((array.size()/2));
            q2 = (min + max)/2;
            if (array.size()/2%2!=0){
                q1 = array.get(Math.round(array.size() / 4));
                q3 = array.get(Math.round(array.size() * 3 / 4));
            }else{
                q1 = (array.get(Math.round(array.size()/4)-1) + array.get(Math.round(array.size() / 4)))/2;
                q3 = (array.get(Math.round(array.size()*3/4)-1) + array.get(Math.round(array.size()*3 / 4)))/2;
            }
        }
        System.out.println(q1);
        System.out.println(q2);
        System.out.println(q3);
    }
}
