package com.mycompany.ejercicio_polimorfismo;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_polimorfismo {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Figura> figuras = new ArrayList<>();
        int menu = 0;
        
        do {
            System.out.println("******************Ingresar figuras*********************");
            System.out.println("1.Agregar Cuadrado");
            System.out.println("2.Agregar circulo");
            System.out.println("3.Mostrar informacion de todas las figuras insertadas");
            System.out.println("4.Mostrar área de las figuras");
            System.out.println("5.Mostrar las figuras dibujando");
            System.out.println("6.Mostrar los grados rotando del cuadrado");
            System.out.println("7.salir");
            menu = scan.nextInt();
            System.out.println("*******************************************************");
            
            switch (menu) {
                case 1:
                    agregarCuadrado(figuras);
                    break;
                case 2:
                    agregarCirculo(figuras);
                    break;
                case 3:
                    mostrarInformacion(figuras);
                    break;
                case 4:
                    mostrarArea(figuras);
                    break;
                case 5:
                    mostrarDibujando(figuras);
                    break;
                case 6:
                    mostrarRotando(figuras);
                    break;
            }
        } while (menu != 7);
    }
    
    public static void agregarCuadrado(ArrayList<Figura> figuras) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa un lado del cuadrado");
        float lado = scan.nextFloat();
        Cuadrado cuadrado = new Cuadrado(lado);
        figuras.add(cuadrado);
    }
    
    public static void agregarCirculo(ArrayList<Figura> figuras) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa el radio del circulo");
        float radio = scan.nextFloat();
        Circulo circulo = new Circulo(radio);
        figuras.add(circulo);
    }
    
    public static void mostrarInformacion(ArrayList<Figura> figuras) {
        for (Figura figura : figuras) {
            System.out.println(figura.toString());
        }
    }
    
    public static void mostrarArea(ArrayList<Figura> figuras) {
        for (Figura figura : figuras) {
            System.out.println("El area es: " + figura.area());
        }
    }
    
    public static void mostrarDibujando(ArrayList<Figura> figuras) {
        for (Figura figura : figuras) {
            if (figura instanceof Circulo) {
                ((Circulo) figura).Dibujar();
            }
            if (figura instanceof Cuadrado) {
                ((Cuadrado) figura).Dibujar();
            }
        }
    }
    
    public static void mostrarRotando(ArrayList<Figura> figuras) {
        for (Figura figura : figuras) {
            if (figura instanceof Cuadrado) {
                ((Cuadrado) figura).rotar(20);
            }
        }
    }
}
