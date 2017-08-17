package Java.Tutorial.Advanced.SimpleAddition.JavaVisitorPattern;

import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.ArrayList;
import java.util.Scanner;

enum Color {
    RED, GREEN
}

abstract class Tree {

    private int value;
    private Color color;
    private int depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }

    public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {

    private ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);

        for (Tree child : children) {
            child.accept(visitor);
        }
    }

    public void addChild(Tree child) {
        children.add(child);
    }
}

class TreeLeaf extends Tree {

    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

abstract class TreeVis
{
    public abstract int getResult();
    public abstract void visitNode(TreeNode node);
    public abstract void visitLeaf(TreeLeaf leaf);

}
class SumInLeavesVisitor extends TreeVis {
    private int resultado=0;
    public int getResult() {
        //implement this
        //resultado+=resultado;
        return resultado;
    }

    public void visitNode(TreeNode node) {
        //resultado+= node.getValue();
    }

    public void visitLeaf(TreeLeaf leaf) {
        //implement this
        resultado+=leaf.getValue();
    }
}

class ProductOfRedNodesVisitor extends TreeVis {
    private long resultado =1;
    private final int M = 1000000007;

    public int getResult() {
        //implement this
        return (int) resultado;
    }

    public void visitNode(TreeNode node) {
        //implement this
        if (node.getColor().equals(Color.RED)) {
            resultado = (resultado* node.getValue())%M;
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        //implement this
        if (leaf.getColor().equals(Color.RED)) {
            resultado = (resultado*leaf.getValue())%M;
        }
    }
}

class FancyVisitor extends TreeVis {
    private int nodos=0;
    private int hojasVerdes=0;

    public int getResult() {
        //implement this

        return Math.abs(nodos-hojasVerdes);
    }

    public void visitNode(TreeNode node) {
        //implement this
        if (node.getDepth()%2 ==0){
            nodos+=node.getValue();
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        //implement this
        /*
        if (leaf.getDepth()==0 && leaf.getDepth()%2 !=0){
            resultado+=leaf.getValue();
        }else*/
        if(leaf.getColor().equals(Color.GREEN)){
            hojasVerdes+=leaf.getValue();
        }
    }
}

public class Solution {
    private static Map<Integer, Set<Integer>> mapa = new HashMap<>();
    private static int[] valores;
    private static Color[] colores;

    public static Tree solve() {
        //read the tree from STDIN and return its root as a return value of this function
        Scanner scan =new Scanner(System.in);
        int n = scan.nextInt();
        valores = new int[n];
        for (int i=0; i<n;i++){
            valores[i]= scan.nextInt();
        }
        colores = new Color[n];
        for (int i=0; i<n; i++){
            colores[i]= (scan.nextInt()==0?Color.RED:Color.GREEN);
        }
        Tree nodo;
        if (n==1){
            nodo = new TreeLeaf(valores[0],colores[0], 0);
        }else{
            for (int i =0; i<n-1; i++){
                int u = scan.nextInt();
                int v = scan.nextInt();
                Set<Integer> uEdges = mapa.get(u);
                if(uEdges == null) {
                    uEdges = new HashSet<>();
                }
                uEdges.add(v);
                mapa.put(u, uEdges);
                Set<Integer> vEdges = mapa.get(v);
                if(vEdges == null) {
                    vEdges = new HashSet<>();
                }
                vEdges.add(u);
                mapa.put(v, vEdges);
            }

            nodo = new TreeNode(valores[0], colores[0], 0);
            Set<Integer> rootEdges = mapa.get(1);
            Iterator<Integer> rootIterator = rootEdges.iterator();
            while(rootIterator.hasNext()) {
                Integer nodeIdentifier = rootIterator.next();
                mapa.get(nodeIdentifier).remove(1);
                crearEsquina(nodo, nodeIdentifier);
            }
        }
        return nodo;
    }

    private static void crearEsquina(Tree nodoPadre, Integer nodoId) {

        Set<Integer> nodeEdges = mapa.get(nodoId);
        boolean hasChild = false;
        if(nodeEdges != null && !nodeEdges.isEmpty())
            hasChild = true;

        if(hasChild) {
            TreeNode node = new TreeNode(valores[nodoId - 1], colores[nodoId - 1], nodoPadre.getDepth() + 1);
            ((TreeNode) nodoPadre).addChild(node);
            Iterator<Integer> nodeIterator = nodeEdges.iterator();
            while(nodeIterator.hasNext()) {
                Integer neighborNodeIdentifier = nodeIterator.next();
                mapa.get(neighborNodeIdentifier).remove(nodoId);
                crearEsquina(node, neighborNodeIdentifier);
            }
        }
        else {
            TreeLeaf leaf = new TreeLeaf(valores[nodoId - 1], colores[nodoId - 1], nodoPadre.getDepth() + 1);
            ((TreeNode) nodoPadre).addChild(leaf);
        }
    }

    public static void main(String[] args) {
        Tree root = solve();
        SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
        ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
        FancyVisitor vis3 = new FancyVisitor();

        root.accept(vis1);
        root.accept(vis2);
        root.accept(vis3);

        int res1 = vis1.getResult();
        int res2 = vis2.getResult();
        int res3 = vis3.getResult();

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}
