package Java.Tutorial.DataStructures.Java2DArray.JavaPriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by rgimenez on 30/05/2017.
 * Ordenar
 */
class Student{
    private int token;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.token = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getToken() {
        return token;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

class Comparador implements Comparator<Student>
{

    @Override
    public int compare(Student a, Student b){

        if (a.getCgpa() < b.getCgpa()){
            return 1;
        }else if (a.getCgpa() > b.getCgpa()){
            return -1;
        }else {
            if (a.getFname().compareTo(b.getFname()) != 0) {
                return a.getFname().compareTo(b.getFname());
            } else {
                return a.getToken() - b.getToken();
            }
        }

    }
}

public class Solution {

    public static void main(String[] args) {
        String nombre ="";
        double CGPA;
        int token;
        Scanner in = new Scanner(System.in);
        int totalEvents = Integer.parseInt(in.nextLine());
        Comparador comparar = new Comparador();
        PriorityQueue<Student> listaEstudiantes = new PriorityQueue<>(totalEvents, comparar);
        while(totalEvents>0){
            String event = in.next();
            if (event.equals("ENTER")){
                nombre = in.next();
                CGPA = in.nextDouble();
                token = in.nextInt();
                Student s = new Student(token, nombre, CGPA);
                listaEstudiantes.add(s);
            }else{
                listaEstudiantes.poll();
            }

            //Complete your code


            totalEvents--;
        }
        /*
        for (Student e :listaEstudiantes) {
            System.out.println(e.getFname());
        }
        */
        if (listaEstudiantes.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            while (!listaEstudiantes.isEmpty()) {
                System.out.println(listaEstudiantes.poll().getFname());
            }
        }
    }
}