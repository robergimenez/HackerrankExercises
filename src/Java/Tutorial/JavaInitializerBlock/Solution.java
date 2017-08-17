package Java.Tutorial.JavaInitializerBlock;

import java.util.Scanner;

/**
 * Created by rgimenez on 24/12/2016.
 */
public class Solution {
    static int B=0, H=0;
    static boolean flag = true;
    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        sc.close();
            if (B < 0 || H < 0) {
                System.out.println("java.lang.Exception: Breadth and height must be positive");
                flag = false;
            }
    }
    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class
