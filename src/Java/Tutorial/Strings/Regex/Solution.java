package Java.Tutorial.Strings.Regex;

/**
 * Created by rgimenez on 30/12/2016.
 */
import java.util.Scanner;

class Solution{

        public static void main(String []args){
            Scanner in = new Scanner(System.in);
            while(in.hasNext()){
                String IP = in.next();
                System.out.println(IP.matches(new MyRegex().pattern));
            }

        }
    }

class MyRegex{
    String pattern = "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
            "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
            "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
            "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
    //Pattern p = Pattern.compile(pattern);
}