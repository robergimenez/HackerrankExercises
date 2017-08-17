package Java.Tutorial.Advanced.SimpleAddition.MD5;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/**
 * Created by rgimenez on 04/02/2017.
 * encription.
 */
public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();
        try{
            byte[] mensaje = cadena.getBytes("UTF-8");
            MessageDigest md = MessageDigest.getInstance("SHA");
            md.reset();
            md.update(mensaje);
            byte[] theDigest = md.digest();
            BigInteger bi = new BigInteger(1,theDigest);
            String hashtext = bi.toString(16);
            while(hashtext.length() < 32 ){
                hashtext = "0"+hashtext;
            }
            System.out.println(hashtext);
        }catch (NoSuchAlgorithmException e){

        }catch (Exception e){

        }
    }
}
