package Java.Tutorial.DataStructures.Java2DArray.Java1DArray;

import java.util.Scanner;

/**
 * Created by rgimenez on 07/01/2017.
 */
public class Solution {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String mensaje = "YES";
            int cantidad = sc.nextInt();
            int salto = sc.nextInt();
            int[] array = new int[cantidad];
            for (int j = 0; j < cantidad; j++) {
                array[j] = sc.nextInt();
            }
            if (salto < array.length) {
                if (array[0] == 1 && array[salto] == 1) {
                    mensaje = "NO";
                }else {
                    for (int j = 1; j < cantidad; j++) {
                        if (array[j] ==1 && j+salto <=cantidad) {
                            if (array[j-1] == 0 && array[j-1+salto]==0) {
                                if (j-1+salto == cantidad-1){
                                    j=cantidad;
                                    continue;
                                }
                                j = j+salto-1;
                                continue;
                            }else{
                                mensaje = "NO";
                                break;
                            }
                        }else {
                            if (array[j]==0 || (array[j-1] ==0 && j+salto>cantidad)){
                                if (array[j]==0) {
                                    continue;
                                }else{
                                    j = cantidad;
                                    continue;
                                }
                            }
                            mensaje = "NO";
                            break;
                        }
                    }
                }
            }
            System.out.println(mensaje);
        }
        sc.close();
    }
}