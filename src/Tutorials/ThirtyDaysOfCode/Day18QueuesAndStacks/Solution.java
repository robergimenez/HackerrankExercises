package Tutorials.ThirtyDaysOfCode.Day18QueuesAndStacks;

/**
 * Created by rgimenez on 04/12/2016.
 */
import java.util.*;

public class Solution {

    LinkedList<Character> lista;
    LinkedList<Character> pila;

    Solution(){
        lista = new LinkedList<>();
        pila = new LinkedList<>();
    }
    void pushCharacter(char c){
        lista.add(c);
    }

    void enqueueCharacter(char c){
        pila.add(c);
    }

    char popCharacter(){
        char c = lista.get(0);
        lista.remove(0);
        return c;

    }
    char dequeueCharacter(){
        char c = pila.get(pila.size()-1);
        pila.remove(pila.size()-1);
        return c;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
