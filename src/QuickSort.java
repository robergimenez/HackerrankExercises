import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cantidad = sc.nextInt();
        int[] n = new int[cantidad];
        for (int i =0; i<cantidad;i++){
            n[i]=sc.nextInt();
        }
        quicksort(n, cantidad);
        for (int i:n){
            System.out.println(i);
        }

    }
    public static void quicksort(int[] i, int n){
        ord_rapida(i, 0, n-1);
    }
    public static void ord_rapida(int[] i, int izq, int der){
        if (der -izq>1){
            //caso base de la recursion
            { // Elegimos el pivote y lo ponemos en i[der-1]
                int centro = (izq + der)/2;
                if (i[izq]>i[centro])
                    intercambiar (i, izq, centro);
                if (i[izq]>i[der])
                    intercambiar(i, izq, der);
                if (i[centro]>i[der])
                    intercambiar(i, centro, der);
                intercambiar(i, centro, der-1);
                }
            {//Particionamos
                int j=izq, k=der-1;
                int pivote = i[der-1];
                do {
                    do {
                        j++;
                    }while (i[j]<pivote);
                    do {
                        k--;
                    }while (i[k]>pivote);
                    intercambiar(i, j,k);
                }while (k>j);
                // Deshacemos el ultimo intercambio el cual se efectuo sin cumplirse j<k
                intercambiar(i, j,k);
                //Ponemos el pivote en el medio de ambas particiones
                intercambiar(i, j, der-1);
                //Aplicamos la recursi'on en las particiones halladas
                ord_rapida(i, izq, j-1);
                ord_rapida(i, j+1, der);
                }
        }

    }
    public static void  intercambiar(int[] i, int j, int k){
        int tmp = i[j];
        i[j]=i[k];
        i[k]=tmp;
    }
}
