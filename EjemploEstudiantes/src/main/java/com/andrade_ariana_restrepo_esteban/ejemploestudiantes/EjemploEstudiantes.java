package com.andrade_ariana_restrepo_esteban.ejemploestudiantes;

import java.util.Scanner;

public class EjemploEstudiantes {

    public static void main(String[] args) {

        Colegio colegio1 = new Colegio("liceo", 1010);

        //integrar estudiante por parametro
        Estudiante estduiante1 = new Estudiante("Esteban", 1111479211, "sistemas");
        Estudiante estduiante2 = new Estudiante("Ariana", 1111479211, "gastronomia");
        Estudiante estduiante3 = new Estudiante("Diego", 1111479211, "eduaccion fisica");

        //registrar estudiantes
        colegio1.registrarEstudiantes(estduiante1, 0);
        colegio1.registrarEstudiantes(estduiante2, 1);
        colegio1.registrarEstudiantes(estduiante3, 2);

        //mostrar nombres de los estduiantes registrados 
        colegio1.mostrarNombresEstudiantes();
    
    }

    /*public void agregarEstudiante() {
        //funcionalidad de agregar estduiantes
        int op = 0;
        int index = 0;
        Scanner scaner = new Scanner(System.in);
        Estudiante estudiante = new Estudiante();

        do {
            System.out.println("1.Agergar nuevo Estudiante");
            System.out.println("2.salir");
            System.out.println("Ingrese su seleccion");
            op = scaner.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Ingrese el nombre del estudiante: ");
                    String nombre = scaner.nextLine();
                    System.out.println("Ingrese la identificacion del estudiante: ");
                    long identificacion = scaner.nextLong();
                    System.out.println("Ingrese la carrera del estudiante: ");
                    String carrera = scaner.nextLine();

                    estudiante.setNombre(nombre);
                    estudiante.setIdentificacion(identificacion);
                    estudiante.setCarrera(carrera);

                    //colegio1.registrarEstudiantes(estudiante, index + 1);
                    break;
            }
        } while (op != 3);
    }*/
}
