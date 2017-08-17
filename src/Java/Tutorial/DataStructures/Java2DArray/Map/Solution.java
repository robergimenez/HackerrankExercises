package Java.Tutorial.DataStructures.Java2DArray.Map;

/**
 * Created by rgimenez on 08/01/2017.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Solution {
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        HashMap<String, Integer> mapa = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();
            mapa.put(name, phone);
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            if (mapa.containsKey(s)){
                System.out.println(s + "=" + mapa.get(s));
            }else{
                System.out.println("Not found");
            }
        }
    }
}
