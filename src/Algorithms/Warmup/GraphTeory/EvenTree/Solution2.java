package Algorithms.Warmup.GraphTeory.EvenTree;

import java.util.ArrayList;
import java.util.Scanner;

class Nodo{
    int nombre;
    ArrayList<Nodo> hijos = new ArrayList<>();
    public Nodo(int n){
        this.nombre=n;
    }
}

public class Solution2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nodos = sc.nextInt();
        int vertices = sc.nextInt();
        int totales=0;
        ArrayList<Nodo> arraynodos = new ArrayList<>();
        for (int i=0; i<nodos;i++){
            Nodo n = new Nodo(i);
            arraynodos.add(n);
        }
        for (int i=0; i<vertices;i++){
            int hijo=sc.nextInt();
            int padre = sc.nextInt();
            arraynodos.get(padre-1).hijos.add(arraynodos.get(hijo-1));
        }
        for (int i=1; i<arraynodos.size();i++){
            totales+=revisarNodos(arraynodos.get(i), arraynodos);
        }
        System.out.println(totales);
    }
    static int revisarNodos(Nodo n, ArrayList<Nodo>arrayN){
        if (n.hijos.size()%2==1){
            //arrayN.remove(n.nombre);
            return 1;
        }
        return 0;
    }
}
