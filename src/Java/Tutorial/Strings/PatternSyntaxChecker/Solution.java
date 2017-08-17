package Java.Tutorial.Strings.PatternSyntaxChecker;

/**
 * Created by rgimenez on 30/12/2016.
 * Regex
 */
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Solution {
        public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        String mensaje = "";
        while(testCases>0){
            mensaje = "Valid";
            String pattern = in.nextLine();
            //Write your code
            try {
                Pattern patron = Pattern.compile(pattern);
            }catch (PatternSyntaxException e) {
                mensaje = "Invalid";
            }finally {
                System.out.println(mensaje);
        }
        testCases--;
    }
    }
}
