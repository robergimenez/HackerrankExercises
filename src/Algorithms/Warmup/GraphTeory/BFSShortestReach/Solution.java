package Algorithms.Warmup.GraphTeory.BFSShortestReach;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int m = in.nextInt();
            int distancia=1;
            Grafo g = new Grafo();
            //Anado los nodos al grafo.
            for (int i=0; i<n;i++){
                g.addNodos(new Nodo(i));
            }
            for(int a1 = 0; a1 < m; a1++){
                int u = in.nextInt();
                int v = in.nextInt();
                //Relaciono los nodos y construyo el arbol.
                g.conectarNodos(g.listaNodos.get(u-1), g.listaNodos.get(v-1));
            }
            g.setNodoRaiz(g.listaNodos.get(in.nextInt()-1));
            g.busqueda(g.raiz);
            for (int i=0;i<n;i++){
                if (i == g.raiz.nombre){
                    continue;
                }
                if (g.listaNodos.get(i).distancia<0){
                    System.out.print(g.listaNodos.get(i).distancia + " ");
                }else {
                    System.out.print(g.listaNodos.get(i).distancia * 6 + " ");
                }
            }
            System.out.println();
        }
        in.close();
    }
}

class Nodo{
    int nombre;
    boolean visitado=false;
    int distancia=-1;
    public Nodo(int n){
        this.nombre=n;
    }
}

class Grafo{
    Nodo raiz;
    ArrayList<Nodo> listaNodos = new ArrayList<>();
    int[][] matriz;
    int tamano;

    void setNodoRaiz(Nodo n){
        this.raiz=n;
    }
    Nodo getNodoRaiz(){
        return this.raiz;
    }

    void addNodos(Nodo n){
        this.listaNodos.add(n);
    }
    void conectarNodos(Nodo inicio, Nodo fin){
        if (matriz==null){
            tamano = listaNodos.size();
            matriz = new int[tamano][tamano];
        }
        int indiceInicio =listaNodos.indexOf(inicio);
        int indiceFinal = listaNodos.indexOf(fin);
        matriz[indiceInicio][indiceFinal]=1;
        matriz[indiceFinal][indiceInicio]=1;
    }
    private Nodo getNodoNoVisitado(Nodo n){
        int indice=listaNodos.indexOf(n);
        int j=0;
        while (j<tamano){
            if (matriz[indice][j]==1 && !((Nodo)listaNodos.get(j)).visitado){
                return (Nodo)listaNodos.get(j);
            }
            j++;
        }
        return null;
    }

    void busqueda(Nodo n){
        Queue<Nodo> cola = new LinkedList<>();
        cola.add(this.raiz);
        raiz.visitado=true;
        int distancia=0;
        while (!cola.isEmpty()){
            int i=0;
            Nodo n1 = cola.remove();
            Nodo hijo =null;
            if (i==cola.size()){
                distancia++;
            }
            while ((hijo = getNodoNoVisitado(n1))!=null){
               if  (!hijo.visitado){
                   hijo.distancia=distancia;
               }
               hijo.visitado=true;
               cola.add(hijo);
               i++;
            }
        }
    }
}