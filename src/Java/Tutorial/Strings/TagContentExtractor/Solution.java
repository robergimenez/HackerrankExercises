package Java.Tutorial.Strings.TagContentExtractor;

/**
 * Created by rgimenez on 04/02/2017.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();

            //Write your code here
            try{
                Pattern patron = Pattern.compile("<(.+)>([^<>]+)</\\1>");
                Matcher matcher = patron.matcher(line);
                boolean encontrado = false;
                while (matcher.find()){
                    System.out.println(matcher.group(2));
                    encontrado = true;
                }
                if (!encontrado) {
                    System.out.println("None");
                }
            }catch (Exception e){
                System.out.println("Error");
            }


            testCases--;
        }
    }
}
