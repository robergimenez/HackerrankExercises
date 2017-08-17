package Statistics.day0.MeanMedianModal.BinomialDistribution;

import java.util.Scanner;

/**
 * Created by rgimenez on 11/06/2017.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double prob = sc.nextDouble();
        int child = sc.nextInt();
        prob =prob/(prob+1);
        System.out.printf("%.3f", (calcularFactorial(6)/(Math.pow(calcularFactorial(3),2))*Math.pow(prob,3)*Math.pow(1-prob,6-3)));
    }
    public static double calcularFactorial(double d) {
        if (d == 0) {
            return 1;
        } else {
            return d * calcularFactorial(d-1);
        }
    }
}
