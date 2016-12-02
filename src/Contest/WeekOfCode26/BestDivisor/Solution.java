package Contest.WeekOfCode26.BestDivisor;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by rgimenez on 02/12/2016.
 * 90% resultado
 * mejor divisor. Entroncar los divisores sumar todos los digitos de un numero
 */
public class Solution {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        int mayor=0, resultado=0;
        ArrayList<Integer> array = new ArrayList<>();
        for (int i =1; i<=n; i++){
            if (n%i ==0){
                if (mayor == 9){
                    i=n;
                }else if ((i>mayor) && (i<10)){
                    mayor=i;
                    resultado=i;
                }else if (i >=10){
                    int numero=i;
                    while  (numero>0){
                        i +=numero%10;
                        numero /=10;
                    }
                    if (numero>mayor){
                        mayor=numero;
                        resultado=numero;
                        i=numero;
                    }
                }
            }
        }
        System.out.println(resultado);
    }
}
