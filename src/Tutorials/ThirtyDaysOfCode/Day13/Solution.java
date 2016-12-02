package Tutorials.ThirtyDaysOfCode.Day13;

/**
 * Created by rgimenez on 25/11/2016.
 */
import java.util.*;
public class Solution
{

    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();
        String author=sc.nextLine();
        int price=sc.nextInt();
        Book new_novel=new MyBook(title,author,price);
        new_novel.display();

    }
}
abstract class Book
{
    String title;
    String author;
    Book(String t,String a){
        title=t;
        author=a;
    }
    abstract void display();


}

class MyBook extends Book{
    private int price;

    MyBook(String t, String a, int precio){
        super(t, a);
        this.price = precio;
    }

    void display(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}