package Algorithms.Warmup.Merger;

public class Solution {
    static String mergerStrings(String a, String b){
        String result="";
        if (a.length()>b.length()){
            for (int i=0,j=0; i<a.length();j++){
                if (i >=b.length()) {
                    result += a.substring(i, a.length());
                    i = a.length();
                }else {
                    if (j % 2 == 0) {
                        result += a.charAt(i);
                    } else {
                        result += b.charAt(i);
                        i++;
                    }
                }

            }
        }else {
            for (int i=0,j=0; i<b.length();j++){
                if (i >=a.length()) {
                    result += b.substring(i - 1, b.length() - 1);
                    i = b.length();
                }else {
                    if (j % 2 == 0) {
                        result += a.charAt(i);
                        i++;
                    } else {
                        result += b.charAt(i-1);
                    }
                }
                int k=j; // Revisar esta parte del código.
                do{
                   k++;
                }while(k<0);


            }
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println(mergerStrings( "zczs","ab"));

    }
}
