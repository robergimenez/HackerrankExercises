package Java.Tutorial.Strings.Introduction;

/**
 * Created by rgimenez on 01/01/2017.
 */
import java.util.Scanner;
public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        String respuesta = "No";
        if (A.compareTo(B)>0){
            respuesta = "Yes";
        }
        System.out.println(respuesta);
        char c = A.charAt(0);
        A = Character.toString(A.charAt(0)).toUpperCase() + A.substring(1);
        B = Character.toString(B.charAt(0)).toUpperCase() + B.substring(1);
        System.out.println(A + " " + B);
    }
}
