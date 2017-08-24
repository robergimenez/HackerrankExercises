package Contest.WeekOfCode26.GSCodeSprint.BankAccounts.BuyMaximumStocks;

import java.util.*;

public class Solution {

    static long buyMaximumProducts(int n, long k, int[] a) {
        // Complete this function
        int[] b = a.clone();
        Arrays.sort(b);
        long totales = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[j] == b[i]) {
                    if (b[i] * (j+1) <= k) {
                        totales += (j+1);
                        j = 0;
                        k -=b[i] * (j+1);
                        break;
                    } else {
                        totales += k / b[i];
                        i=b.length;
                        j=a.length;
                    }
                }
            }
        }
        return totales;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        long k = in.nextLong();
        long result = buyMaximumProducts(n, k, arr);
        System.out.println(result);
        in.close();
    }
}