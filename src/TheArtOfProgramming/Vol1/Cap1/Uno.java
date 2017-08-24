package TheArtOfProgramming.Vol1.Cap1;

public class Uno {
    public static void main(String[] args){
        int a=0, b=1, c=2, d=3;
        int temp;
        temp = d;
        d=a;
        a=b;
        b=c;
        c=temp;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}
