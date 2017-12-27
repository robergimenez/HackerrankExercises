package Algorithms.Warmup.GraphTeory.EvenTree;

import java.util.*;

class Node {
    public ArrayList<Node> neighbors = new ArrayList<Node>();
    public int data;
}

public class Solution {

    public static int answer = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();

        // Initialize nodes and add them to hashmap.
        // This makes adding the edges easier as we can look up
        // a node by integer key
        HashMap<Integer,Node> nodeList =new HashMap<Integer,Node>();
        for (int i = 1; i <= n; i++) {
            Node node = new Node();
            node.data = i;
            nodeList.put(i, node);
        }

        // Initialize edges by adding them to roots Nodes neighbor list (really a child list)
        for (int i = 0; i < m; i++) {
            int childNode = input.nextInt();
            int parentNode = input.nextInt();
            // Because this is a tree, lets only create edge pair
            // on smaller node (root nodes).
            nodeList.get(parentNode).neighbors.add(nodeList.get(childNode));
        }
        evenTree(nodeList.get(1));
        System.out.println(answer);
    }

    public static void evenTree(Node root) {
        checkSubtree(root);
    }

    public static void checkSubtree(Node root) {
        // Check all child subtrees of node and calculate weight. Uses a linked list
        // for traversal of each subtree. If the weight is even, we can remove
        // an edge safely.
        for (Iterator<Node> iterator = root.neighbors.iterator(); iterator.hasNext();) {
            Node curr = iterator.next();
            int weight = 0;
            Queue<Node> q = new LinkedList<Node>();
            q.add(curr);
            while (!q.isEmpty()) {
                Node node = q.poll();
                if (node == null) continue;
                weight++;
                for (int j = 0; j < node.neighbors.size(); j++) {
                    q.add(node.neighbors.get(j));
                }
            }
            if (weight % 2 == 0) answer++;
            // Also Check subtrees of children
            checkSubtree(curr);
        }
    }
}
