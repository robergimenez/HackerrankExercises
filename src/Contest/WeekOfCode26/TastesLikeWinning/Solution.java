package Contest.WeekOfCode26.TastesLikeWinning;

/**
 * Created by rgimenez on 04/12/2016.
 */
import java.util.Scanner;
import java.math.*;
public class Solution {
    public static void  main   (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double m = sc.nextInt();
        m = Math.pow(2.0, m) - 1;
        double mod = Math.pow(10, 9) + 7;
        int contador =1;
        sc.close();
        for (double h=m-n+1; h<=m; h++) {
//            contador *= (int)Math.floor((contador*h)%mod);
            contador*=h;
            contador = (int)Math.floor(contador%mod);
        }
        System.out.println(contador);
    }
}
