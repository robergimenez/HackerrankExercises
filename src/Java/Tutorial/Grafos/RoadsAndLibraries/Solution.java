package Java.Tutorial.Grafos.RoadsAndLibraries;
/* matrices de adyacencia gigantes*/

import java.util.*;

class Nodo{
    int nombre;
    boolean visitado = false;

    public Nodo(int nombre){
        this.nombre=nombre;
    }
}

class Grafo{
    Nodo raiz;
    HashMap<Integer, LinkedList<Integer>> mapa = new HashMap<>();
    ArrayList<Nodo>lista = new ArrayList<>();

    public void setNodoRaiz(Nodo n){
        this.raiz = n;
    }
    public Nodo getNodoRaiz(){
        if (this.raiz!=null) {
            return this.raiz;
        }else {
            return null;
        }
    }

    void addNodo(Nodo n){
        lista.add(n);
    }
    void conectarNodos(Nodo n1, Nodo n2){


        int inicio = lista.indexOf(n1);
        int fin = lista.indexOf(n2);
        if (mapa.containsKey(inicio)){
            mapa.get(inicio).add(fin);
        }else {
            LinkedList<Integer> l = new LinkedList<>();
            l.add(fin);
            mapa.put(inicio, l);
        }

    }

    private Nodo getNodoNoVisitado(Nodo n){
        int indice = lista.indexOf(n);
        int i=0;
        if (mapa.containsKey(indice)) {
            while (i < mapa.get(indice).size()) {
            /*
            System.out.println(mapa.containsKey(indice));
            System.out.println(mapa.get(indice).get(i)!=null);
            System.out.println(((Nodo)lista.get(mapa.get(indice).get(i))).visitado==false);
            */
                if (mapa.containsKey(indice) && mapa.get(indice).get(i) != null && ((Nodo) lista.get(mapa.get(indice).get(i))).visitado == false) {
                    return (Nodo) lista.get(mapa.get(indice).get(i));
                }
                i++;
            }
        }
        return null;
    }

    public int dfs(){
        Stack<Nodo> cola = new Stack<>();
        cola.push(this.raiz);
        this.raiz.visitado=true;
        int cantidad=0;
        while (!cola.isEmpty()){
            Nodo n = cola.peek();
            Nodo hijo = getNodoNoVisitado(n);
            if (hijo!=null){
                cantidad++;
                hijo.visitado=true;
                cola.push(hijo);
            }else {
                cola.pop();
            }
        }
        return cantidad;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int nodos = in.nextInt();
            int vertices = in.nextInt();
            long cBiblio = in.nextLong();
            long cCarret = in.nextLong();
            if (cCarret>cBiblio || vertices==0){
                if (cCarret>cBiblio){
                    for (int a1 = 0; a1 < vertices; a1++) {
                        int city_1 = in.nextInt();
                        int city_2 = in.nextInt();
                    }
                }
                System.out.println(cBiblio*nodos);
            }else {
                Grafo g = new Grafo();
                for (int i = 0; i < nodos; i++) {
                    Nodo n = new Nodo(i);
                    g.addNodo(n);
                }
                for (int a1 = 0; a1 < vertices; a1++) {
                    int city_1 = in.nextInt();
                    int city_2 = in.nextInt();
                    g.conectarNodos(g.lista.get(city_1 - 1), g.lista.get(city_2 - 1));
                }
                long total=0;
                for (int i=0; i<g.lista.size();i++){
                    if ((g.lista.get(i)).visitado==false){
                        g.raiz = g.lista.get(i);
                        total += g.dfs()*cCarret + cBiblio;
                    }
                }
                System.out.println(total);
            }
        }
    }
}