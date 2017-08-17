package Tutorials.ThirtyDaysOfCode.Day25RunningTimeAndComplexity;

/**
 * Created by rgimenez on 11/12/2016.
 */
import java.util.Scanner;
public class Solution {
    public static boolean esPrimo(int numero) {
        //Si un numero es divisible por otro numero menor o igual que el cuadradado del primer numero
        if (numero == 1) return false;
        for (int i = 2; i*i <= numero; i++){
            //if divisible
            if (numero % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        while (i-->0){
            if(esPrimo(sc.nextInt())){
                System.out.println("Prime");
            }else {
                System.out.println("Not Prime");
            }
        }
    }
}
