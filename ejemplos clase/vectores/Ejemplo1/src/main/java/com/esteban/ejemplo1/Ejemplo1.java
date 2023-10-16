package com.esteban.ejemplo1;

import java.util.Scanner;

public class Ejemplo1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //solicitar tamaño
        System.out.println("Ingrese el tamaño de su vector de enteros: ");
        int tamañoVector = scan.nextInt();

        //crear vector
        int[] vector = new int[tamañoVector];
        int sumaValores = 0;
        double promedio = 0;

        //integrar datos al vector
        for (int i = 0; i < tamañoVector; i++) {
            System.out.println("Ingrese su valor en la posicion: " + i);
            vector[i] = scan.nextInt();
            sumaValores += vector[i];
        }

        //imprimir posicion del vector
        System.out.println("Su valor por posicion es:");
        for (int i = 0; i < tamañoVector; i++) {
            System.out.println("VECTOR en posicion " + (i + 1) + ": " + vector[i]);
        }

        //mostrar sumatoria de valores
        System.out.println("LA suma de todos sus elementos es: " + sumaValores);

        //mostrar promedio
        promedio = sumaValores / tamañoVector;
        System.out.println("Su promedio es: " + promedio);
    }
}
