package Algorithms.Warmup.Implementation.SequenceEquation;

import java.util.Scanner;

/*
p(x) is a one-to-one function, so it has an inverse. We create the function representing the inverse of p(x), and represent it as an array: int [] p_inverse

We need to find a y where p(p(y)) = x. This equation can be rewritten as
y = p_inverse(p_inverse(x)), which is the version of the equation we use to calculate and print y.
 */

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n+1];
        for (int i=1;i<array.length;i++){
            int x = sc.nextInt();
            array[x]=i;
        }
        sc.close();
        for (int i=1;i<array.length;i++){
            int y = array[array[i]];
            System.out.println(y);
        }
    }
}
