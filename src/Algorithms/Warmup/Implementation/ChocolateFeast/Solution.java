package Algorithms.Warmup.Implementation.ChocolateFeast;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0; i<t; i++){
            int n = sc.nextInt();
            int c = sc.nextInt();
            int m = sc.nextInt();
            int barritas = n/c;
            int wrappers = n/c;
            int chocoExtra=wrappers/m;
            barritas+=chocoExtra;
            while (chocoExtra+(wrappers%m)>=m){
                wrappers = wrappers - (chocoExtra*m) + chocoExtra;
                chocoExtra = wrappers/m;
                barritas+=chocoExtra;
            }
            System.out.println(barritas);
        }
    }
}