package Contest.WeekOfCode26.Twins;

/**
 * Created by rgimenez on 30/11/2016.
 */
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int primo = 0;
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = n; i < m + 1; i = i + 2) {
            primo = esPrimo(i);
            if (primo != 0) {
                array.add(primo);
            }
        }
        int resultado=0, primo1=0, primo2=0;
        for (int i=array.size()-1; i>0;i--){
            if (array.get(i) - array.get(i-1) == 2){
                resultado++;
            }
        }
        System.out.println(resultado);

    }

    public static int esPrimo(int numero) {
        int contador = 2;
        if ((numero % 2 == 0) &&(numero != 2)) {
            return 0;
        }
        while (contador != numero) {
            if (numero % contador == 0) {
                return 0;
            }
            contador++;
        }
        return numero;
        }
    }