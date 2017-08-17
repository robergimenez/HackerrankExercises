package Algorithms.Warmup.Implementation.BiggerIsGreater;

import java.util.Scanner;

/* Este codigo esta incompleto.
** Tratamos el problema de ordenamiento lexicografico.
** No consiste solo en hayar el mayor, sino el siguiente mayor, por lo tanto se requiere ordenamiento de mayor a menor
*  pero luego de menor a mayor. Pues buscamos el siguiente mas grande, no el mas grande de todos con estos digitos.
*  Esto requiere recursion, complicando el problema.
*  Para resolverlo, solucion2, donde empleamos permutacion
 */

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        boolean sinCambios = true;
        sc.nextLine();
        for (int i=0; i<cases;i++){
            String frase = sc.nextLine();
            StringBuilder fraseInicial = new StringBuilder();
            fraseInicial.append(frase);
            for(int j=fraseInicial.length()-1; j>=0;j--) {
                for (int k = j-1; k >=0; k--) {
                    char c =fraseInicial.charAt(k);
                    char c1 = fraseInicial.charAt(j);
                    int pos = fraseInicial.charAt(k);
                    int pos2 = fraseInicial.charAt(j);
                    if (fraseInicial.charAt(k) < fraseInicial.charAt(j)) {
                        char temp=fraseInicial.charAt(j);
                        fraseInicial.setCharAt(j, fraseInicial.charAt(k));
                        fraseInicial.setCharAt(k, temp);
                        sinCambios=false;
                        break;
                    }
                }
                if(!sinCambios){
                    break;
                }
            }
            if (sinCambios){
                System.out.println("no answer");
            }else {
                System.out.println(fraseInicial);
                sinCambios=true;
            }
        }
    }
}
