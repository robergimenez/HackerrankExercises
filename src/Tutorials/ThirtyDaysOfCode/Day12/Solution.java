package Tutorials.ThirtyDaysOfCode.Day12;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author rgimenez
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate() );
    }
}

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }

}

class Student extends Person {
    private int[] testScores;

    Student(String firstName, String lastName, int identification, int[] numScores){
 /*       this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;*/
        super(firstName, lastName, identification);
        this.testScores = numScores;
    }

    public String calculate(){
        int score =0;
        String sScore="";
        for (int i =0; i<testScores.length; i++){
            score+= testScores[i];
        }
        score /=testScores.length;
        if (score >= 90){
            sScore="O";
        }else if(score >=80){
            sScore="E";
        }else if(score>=70){
            sScore="A";
        }else if(score>=55){
            sScore="P";
        }else if(score>=40){
            sScore="D";
        }else{
            sScore="T";
        }
        return sScore;
    }

}
