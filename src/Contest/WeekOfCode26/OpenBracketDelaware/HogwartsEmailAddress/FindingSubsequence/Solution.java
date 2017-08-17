package Contest.WeekOfCode26.OpenBracketDelaware.HogwartsEmailAddress.FindingSubsequence;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/* Ejercicio para reemplazar letras en palabras.
Orden lexicografico.
 */

public class Solution {

    static String solve(String s, int k) {
        // Complete this function
        //Find the largest that it's repeated k times.
        char[] c = s.toCharArray();
        TreeMap<Character, Integer> mapa = new TreeMap<>(Collections.reverseOrder());
        //Organizo el mapa para saber si contiene los valores y los ordeno.
        for (int i =0; i<c.length; i++){
            if (mapa.containsKey(c[i])){
                mapa.replace(c[i], mapa.get(c[i])+1);
            }else {
                mapa.put(c[i],1);
            }
        }
        char mayor = ' ';
        Iterator it = mapa.keySet().iterator();
        while (it.hasNext()){
            char caracter = (char)it.next();
            if (mapa.get(caracter)>=k){
                mayor=caracter;
                break;
            }
        }
        StringBuilder respuesta = new StringBuilder();
        for(int i=0; i<c.length;i++){
            if (c[i] == mayor){
                mapa.clear();
                for (int a_i =i; a_i<c.length; a_i++){
                    if (mapa.containsKey(c[a_i])){
                        mapa.replace(c[a_i], mapa.get(c[a_i])+1);
                    }else {
                        mapa.put(c[a_i],1);
                    }
                }
                respuesta.append(c[i]);
                int posicion=0;
                for (int j=i+1; j<c.length;j++){
                    int test = mapa.get(c[j]);
                    if (mapa.get(c[j])>=k) {
                        if (posicion==0){
                            respuesta.append(c[j]);
                            posicion++;
                        }else {
                            if (respuesta.charAt(posicion)<c[j]){
                                int contador =0;
                                while (respuesta.charAt(posicion)<c[j]){
                                    char retirar = respuesta.charAt(posicion);
                                    mapa.replace(retirar,mapa.get(retirar)-1);
                                    posicion--;
                                    contador++;
                                }
                                respuesta.delete(posicion+1, posicion+1+contador);
                                respuesta.append(c[j]);
                                posicion++;
                                //respuesta.delete(posicion,posicion+1);
                            }else {
                                respuesta.append(c[j]);
                                posicion++;
                            }
                        }
                    }
                }
                i=c.length;
            }
        }

        return respuesta.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int k = in.nextInt();
        String result = solve(s, k);
        System.out.println(result);
        in.close();
    }
}

