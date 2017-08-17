package Java.Tutorial.EndOfFile;

/**
 * Created by rgimenez on 20/12/2016.
 */
import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        int i =1;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            System.out.println(i + sc.nextLine());
            i++;
        }
    }
}
