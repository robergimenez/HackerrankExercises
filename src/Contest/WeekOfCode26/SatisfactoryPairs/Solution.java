package Contest.WeekOfCode26.SatisfactoryPairs;

/**
 * Created by rgimenez on 02/12/2016.
 */
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int soluciones = 0;

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                for (int k = 1; k < n; k++) {
                    for (int l = 1; l < n; l++) {
                        if ((i * j) + (k * l) == n) {
                            if(l<j) {
                                soluciones++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(soluciones);
    }
}
