package Java.Tutorial.BigNumber.PrimalityTest;

/**
 * Created by rgimenez on 01/01/2017.
 */
import java.util.Scanner;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        in.close();
        String respuesta = "not prime";
        // Write your code here.
        if (n.isProbablePrime(1)){
            respuesta = "prime";
        }
        System.out.println(respuesta);
    }
}
