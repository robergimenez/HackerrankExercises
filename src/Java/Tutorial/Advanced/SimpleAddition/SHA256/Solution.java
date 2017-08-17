package Java.Tutorial.Advanced.SimpleAddition.SHA256;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/**
 * Created by rgimenez on 31/05/2017.
 * encription
 */
public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String cadena = in.nextLine();

        try {
            MessageDigest mensaje = MessageDigest.getInstance("SHA-256");
            mensaje.reset();
            mensaje.update(cadena.getBytes(StandardCharsets.UTF_8));
            byte[] theDigest = mensaje.digest();
            for (byte b:theDigest){
                System.out.printf("%02x", b);
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
