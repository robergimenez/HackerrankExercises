package Java.Tutorial.DataStructures.Java2DArray.Deque;

import java.util.*;

/**
 * Created by rgimenez on 02/04/2017.
 */
public class Solution2 {
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
                    int noRepes=0, repes=0;
                    ArrayList <Integer> repetidos = new ArrayList<>();
                    Iterator<Integer> itr = deque.iterator();
                    int key=0;
                    while (itr.hasNext()){
                        //System.out.println(itr.next());
                        key = itr.next();
                        if (Collections.frequency(deque, key)==1){
                            noRepes++;
                        }else{
                            if (!repetidos.contains(key)){
                                repes++;
                                repetidos.add(key);
                            }
                        }
                    }
                    if (noRepes+repes>maximo){
                        maximo=noRepes+repes;
                    }
                        deque.removeFirst();
                        break;
                }
            }
        }
        System.out.println(maximo);
    }
}
