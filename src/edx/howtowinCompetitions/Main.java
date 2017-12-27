package edx.howtowinCompetitions;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

//Sucesion de Fibonacci
public class Main {
    public static void main(String[] args) throws IOException {
        try (Scanner sc = new Scanner(new File("input.txt"));
             PrintWriter out = new PrintWriter("output.txt")) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), n = sc.nextInt();
            if (n <=3 &&n>=0) {
                out.println(n);
            } else if (n <0 ||b<0 ||c<0) {
                out.println(-1);
            }else {
                out.println((fibo(b, c, n - 4)));
            }
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
