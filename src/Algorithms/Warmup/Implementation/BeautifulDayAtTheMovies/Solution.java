package Algorithms.Warmup.Implementation.BeautifulDayAtTheMovies;

import java.util.Scanner;

/**
 * Created by rgimenez on 03/07/2017.
 * Numeros inversos
 */
public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int inicio = sc.nextInt();
        int fin = sc.nextInt();
        int k = sc.nextInt();
        int totales=0;
        for (int i=inicio; i<=fin; i++ ) {
            int reverse = reverse(i);
            if (Math.abs(i-reverse) % k == 0) {
                totales++;
            }
        }
        System.out.println(totales);

    }
    static int reverse(int a){
        int dividendo =a;
        int reverse=0;
        while(dividendo>=10){
            reverse=(reverse*10)+(dividendo%10);
            dividendo = dividendo/10;
        }
        return reverse = (reverse*10)+dividendo;
    }
}
