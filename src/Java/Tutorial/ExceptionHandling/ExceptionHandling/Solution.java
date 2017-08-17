package Java.Tutorial.ExceptionHandling.ExceptionHandling;

/**
 * Created by rgimenez on 22/01/2017.
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x=0, y=0;
        try{
            x = sc.nextInt();
            y = sc.nextInt();
            System.out.println(x/y);
        }catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        }catch (ArithmeticException e){
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
    }
}
