package com.esteban.exercise_1;

public class Exercise_1 {
    
    public static void main(String[] args) {
        Box box_1 = new Box(); //default
        Box box_2 = new Box(2, 3, 4); //insert data
        Box box_3 = new Box(box_2); //copy object
        
        //changes in box 3
        box_3.setWidth(6);
        
        //impress status of 3 box
        System.out.println("state of box 1: " + box_1.status());
        System.out.println("state of box 2: " + box_2.status());
        System.out.println("state of box 3: " + box_3.status());

        //impress bulk of 3 box
        System.out.println("bulk of box 1: " + box_1.bulk());
        System.out.println("bulk of box 2: " + box_2.bulk());
        System.out.println("bulk of box 3: " + box_3.bulk());

    }
}
