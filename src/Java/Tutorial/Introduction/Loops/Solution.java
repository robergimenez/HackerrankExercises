package Java.Tutorial.Introduction.Loops;

/**
 * Created by rgimenez on 19/12/2016.
 */
import java.util.Scanner;

public class Solution {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            double resultado = a;
            for (int j=0; i<n; i++) {
                resultado += Math.pow(2, i) * b;
                System.out.print((int)resultado + " ");
            }
        }
        in.close();

        }
    }