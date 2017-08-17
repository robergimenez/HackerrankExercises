package Java.Tutorial.Strings.Tokens;

/**
 * Created by rgimenez on 29/12/2016.
 * Regex
 */
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        s= s.trim();
        if (!s.equals("")){
            String [] cadenas = s.split("[,!@#$%&'-:_? ]+");
            System.out.println(cadenas.length);
            for(int i = 0; i<cadenas.length; i++) {
                System.out.println(cadenas[i]);
            }
        }else
            System.out.println("0");
    }
}

