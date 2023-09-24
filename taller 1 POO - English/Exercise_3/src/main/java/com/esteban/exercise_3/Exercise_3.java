package com.esteban.exercise_3;

public class Exercise_3 {

    public static void main(String[] args) {
        Person person_1 = new Person();//Default
        Person person_2 = new Person("Esteban", "Restrepo", true, "male"); //insert params
        Person person_3 = new Person(person_2); //copy object

        //change object 3
        person_3.setName("ariana");
        person_3.setLastName("Andrade");
        person_3.setIdentification(false);
        person_3.setTypeSex("famale");
        
        //status
        System.out.println("Status person 1 "+ person_1.Status());
        System.out.println("Status person 2 "+ person_2.Status());
        System.out.println("Status person 3 "+ person_3.Status());
        
        //adult
        System.out.println("adult person 1 "+ person_1.Adult());
        System.out.println("adult person 2 "+ person_2.Adult());
        System.out.println("adult person 3 "+ person_3.Adult());
    }
}
