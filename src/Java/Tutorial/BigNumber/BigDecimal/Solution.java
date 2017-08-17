package Java.Tutorial.BigNumber.BigDecimal;

import javafx.util.converter.BigDecimalStringConverter;

import java.math.BigDecimal;
import java.util.*;

/**
 * Created by rgimenez on 01/01/2017.
 * Ordenar
 * Comparar
 */
public class Solution {
    public static void main(String []args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();
        //ArrayList<BigDecimal> array = new ArrayList<>();
        Arrays.sort(s, Collections.reverseOrder(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1 == null || o2 == null) return 0;
                BigDecimal b1 = new BigDecimal(o1);
                BigDecimal b2 = new BigDecimal(o2);
                return b1.compareTo(b2);
            }
        }));
        ArrayList<String> temp = new ArrayList<>();
        for (int  i=0; i< s.length; i++){
            if (s[i]!=null){
                temp.add(s[i]);
            }
        }
        s = temp.toArray(new String[temp.size()]);
        for (int i=0; i<s.length; i++){
                System.out.println(s[i]);
        }
    }

}
