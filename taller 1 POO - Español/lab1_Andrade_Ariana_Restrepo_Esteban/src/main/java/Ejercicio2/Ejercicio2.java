/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author e0507
 */
public class Ejercicio2 {

    public static void mostrarEjercicio2() {
        //ejercicio 2
        System.out.println("**************************ejercicio 2**********************************");
        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante(0.3, 3.0, 5.0, "esteban", 20);
        Estudiante estudiante3 = new Estudiante(estudiante2);

        //set valores
        estudiante3.setNombre("Ariana");
        estudiante3.setEdad(18);
        estudiante3.setNota1(5.0);
        estudiante3.setNota2(5.0);
        estudiante3.setNota3(5.0);

        //Mostrar el estado de cada Estudiante
        System.out.println("El estado del estudiante 1 " + estudiante1.estado());
        System.out.println("El estado del estudiante 2 " + estudiante2.estado());
        System.out.println("El estado del estudiante 3 " + estudiante3.estado());

        //Mostrar la nota final de cada Estudiante
        System.out.println("La nota final del estudiante 1 " + estudiante1.notaFinal());
        System.out.println("La nota final del estudiante 2 " + estudiante2.notaFinal());
        System.out.println("La nota final del estudiante 3 " + estudiante3.notaFinal());

        System.out.println();
        System.out.println();

    }

}
