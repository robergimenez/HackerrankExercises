package edx.howtowinCompetitions;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class first {
    public static void main (String[] args) throws IOException{
        try(Scanner sc = new Scanner(new File("input.txt"));
            PrintWriter out = new PrintWriter("output.txt")){
            out.println(BigInteger.valueOf(sc.nextInt()).add(BigInteger.valueOf(sc.nextInt()).pow(2)));
        }

    }
}
