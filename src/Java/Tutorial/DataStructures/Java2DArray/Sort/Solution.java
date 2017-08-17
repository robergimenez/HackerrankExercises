package Java.Tutorial.DataStructures.Java2DArray.Sort;

/**
 * Created by rgimenez on 14/01/2017.
 * Comparar
 */
import java.util.*;

class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

class Comparador implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getCgpa() - o2.getCgpa() != 0){
            /*double valor = (o2.getCgpa()*10000 - o1.getCgpa()*10000);
            int valor2 = (int)(o2.getCgpa()*10000 - o1.getCgpa()*10000);*/
            return (int)(o2.getCgpa()*10000 - o1.getCgpa()*10000);
        }else if (!o1.getFname().equals(o2.getFname())){
            //int valor = o2.getFname().compareTo(o1.getFname());
            return o1.getFname().compareTo(o2.getFname());
        }else
            return o1.getId() - o2.getId();
    }
}

//Complete the code
public class Solution
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        Comparador checker = new Comparador();
        studentList.sort(checker);
        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}
