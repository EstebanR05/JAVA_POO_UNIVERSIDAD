package com.mycompany.ejemplo1_herencia;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejemplo1_herencia {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //crear objetos
        Persona persona1 = new Persona("jorge", 17);
        Estudiante estudiante1 = new Estudiante(1, "Nicolas", 18);

        //imprimir estado
        System.out.println("el estado de la persona 1 es: " + persona1.toString());
        System.out.println("el estado de la estudiante 1 es: " + estudiante1.toString());

        //ingresar numero de estudiantes a ingresar y crear lista de estudiantes
        System.out.println("Ingresa el numero de estudiantes que deseas crear");
        int numEstudiantes = scan.nextInt();
        Estudiante[] estudiantes = crearEstudiantes(numEstudiantes);

        //mostrar estudiantes ingresados
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("Estudiante " + i + " : " + estudiantes[i]);
        }
    }

    public static Estudiante[] crearEstudiantes(int n) {
        Scanner scan = new Scanner(System.in);
        Estudiante[] estudiantes = new Estudiante[n];
        String nombre = "";
        int edad = 0;
        int codigo = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Ingresa el nombre: ");
            nombre = scan.nextLine();
            System.out.println("Ingresa La edad: ");
            edad = scan.nextInt();
            System.out.println("Ingresa el codigo: ");
            codigo = scan.nextInt();

            Estudiante estudiante = new Estudiante(codigo, nombre, edad);
            estudiantes[i] = estudiante;
            
            nombre = "";
            edad = 0;
            codigo = 0;
        }

        return estudiantes;
    }
}
