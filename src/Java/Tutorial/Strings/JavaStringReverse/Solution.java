package Java.Tutorial.Strings.JavaStringReverse;

import java.util.Scanner;

/**
 * Created by rgimenez on 29/12/2016.
 * Palindrome
 */
public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String palindrome = "Yes";
        for (int i=0; i<A.length()/2; i++){
            if (A.charAt(i) != A.charAt(A.length()-1-i)){
                palindrome = "No";
            }
        }
        System.out.println(palindrome);

    }
}
