package Java.Tutorial.Anagrams;

/**
 * Created by rgimenez on 29/12/2016.
 */
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class Solution {

    static TreeMap getTreemap(String a){
        TreeMap<String, Integer> mapa = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        for (int i = 0;i<a.length(); i++){
            Integer valor = mapa.get(a.charAt(i)+"");
            if (valor != null){
                mapa.put(a.charAt(i)+"", valor+1);
            }else{
                mapa.put(a.charAt(i)+"", 1);
            }
        }
        return mapa;

    }

    static boolean isAnagram(String a, String b) {



            char[] array1 = a.toCharArray();
            char[] array2 = b.toCharArray();

            Arrays.sort(array1);
            Arrays.sort(array2);
            return new String(array1).equals(new String(array2));
        }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
