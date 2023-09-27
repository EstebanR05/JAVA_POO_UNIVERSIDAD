package com.andrade_ariana_restrepo_emanuel.lab1._andrade.ariana.restrepo.emanuel;

import java.util.Scanner;

public class main_ejer_5 {

    public static void mostrarEjercicio5() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el nombre: ");
        String nombre = scan.nextLine();
        System.out.println("Ingrese la edad: ");
        int edad = scan.nextInt();
        System.out.println("Ingrese el sexo: ");
        char sexo = scan.next().charAt(0);
        System.out.println("Ingrese el peso: ");
        double peso = scan.nextDouble();
        System.out.println("Ingrese la altura: ");
        double altura = scan.nextDouble();

        Persona_ persona4 = new Persona_(nombre, edad, sexo, "", peso, altura);//pasar todos los valores
        Persona_ persona5 = new Persona_(nombre, edad, sexo); //nombre, edad, sexo
        Persona_ persona6 = new Persona_(); //default

        //utilizar los set
        persona6.setAltura(1.80);
        persona6.setEdad(15);
        persona6.setNombre("david");
        persona6.setPeso(50);
        persona6.setSexo('H');

        //comprobacion de sexo
        persona4.comprobarSexo(sexo);
        persona5.comprobarSexo(sexo);
        persona6.comprobarSexo(sexo);

        //Generar DNI
        persona4.generarDni();
        persona5.generarDni();
        persona6.generarDni();

        //mostrar peso
        System.out.println("Peso de la persona 1 " + persona4.calcularIMC());
        System.out.println("Peso de la persona 2 " + persona5.calcularIMC());
        System.out.println("Peso de la persona 3 " + persona6.calcularIMC());

        //mostrar si es mayor de edad o no
        System.out.println("¿Es mayor de edad la persona 1? " + persona4.esMayorDeEdad());
        System.out.println("¿Es mayor de edad la persona 2? " + persona5.esMayorDeEdad());
        System.out.println("¿Es mayor de edad persona 3? " + persona6.esMayorDeEdad());

        //mostrar toString de cada objeto
        System.out.println("El estado de la persona 1 " + persona4.toString());
        System.out.println("El estado de la persona 2 " + persona5.toString());
        System.out.println("El estado de la persona 3 " + persona6.toString());

        System.out.println();
    }
}
