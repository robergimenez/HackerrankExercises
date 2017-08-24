package Algorithms.Warmup.Strings.SuperReducedString.TwoCharacters;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();
        HashMap<Character, Integer> mapa = new HashMap<>();
        for (int i=0; i<s.length()-1;i++){
            if (mapa.containsKey(s.charAt(i))){
                mapa.put(s.charAt(i), mapa.get(s.charAt(i))+1);
            }else {
                mapa.put(s.charAt(i),1);
            }
        }
        char primero, segundo;
        Set<Character> c = mapa.keySet();
        Iterator<Character> it = c.iterator();
        while (it.hasNext()){
            primero = it.next();
            segundo = it.next();
            char comprobar=' ';
            for (int i=0; i<s.length();i++){
                if (s.charAt(i) == primero || s.charAt(i+1)==segundo){
                    if (comprobar == ' '){

                    }
                }
            }
        }
    }
}
