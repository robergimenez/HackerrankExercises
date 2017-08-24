package Contest.WeekOfCode26.GSCodeSprint.BankAccounts.TraderProfit;

import java.util.*;

public class Solution {

    static int traderProfit(int k, int n, int[] A) {
        // Complete this function
        int[] mayores = new int[k];
        int[] menores = new int[k];
        int[] resultados = new int[k];
        int[] B = A.clone();
        Arrays.sort(B);
        for (int i=0;i<A.length;i++){
            for (int j=0; j<A.length;j++){
                if (B[0]==0);
            }
        }
        return mayores[0];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int k = in.nextInt();
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int arr_i = 0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            int result = traderProfit(k, n, arr);
            System.out.println(result);
        }
        in.close();
    }
}
