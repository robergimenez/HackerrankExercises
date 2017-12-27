package Algorithms.Warmup.Sorting.BigSorting.TutorialIntro;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int buscar = sc.nextInt();
        int cantidad = sc.nextInt();
        for (int i=0; i<cantidad;i++){
            if(buscar==sc.nextInt()) {
                System.out.println(i);
                break;
            }
        }

    }
}
