package com.esteban.ejemplo3;

import java.util.Scanner;

public class Ejemplo3 {

    public static void main(String[] args) {
        //Atributos
        Scanner scan = new Scanner(System.in);
        int tamañoDePares = 0;
        int tamañoDeImpares = 0;

        //pedir tamaño de vector general
        System.out.println("Ingresa el tamaño del vector: ");
        int tamañoDeVector = scan.nextInt();

        //generar vectores
        int[] vectorGenal = new int[tamañoDeVector];
        int[] pares = new int[tamañoDePares];
        int[] impares = new int[tamañoDeImpares];

        //Ingresar datos al vector
        for (int i = 0; i < tamañoDeVector; i++) {
            System.out.println("Ingrese un numero para su posicion " + i);
            vectorGenal[i] = scan.nextInt();

            /*if (vectorGenal[i] % 2 == 0) {
                pares[tamañoDePares] = vectorGenal[i];
                tamañoDePares += 1;
            } else {
                impares[tamañoDeImpares] = vectorGenal[i];
                tamañoDeImpares += 1;
            }*/
        }

        //imprimir vector general
        System.out.println("******************Vector original************************");
        for (int i = 0; i < vectorGenal.length; i++) {
            System.out.println("Vector en su posicion " + i + ": " + vectorGenal[i]);
        }
        System.out.println("*********************************************************");

        //imprimir numeros pares
        System.out.println("******************PARES**********************************");
        for (int i = 0; i < pares.length; i++) {
            System.out.println("Vector en su posicion " + i + ": " + pares[i]);
        }
        System.out.println("*********************************************************");

        //imprimir numeros impares
        System.out.println("******************IMPARES********************************");
        for (int i = 0; i < impares.length; i++) {
            System.out.println("Vector en su posicion " + i + ": " + impares[i]);
        }
        System.out.println("*********************************************************");
    }
}
