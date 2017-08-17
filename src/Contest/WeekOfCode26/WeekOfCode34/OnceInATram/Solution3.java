package Contest.WeekOfCode26.WeekOfCode34.OnceInATram;

/**
 * Created by rgimenez on 17/07/2017.
 * sumar numeros, valores dentro de numeros
 * operaciones con modulo
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution3 {

    static String onceInATram(int x) {
        // Complete this function
        String s = x+"";
        if(x<10000){
            s = "00"+s;
        }
        int cantidad = 0;
        int ticket=0;
        for (int i=0; i<3;i++){
            cantidad += Character.getNumericValue(s.charAt(i));
        }
        for (int i=0; i<3;i++){
            ticket += Character.getNumericValue(s.charAt(i+3));
        }
        int unidad = Character.getNumericValue(s.charAt(5));
        int decena = Character.getNumericValue(s.charAt(4));
        int centena = Character.getNumericValue(s.charAt(3));
        int numero = x/1000;
        do{
            unidad++;
            if(unidad>9){
                unidad=0;
                decena++;
                if(decena>9){
                    decena=0;
                    centena++;
                    if(centena>9){
                        numero++;
                        cantidad=(numero/100)+(numero%10)+(((numero/100)-(numero%10))/10);
                        centena=0;
                        decena=0;
                        unidad=0;
                    }
                }
            }
            ticket=unidad+decena+centena;
        }while (cantidad!=ticket);
        String s1=numero+""+(unidad+(decena*10)+(centena*100))+"";
        return numero+""+centena+""+decena+""+unidad;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        String result = onceInATram(x);
        System.out.println(result);
    }
}