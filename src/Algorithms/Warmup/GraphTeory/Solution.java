package Algorithms.Warmup.GraphTeory;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nodos = sc.nextInt();
        int vertices = sc.nextInt();
    }
}

class Nodo{
    int nombre;
    boolean visitado = false;

    public Nodo(int name){
        this.nombre = name;
    }

}

class Grafo{
    Nodo raiz;
    int[][] matriz;
    ArrayList<Nodo> nodos = new ArrayList();
    int tamano;

    public void setRootNode(Nodo n){
        this.raiz = n;
    }
    public Nodo getRootNode(){
        return this.raiz;
    }
    public void addNodo(Nodo n){
        nodos.add(n);
    }
    // Metodo para conectar dos nodos
    public void conectarNodos(Nodo inicio, Nodo fin){
        if (matriz==null){
            tamano = nodos.size();
            matriz = new int[tamano][tamano];
        }
        int indiceInicial = nodos.indexOf(inicio);
        int indiceFinal = nodos.indexOf(fin);
        matriz[indiceInicial][indiceFinal]=1;
        matriz[indiceFinal][indiceInicial]=1;
    }
    // Devolver nodo no visitado
    private Nodo getNodoNoVisitado(Nodo n){
        int indice = nodos.indexOf(n);
        int i=0;
        while (i<tamano){
            if (matriz[indice][i]==1 && ((Nodo)nodos.get(i)).visitado==false){
                return (Nodo)nodos.get(i);
            }
            i++;
        }
        return null;
    }
    //Busqueda en anchura
    void bea(){
        Queue<Nodo> q = new LinkedList<>();
        q.add(this.raiz);
        raiz.visitado=true;
        while (!q.isEmpty()){

        }
    }

}
