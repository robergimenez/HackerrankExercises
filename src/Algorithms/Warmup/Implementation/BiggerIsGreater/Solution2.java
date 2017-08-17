package Algorithms.Warmup.Implementation.BiggerIsGreater;

import java.io.*;
import java.util.*;

/* Resolver el problema de permutaciones para ordenacion lexicografica del siguiente elemento mayor, no del mayor
    de todos los elementos posibles con esas palabras.
    La forma m'as eficaz, es implementando permutaciones.

    https://www.nayuki.io/page/next-lexicographical-permutation-algorithm

Steps to generate the next higher permutation:

    Take the previously printed permutation and find the rightmost character in it, which is smaller than its next character. Let us call this character as ‘first character’.

    Now find the ceiling of the ‘first character’. Ceiling is the smallest character on right of ‘first character’, which is greater than ‘first character’. Let us call the ceil character as ‘second character’.

    Swap the two characters found in above 2 steps.

    Sort the substring (in non-decreasing order) after the original index of ‘first character’.

Example:- Let us consider the string “ABCDEF”. Let previously printed permutation be “DCFEBA”. The next permutation in sorted order should be “DEABCF”. Let us understand above steps to find next permutation. The ‘first character’ will be ‘C’. The ‘second character’ will be ‘E’. After swapping these two, we get “DEFCBA”. The final step is to sort the substring after the character original index of ‘first character’. Finally, we get “DEABCF”.

I have used the same Algorithm in C# to solve the challenge :-
 */

public class Solution2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            System.out.println(nextPermutation(sc.next()));
        }
        sc.close();
    }

    public static String nextPermutation(String str) {
        char[] arr = str.toCharArray();

        if(arr.length < 2) {
            return "no answer";
        }

        int p = 0;
        for(int i = arr.length - 2; i >= 0; i--) {
            if(arr[i] < arr[i + 1]) {
                p = i;
                break;
            }
        }

        int q = 0;
        for(int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] > arr[p]) {
                q = i;
                break;
            }
        }

        if(p == 0 && q == 0) {
            return "no answer";
        }

        char temp = arr[p];
        arr[p] = arr[q];
        arr[q] = temp;

        if(p < arr.length - 1) {
            int left = p + 1;
            int right = arr.length - 1;
            while(left < right) {
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return String.valueOf(arr);
    }
}
