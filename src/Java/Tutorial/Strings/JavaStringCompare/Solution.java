package Java.Tutorial.Strings.JavaStringCompare;

/**
 * Created by rgimenez on 29/12/2016.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int n = sc.nextInt();
        ArrayList<String> array = new ArrayList<>();
        for (int i =0; i<= S.length()-n; i++){
            array.add(S.substring(i, i+n));
        }
        Collections.sort(array);
        System.out.println(array.get(0));
        System.out.println(array.get(array.size()-1));
    }
}
