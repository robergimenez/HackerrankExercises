package Contest.WeekOfCode26.GamingArray;

/**
 * Created by rgimenez on 03/12/2016.
 */
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<Integer> array0 = new ArrayList<>();
        for(int a0 = 0; a0 < g; a0++){
            int n = in.nextInt();
            for (int b0 =0; b0<n; b0++) {
                array.add(in.nextInt());
            }
            int posicion=0;
            int mayor=0;
            while (array.size()>0) {
                for (int i=0; i< array.size(); i++){
                    array0.add(array.get(i));
                }
                Collections.sort(array);
                mayor = array.get(array.size() - 1);
                array.clear();
                for (int i = 0; i < array0.size() - 1; i++) {
                    if (array0.get(i) < mayor) {
                        array.add(array0.get(i));
                    }else {
                        i=array.size();
                        posicion++;
                        array0.clear();
                    }
                }
            }
            if (posicion%2==0) {
                System.out.println("ANDY");
            }else {
                System.out.println("BOB");
            }
            posicion=0;
        }
    }
}
