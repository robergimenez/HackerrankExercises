package edx.howtowinCompetitions;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        double d= 10.0/-0;
        if (d==Double.POSITIVE_INFINITY){
            System.out.println("A");
        }
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), n = sc.nextInt();
        if (n <=3 &&n>=0) {
            System.out.println(n);
        } else if (n <0) {
            System.out.println(-1);
        }else {
            System.out.println((fibo(b, c, n - 4)));
        }
    }

    public static int fibo(int b, int c, int n) {
        int fibo =b+c;
        if (n>0){
            fibo = fibo(c,b+c, --n);
        }
        return fibo;
    }
}
