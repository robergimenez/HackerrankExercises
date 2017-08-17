package Contest.WeekOfCode26.AdInfinitum18;

/**
 * Created by rgimenez on 09/06/2017.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int lowestTriangle(int base, int area){
        // Complete this function
        float h = (2*(float)area)/(float)base;
        return (int) (Math.ceil(h));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base = in.nextInt();
        int area = in.nextInt();
        int height = lowestTriangle(base, area);
        System.out.println(height);
    }
}