package Tutorials.ThirtyDaysOfCode.Day16Exceptions;

/**
 * Created by rgimenez on 03/12/2016.
 */
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            String S = in.next();
            System.out.println(Integer.parseInt(S));
        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }
    }
}
