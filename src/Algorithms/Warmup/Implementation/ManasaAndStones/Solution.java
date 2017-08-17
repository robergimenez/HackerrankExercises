package Algorithms.Warmup.Implementation.ManasaAndStones;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        for (int j= 0; j<casos;j++) {
            int piedras = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            TreeSet<Integer> set = new TreeSet<>();
            int op1 = 0, op2 = piedras-1;
            for (int i = 0; i < piedras; i++) {
                set.add(op1 * a + op2 * b);
                op1++;
                op2--;
            }
            Iterator<Integer> it = set.iterator();
            while (it.hasNext()) {
                System.out.print(it.next() + " ");
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
