package Tutorials.ThirtyDaysOfCode.Day26NestedLogic;

/**
 * Created by rgimenez on 11/12/2016.
 */
import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int dayA = sc.nextInt();
        int monthA = sc.nextInt();
        int yearA = sc.nextInt();
        int dayE = sc.nextInt();
        int monthE = sc.nextInt();
        int yearE = sc.nextInt();
        sc.close();
        int fine  =0;
        if (yearA > yearE) {
            fine = 10000;
        }else if (yearA == yearE && monthA>monthE) {
            fine = 500 * (monthA - monthE);
        }else if(yearA==yearE && monthA==monthE && dayA>dayE) {
            fine = 15 * (dayA - dayE);
        }
        System.out.println(fine);
    }
}
