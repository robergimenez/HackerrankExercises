package Algorithms.Warmup.Implementation.AngryProfessor;

import java.util.Scanner;

/**
 * Created by rgimenez on 03/07/2017.
 */
public class Solution {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        for (int  i=0; i<casos; i++){
            int estudiantes = sc.nextInt();
            int minimo = sc.nextInt();
            int cantidad=0;
            for (int j=0; j<estudiantes; j++){
                if(sc.nextInt()<=0){
                    cantidad++;
                }
            }
            if (cantidad>=minimo){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}
