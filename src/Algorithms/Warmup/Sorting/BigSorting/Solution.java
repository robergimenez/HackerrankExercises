package Algorithms.Warmup.Sorting.BigSorting;

    import java.math.BigInteger;
    import java.util.*;

    public class Solution {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            ArrayList<BigInteger> array = new ArrayList<>();
            for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
                array.add(new BigInteger(in.next()));
            }
            // your code goes here
            Collections.sort(array);
            for (int i=0; i<array.size();i++){
                System.out.println(array.get(i));
            }
        }
    }
