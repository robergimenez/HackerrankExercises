package Tutorials.ThirtyDaysOfCode.Day23BSTLevelOrderTraversal;

/**
 * Created by rgimenez on 10/12/2016.
 */
import java.util.*;

class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
public class Solution {

    static void levelOrder(Node root) {
        Node izda, dcha;
        LinkedList<Node> cola = new LinkedList<>();
        ArrayList<Integer> array = new ArrayList<>();
        if (root != null) {
            cola.add(root);
            array.add(root.data);
        }
        while (!cola.isEmpty()) {
            izda = cola.getFirst().left;
            dcha = cola.getFirst().right;
            cola.removeFirst();
            if (izda != null) {
                array.add(izda.data);
                cola.add(izda);
            }
            if (dcha != null) {
                array.add(dcha.data);
                cola.add(dcha);
            }
        }
        for (int i =0; i<array.size();i++){
            System.out.print(array.get(i) + " ");
        }
    }


    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
}
