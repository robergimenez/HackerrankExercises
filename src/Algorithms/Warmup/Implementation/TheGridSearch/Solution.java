package Algorithms.Warmup.Implementation.TheGridSearch;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int R = in.nextInt();
            int C = in.nextInt();
            String[] G = new String[R];
            for(int G_i=0; G_i < R; G_i++){
                G[G_i] = in.next();
            }
            int r = in.nextInt();
            int c = in.nextInt();
            String[] P = new String[r];
            for(int P_i=0; P_i < r; P_i++) {
                P[P_i] = in.next();
            }
            Pattern patron = Pattern.compile("{1}"+P[0]);
            Matcher match;
            int encontrado = 0;
            for (int j=0;j<R;j++){
                match = patron.matcher(G[j]);
                if (match.find()){
                    for (int k=0; k<C;k++){
                        if (G[j].charAt(k)==P[0].charAt(0)){
                            for (int l=0; l<r;l++){
                                for (int m=0; m<c;m++){
                                    if (G[j+l].charAt(k+m)!=P[l].charAt(m)){
                                        encontrado = 0;
                                        m=c;
                                        l=r;
                                    }else {
                                        encontrado++;
                                        if (encontrado==r*c){
                                            m=c;
                                            l=r;
                                            k=C;
                                            j=R;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            String resultado="";
            if (encontrado==r*c){
                resultado = "YES";
            }else {
                resultado="NO";
            }
            System.out.println(resultado    );
            //in.close();
        }
    }
}
