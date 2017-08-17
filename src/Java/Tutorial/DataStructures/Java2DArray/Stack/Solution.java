package Java.Tutorial.DataStructures.Java2DArray.Stack;

/**
 * Created by rgimenez on 08/01/2017.
 */

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.next();
            String mensaje = "true";
            if (input.length() % 2 != 0) {
                mensaje = "false";
            } else {
                ArrayList<Character> abierto = new ArrayList<>();
                // Voy metiendo abiertos hasta que me encuentre un cerrado, que tengo que sacar
                if (input.charAt(0) == '(' || input.charAt(0) == '[' || input.charAt(0) == '{'){
                    abierto.add(input.charAt(0));
                }else{
                    mensaje="false";
                }
                for (int i = 1; i < input.length(); i++) {
                    if ((input.charAt(i) == '{' || input.charAt(i) == '[' || input.charAt(i) == '(') && !abierto.isEmpty()) {
                        abierto.add(input.charAt(i));
                    } else if (!abierto.isEmpty()) {
                        switch (input.charAt(i)) {
                            case '}':
                                if (abierto.get(abierto.size() - 1) != '{') {
                                    mensaje = "false";
                                }else{
                                    abierto.remove(abierto.size()-1);
                                }
                                break;
                            case ']':
                                if (abierto.get(abierto.size() - 1) != '[') {
                                    mensaje = "false";
                                }else{
                                    abierto.remove(abierto.size()-1);
                                }
                                break;
                            case ')':
                                if (abierto.get(abierto.size() - 1) != '(') {
                                    mensaje = "false";
                                }else{
                                    abierto.remove(abierto.size()-1);
                                }
                                break;
                        }
                    }else if (input.charAt(i) == ')' || input.charAt(i) == ']' || input.charAt(i) == '}'){
                        mensaje="false";
                        break;
                    }else{
                        abierto.add(input.charAt(i));
                    }
                }
            }
            System.out.println(mensaje);
        }
        sc.close();
    }
}