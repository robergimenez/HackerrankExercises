package Algorithms.Warmup.Strings.SuperReducedString.StringConstruction;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution2 {

    static int stringConstruction(String s) {
        // Complete this function
        Pattern p;
        Matcher m;
        int coste=1;
        for (int i=0;i<s.length();i++){
            for (int j=i+2; j<s.length();j++){
                String regex = s.substring(i,j);
                if (s.substring(j,s.length()).contains(regex)){
                    while (s.substring(j, s.length()).contains(regex) && j<s.length()-1){
                        j++;
                        regex = s.substring(i,j);
                    }
                    j--;
                    regex = s.substring(i, j);
                    int index = s.substring(j, s.length()).indexOf(regex);
                    while (index>=0 && j<s.length()-1) {
                        String s2 = s.substring(0, j);
                        String s3 = s.substring(index + regex.length(), s.length());
                        s = s.substring(0, j) + s.substring(j, j + s.substring(j, s.length()).indexOf(regex)) +
                                s.substring(j + index + regex.length(), s.length());
                        index = s.substring(j, s.length()).indexOf(regex);
                    }
                    i=0;
                    break;
                }else {
                    break;
                }
            }
        }
        return coste*s.length();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = stringConstruction(s);
            System.out.println(result);
        }
        in.close();
    }
}
