package com.esteban.exercise_2;

public class Exercise_2 {
    
    public static void main(String[] args) {
        //created estudents objects
        Student studen_1 = new Student();
        Student studen_2 = new Student(0.5, 2.4, 5.0, "david", 18);
        Student studen_3 = new Student(studen_2);

        //change estuden_3
        studen_3.setYear(20);
        studen_3.setName("jesus");

        //impress status of 3 students
        System.out.println("this is the state of studen 1: " + studen_1.status());
        System.out.println("this is the state of studen 2: " + studen_2.status());
        System.out.println("this is the state of studen 3: " + studen_3.status());

        //impress calification of 3 students
        System.out.println("this is the qualification of studen 1: " + studen_1.finalNote());
        System.out.println("this is the qualification of studen 2: " + studen_2.finalNote());
        System.out.println("this is the qualification of studen 3: " + studen_3.finalNote());
    }
}
