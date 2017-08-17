package Java.Tutorial.DataStructures.Java2DArray.Deque;

/**
 * Created by rgimenez on 27/03/2017.
 */
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int maximo=0, cantidad=m;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.addLast(num);
            if (deque.size()==m) {
                //Collections.frequency(deque, 1);
                for (int j = 0; j < m; j++) {
                    int primero = (int) deque.getFirst();
                    deque.removeFirst();
                    for (Iterator itr = deque.iterator(); itr.hasNext(); ) {
                        if ((int) itr.next() == primero) {
                            cantidad--;
                            //Si todos son iguales, rompel el bucle.
                            if (cantidad==1 || cantidad <=maximo){
                                break;
                            }
                        }
                        if (!itr.hasNext()) {
                            if (cantidad > maximo) {
                                maximo = cantidad;
                            }
                            cantidad = m;
                        }
                    }
                }
            }
        }
        System.out.println(maximo);
    }
}