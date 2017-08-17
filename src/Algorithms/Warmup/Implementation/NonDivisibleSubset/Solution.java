package Algorithms.Warmup.Implementation.NonDivisibleSubset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by rgimenez on 15/07/2017.
 */
public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cantidad = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> set = new ArrayList<>();
        for (int i=0; i<cantidad; i++){
            set.add(sc.nextInt());
        }
        HashSet<Integer> set2= new HashSet<>();
        for (int i=0; i<set.size(); i++){
            for (int j=0; j<set.size(); j++){
                int resto = (set.get(i)+set.get(j))%k;
                int numero1 = set.get(i);
                int numero2 = set.get(j);
                if((set.get(i)+set.get(j))%k !=0 && i!=j){
                    set2.add(set.get(i));
                    break;
                }
            }
        }
        System.out.println(set2.size());
    }
}
