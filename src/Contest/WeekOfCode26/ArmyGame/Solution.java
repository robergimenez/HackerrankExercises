package Contest.WeekOfCode26.ArmyGame;

/**
 * Created by rgimenez on 29/11/2016.
 * Resuelve el 100% de los casos
 * Encontrar cuadrados perfectos.
 */
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        //Si es un cuadrado perfecto lo divido y es la solución
        int resultado = 0;
        n = (n % 2) + (n / 2);
        m = (m % 2) + (m / 2);
        resultado = n * m;
        System.out.println(resultado);
    }
}