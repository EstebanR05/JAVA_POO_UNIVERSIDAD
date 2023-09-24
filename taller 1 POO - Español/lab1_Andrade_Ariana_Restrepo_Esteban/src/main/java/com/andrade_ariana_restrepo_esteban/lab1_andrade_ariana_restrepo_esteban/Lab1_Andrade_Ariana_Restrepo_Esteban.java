package com.andrade_ariana_restrepo_esteban.lab1_andrade_ariana_restrepo_esteban;

import Ejercicio1.Caja;
import Ejercicio2.Estudiante;
import java.util.Scanner;

public class Lab1_Andrade_Ariana_Restrepo_Esteban {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int op = 0;

        do {
            System.out.println("*****************MENU*********************");
            System.out.println("1.Acceder al ejercicio 1: ");
            System.out.println("2.Acceder al ejercicio 2: ");
            System.out.println("3.Acceder al ejercicio 3: ");
            System.out.println("4.Acceder al ejercicio 4: ");
            System.out.println("5.Acceder al ejercicio 5: ");
            System.out.println("6.salir: ");
            System.out.println("Ingrese su seleccion: ");
            op = scan.nextInt();
            System.out.println("******************************************");
            System.out.println();

            switch (op) {
                case 1:
                    Ejercicio1.Ejercicio1.mostrarEjercicio1();
                    break;
                case 2:
                    Ejercicio2.Ejercicio2.mostrarEjercicio2();
                    break;
                case 3:
                    Ejercicio3.Ejercicio3.mostrarEjercicio3();
                    break;
                case 4:
                    Ejercicio4.Ejercicio4.mostrarEjercicio4();
                    break;
                case 5:
                    Ejercicio5.Ejercicio5.mostrarEjercicio5();
                    break;
            }
        } while (op != 6);

    }
}
