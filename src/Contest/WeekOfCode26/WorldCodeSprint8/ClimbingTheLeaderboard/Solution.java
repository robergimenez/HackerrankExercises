package Contest.WeekOfCode26.WorldCodeSprint8.ClimbingTheLeaderboard;

/**
 * Created by rgimenez on 17/12/2016.
 * Ordenar
 */
import java.util.*;

public class Solution {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int[] scores = new int[n];
            for(int scores_i=0; scores_i < n; scores_i++){
                scores[scores_i] = in.nextInt();
            }
            int m = in.nextInt();
            int[] alice = new int[m];
            for(int alice_i=0; alice_i < m; alice_i++){
                alice[alice_i] = in.nextInt();
            }
            // your code goes here
            //Eliminar duplicados
            int score = scores[0];
            ArrayList<Integer> array = new ArrayList<>();
            array.add(score);
            for (int i=1; i<n; i++) {
                if (score != scores[i]) {
                    array.add(scores[i]);
                    score = scores[i];
                }
            }
            int contador;
            int[] resultados = new int[alice.length];
            resultados[0] = 0;
            for (int i =1; i<=m; i++){
                contador =0;
                for (int j=resultados[i-1]; j<array.size(); j++){
                    if (alice[i-1]<array.get(j)){
                        contador++;
                    }
                }
                resultados[i-1]=contador;
            }
            for(int i=0; i<resultados.length; i++){
                System.out.println(resultados[i]+1);
            }
        }
    }