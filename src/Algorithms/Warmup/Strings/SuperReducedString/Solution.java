package Algorithms.Warmup.Strings.SuperReducedString;

import java.util.*;

public class Solution {
        static String super_reduced_string(String s) {
            // Complete this function
            LinkedList<Character> lista = new LinkedList<>();
            for (int i=0; i<s.length(); i++){
                if (lista.contains(s.charAt(i))){
                    if (lista.get(lista.size()-1)==s.charAt(i)){
                        lista.remove(lista.size()-1);
                    }else {
                        lista.add(s.charAt(i));
                    }
                }else {
                    lista.add(s.charAt(i));
                }
            }
            if (lista.size()==0){
                return "Empty String";
            }else {
                StringBuilder respuesta = new StringBuilder();
                lista.forEach(character -> respuesta.append(character));
                return respuesta.toString();
            }
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String s = in.next();
            String result = super_reduced_string(s);
            System.out.println(result);
        }
    }
