package Algorithms.Warmup.Implementation.Encryption;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        double longitud = frase.length();
        double floor = Math.floor(Math.sqrt(longitud));
        int ceil = 0;
        if (Math.pow(floor,2.0)==longitud){
            ceil=(int)floor;
        }else {
            ceil = (int) floor + 1;
        }
        //double resto = (floor*(floor+1))-longitud;
        //double ceil = Math.ceil(Math.sqrt(longitud));
        //char[] array = frase.toCharArray();
        for (int i=0; i<ceil; i++){
            for(int j=i; j<longitud; j+=ceil){
                System.out.print(frase.charAt(j));
            }
            System.out.print(" ");

        }
    }
}
