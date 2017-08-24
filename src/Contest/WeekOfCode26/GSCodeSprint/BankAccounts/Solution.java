package Contest.WeekOfCode26.GSCodeSprint.BankAccounts;

import java.util.*;

public class Solution {

    static String feeOrUpfront(int n, int k, int x, int d, int total) {
        // Complete this function
        if (total*0.1 <=d){
            return "fee";
        }else {
            return "upfront";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int x = in.nextInt();
            int d = in.nextInt();
            int[] p = new int[n];
            int total=0;
            for(int p_i = 0; p_i < n; p_i++){
                p[p_i] = in.nextInt();
                if (p[p_i]*0.1 < k) p[p_i]=k*10;
                total+=p[p_i];
            }
            String result = feeOrUpfront(n, k, x, d, total);
            System.out.println(result);
        }
        in.close();
    }
}
