package TheArtOfProgramming.Vol1.Cap1;

/* Algoritmo de Eucildes para calcular el maximo comun divisor o gmd.
El algoritmo dice que para calcular el mayor divisor comun, de dos numeros enteros,
se dividen ambos numeros y mientras el resto sea distinto de cero, seguimos dividiendo hasta encontrar el gmd
Para ello, empleamos recursion para dividir hasta cero y remplazamos los valores.
 */
public class Dos {
    public static void main(String[] args) {
        int m = 544, n = 119;
        //int m = 2166, n = 6099;
        //Es necesario tratar de que el numero mayor sea el dividendo.
        if (m<n){
            int temp = m;
            m=n;
            n=temp;
        }
        System.out.println(gmd(m,n));
    }
    static int gmd(int m, int n){
        if (m % n > 0) {
            return gmd(n,m%n);
        }else
            return n;
    }

}
