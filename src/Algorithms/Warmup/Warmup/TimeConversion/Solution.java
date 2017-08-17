package Algorithms.Warmup.Warmup.TimeConversion;

import java.util.Scanner;

/**
 * Created by rgimenez on 28/11/2016.
 */
public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String hora = sc.nextLine();
        String formato = hora.substring(hora.length()-2);
        if (formato.equals("AM")) {
            if (hora.substring(0,2).equals("12")){
                System.out.println("00" + hora.substring(2, hora.length() - 2));
            }else {
                System.out.println(hora.substring(0, hora.length() - 2));
            }
        }else{
            convertir(hora);
        }
    }

    private static void convertir(String s){
        if (s.substring(0,2).equals("12")) {
            System.out.println(s.substring(0, s.length() - 2));

        }else{
            int hora = Integer.parseInt(s.substring(0, 2)) + 12;
            System.out.println(hora + s.substring(2, s.length() - 2));
        }
    }
}
