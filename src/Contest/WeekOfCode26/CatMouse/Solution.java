package Contest.WeekOfCode26.CatMouse;

/**
 * Created by rgimenez on 03/12/2016.
 */

import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            int catA = z-x;
            int catB = z -y;
            if (catA<0){
                catA=positivar(catA);
            }
            if (catB<0){
                catB=positivar(catB);
            }
            if (catA < catB) {
                System.out.println("Cat A");
            }else if (catA > catB) {
                System.out.println("Cat B");
            }else {
                System.out.println("Mouse C");
            }
        }
    }

    public static int positivar(int i){
        if (i<0){
            i *=(-1);
        }
        return i;
    }
}
