package com.andrade_ariana_restrepo_emanuel.lab1._andrade.ariana.restrepo.emanuel;

import java.util.Scanner;

public class Lab12_AndradeArianaRestrepoEmanuel {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int menu = 0;

        do {
            System.out.println("*******************************MENU****************************");
            System.out.println("[1].Ejecutar la funcionalidad de ejercicio 1.");
            System.out.println("[2].Ejecutar la funcionalidad de ejercicio 2.");
            System.out.println("[3].Ejecutar la funcionalidad de ejercicio 3.");
            System.out.println("[4].Ejecutar la funcionalidad de ejercicio 4.");
            System.out.println("[5].Ejecutar la funcionalidad de ejercicio 5.");
            System.out.println("[6].SALIR.");
            System.out.println("Introduzca su opcion: ");
            menu = scan.nextInt();
            System.out.println("***************************************************************");

            switch (menu) {
                case 1:
                    //ejercicio 1
                    Caja caja1 = new Caja();//Constructor por defecto
                    Caja caja2 = new Caja(1, 2, 3);//Constructor por instancia
                    Caja caja3 = new Caja(caja2);//Constructor por copia

                    //Metodo set
                    caja3.setLargo(10);
                    //Metodo get-Largo vale 10, por que se cambio el valor de caja 3 a 10
                    double largo = caja3.getLargo();

                    //Mostrar el estado de cada objeto
                    System.out.println("El estado de el objeto 1 " + caja1.estado());
                    System.out.println("El estado de el objeto 2 " + caja2.estado());
                    System.out.println("El estado de el objeto 3 " + caja3.estado());

                    //Mostrar el Volumen
                    System.out.println("El volumen de la caja 1 " + caja1.calcularVolumen());
                    System.out.println("El volumen de la caja 2 " + caja2.calcularVolumen());
                    System.out.println("El volumen de la caja 3 " + caja3.calcularVolumen());

                    System.out.println();
                    break;
                case 2:
                    //ejercicio 2
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
                    break;
                /*case 3:
                    System.out.println("**************************ejercicio 3**********************************");
                    //Constructor por defecto
                    Persona persona1 = new Persona();
                    //Constructor por instancia
                    Persona persona2 = new Persona("Ariana", "Andrade", 1061530204, "Mujer");
                    //Constructor por copia
                    Persona persona3 = new Persona("Esteban", "Restrepo", 1111479211, "Hombre");

                    //Mostrar el estado de cada objeto
                    System.out.println("El estado de la persona 1 es: " + persona1.estado());
                    System.out.println("El estado de la persona 2 es: " + persona2.estado());
                    System.out.println("El estado de la persona 3 es: " + persona3.estado());

                    //imprimir edad
                    break;
                case 4:
                    System.out.println("**************************ejercicio 4**********************************");
                    double cantidad = 0;
                    int menuEjercicio4 = 0;

                    Cuenta cuenta1 = new Cuenta("Esteban", 2000);
                    Cuenta copy = new Cuenta("Ariana", 4000);
                    Cuenta cuenta2 = new Cuenta(copy);

                    do {
                        System.out.println("1.Consignar");
                        System.out.println("2.Retirar");
                        System.out.println("3.Salir");
                        System.out.println("Ingrese su seleccion: ");
                        menu = scan.nextInt();

                        switch (menuEjercicio4) {
                            case 1:
                                System.out.println("Ingrese el valor a consignar: ");
                                cantidad = scan.nextDouble();
                                cuenta1.Consignar(cantidad);
                                cuenta1.toString();
                                break;
                            case 2:
                                System.out.println("Ingrese el valor a retirar: ");
                                cantidad = scan.nextDouble();
                                cuenta1.Retirar(cantidad);
                                cuenta1.toString();
                                break;
                        }
                    } while (menuEjercicio4 != 3);

                    System.out.println();
                    break;
                case 5:
                    System.out.println("**************************ejercicio 5**********************************");

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

                    Persona_ persona4 = new Persona_(nombre, edad, sexo, 0, peso, altura);//pasar todos los valores
                    Persona_ persona5 = new Persona_(nombre, edad, sexo); //nombre, edad, sexo
                    Persona_ persona6 = new Persona_();
                    
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
                    persona4.generaDNI();
                    persona5.generaDNI();
                    persona6.generaDNI();

                    //mostrar peso
                    System.out.println("Peso de la persona 1 " + persona4.calcularIMC());
                    System.out.println("Peso de la persona 2 " + persona5.calcularIMC());
                    System.out.println("Peso de la persona 3 " + persona6.calcularIMC());

                    //mostrar si es mayor de edad o no
                    System.out.println("Es mayor de edad la persona 1 " + persona4.esMayorDeEdad());
                    System.out.println("Es mayor de edad la persona 2 " + persona5.esMayorDeEdad());
                    System.out.println("Es mayor de edad persona 3 " + persona6.esMayorDeEdad());

                    //mostrar toString de cada objeto
                    System.out.println("El estado de la persona 1 " + persona4.toString());
                    System.out.println("El estado de la persona 2 " + persona5.toString());
                    System.out.println("El estado de la persona 3 " + persona6.toString());

                    System.out.println();
                     
                    break;
                 */
            }

        } while (menu != 6);
    }
}
