package Algorithms.Warmup.Implementation.TheTimeInWords;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        String[] numeros = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
                "ten", "eleven", "twelve", "thirteen", "fourteen", "quarter", "sixteen", "seventeen",
                "eighteen", "nineteen", "twenty", "twenty one", "twenty two", "twenty three",
                "twenty four", "twenty five", "twenty six", "twenty seven", "twenty eight",
                "twenty nine", "half"};
        Scanner sc = new Scanner(System.in);
        int hora = sc.nextInt();
        int minutos = sc.nextInt();
        String prefijo ="";
        String sufijo ="minutes ";
        if (minutos>30){
            if (hora==12){
                hora=1;
            }else {
                hora += 1;
            }
            prefijo = "to";
            minutos=60-minutos;
        }else {
            prefijo = "past";
        }
        if (minutos==0){
                System.out.println(numeros[hora-1] + " o' clock");

        }else {
            if (minutos == 15 || minutos == 30) {
                sufijo = "";
            }
            System.out.println(numeros[minutos - 1] + " " + sufijo + prefijo + " " + numeros[hora - 1]);
        }
        }
    }
