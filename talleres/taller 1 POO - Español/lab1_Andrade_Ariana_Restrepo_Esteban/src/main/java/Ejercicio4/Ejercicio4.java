package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void mostrarEjercicio4() {
        System.out.println("**************************ejercicio 4**********************************");
        Scanner scan = new Scanner(System.in);
        double cantidad = 0;
        int menu = 0;

        Cuenta cuenta1 = new Cuenta("Esteban", 2000);
        Cuenta copy = new Cuenta("Ariana", 4000);
        Cuenta cuenta2 = new Cuenta(copy);

        do {
            System.out.println("1.Consignar");
            System.out.println("2.Retirar");
            System.out.println("3.Salir");
            System.out.println("Ingrese su seleccion: ");
            menu = scan.nextInt();

            switch (menu) {
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
        } while (menu != 3);

        System.out.println("***********************************************************************");
        System.out.println();
    }

}
