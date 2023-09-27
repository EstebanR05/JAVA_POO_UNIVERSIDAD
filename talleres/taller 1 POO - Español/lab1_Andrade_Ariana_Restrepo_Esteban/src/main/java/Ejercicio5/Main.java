package Ejercicio5;

import java.util.Scanner;

public class Main {

    public static void mostrarEjercicio5() {
        System.out.println("**************************ejercicio 5**********************************");

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

        Persona persona1 = new Persona(nombre, edad, sexo, 0, peso, altura);//pasar todos los valores
        Persona persona2 = new Persona(nombre, edad, sexo); //nombre, edad, sexo
        Persona persona3 = new Persona(); //default

        //utilizar los set
        persona3.setAltura(1.80);
        persona3.setEdad(15);
        persona3.setNombre("david");
        persona3.setPeso(50);
        persona3.setSexo('H');

        //comprobacion de sexo
        persona1.comprobarSexo(sexo);
        persona2.comprobarSexo(sexo);
        persona3.comprobarSexo(sexo);

        //Generar DNI
        persona1.generaDNI();
        persona2.generaDNI();
        persona3.generaDNI();

        //mostrar peso
        System.out.println("Peso de la persona 1 " + persona1.calcularIMC());
        System.out.println("Peso de la persona 2 " + persona2.calcularIMC());
        System.out.println("Peso de la persona 3 " + persona3.calcularIMC());

        //mostrar si es mayor de edad o no
        System.out.println("Es mayor de edad la persona 1 " + persona1.esMayorDeEdad());
        System.out.println("Es mayor de edad la persona 2 " + persona2.esMayorDeEdad());
        System.out.println("Es mayor de edad persona 3 " + persona3.esMayorDeEdad());

        //mostrar toString de cada objeto
        System.out.println("El estado de la persona 1 " + persona1.toString());
        System.out.println("El estado de la persona 2 " + persona2.toString());
        System.out.println("El estado de la persona 3 " + persona3.toString());

        System.out.println("***********************************************************************");
        System.out.println();
    }
}
