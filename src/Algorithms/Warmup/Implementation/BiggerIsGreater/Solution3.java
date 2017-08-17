package Algorithms.Warmup.Implementation.BiggerIsGreater;

import java.util.Scanner;
/* Permutacion lexicografica*/

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < cases; i++) {
            String frase = sc.nextLine();
            char[] c = frase.toCharArray();
            frase="no answer";
            if (c.length <= 1) {
                System.out.println(frase);
            } else {
                for (int j = c.length - 1; j > 0; j--) {
                    //Buscamos el numero mas pequeno para permutar
                    if ((c[j - 1] < c[j]) || (j - 1 == 0)) {
                        for (int k = c.length - 1; k >= 0; k--) {
                            //Una vez encontrado, ahora buscamos el mas pequeno para permutar y mayor
                            if (c[k] > c[j - 1]) {
                                char temp = c[k];
                                c[k] = c[j - 1];
                                c[j-1] = temp;
                                //Ahora hacemos completamos la permuta hasta la mitad, si es necesario.
                                /*if (k==c.length-1){
                                    frase = String.valueOf(c);
                                    j=0;
                                    break;

                                }else {
                                */
                                    //Calculo las permutas que debo hacer
                                    int permutas = (c.length-j)/2;
                                    for (int l = 0; l < permutas; l++) {
                                        temp = c[(c.length - 1 - l)];
                                        c[(c.length - 1 - l)] = c[j+l];
                                        c[j+l] = temp;
                                    }
                                    frase= String.valueOf(c);
                                    k=-1;
                                    j=0;
                                /*}*/
                            }
                        }
                    }
                }
                System.out.println(frase);
            }
        }
        sc.close();
    }
}
