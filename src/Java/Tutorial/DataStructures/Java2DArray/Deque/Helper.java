package Java.Tutorial.DataStructures.Java2DArray.Deque;

import sun.reflect.generics.tree.Tree;

import java.util.*;

/**
 * Created by rgimenez on 28/03/2017.
 */
public class Helper {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        int i = sc.nextInt();
        for (int j=0; j<=i;j++){
            lista.add(sc.nextInt());
        }
        sc.close();
        //System.out.println(lista.get(lista.size()-1));
        //System.out.println(lista.size());

        i=0;
        for (int key:lista){
            //System.out.println(i + " " +key + " : " + Collections.frequency(lista,key));
            if (Collections.frequency(lista, key)==1)
                //System.out.println(i + " " +key + " : " + Collections.frequency(lista,key));
                i++;
            //i++;
        }
        System.out.println(i);

    }
}
