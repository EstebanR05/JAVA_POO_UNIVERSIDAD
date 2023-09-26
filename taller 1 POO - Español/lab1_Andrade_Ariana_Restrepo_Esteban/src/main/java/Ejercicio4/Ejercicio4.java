package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void mostrarEjercicio4() {
        System.out.println("**************************ejercicio 4**********************************");
        Scanner scan = new Scanner(System.in);
        double cantidad = 0;
        int menu = 0;

        do {
            System.out.println("*********************Menu************************");
            System.out.println("1.Consignar");
            System.out.println("2.Retirar");
            System.out.println("3.Salir");
            System.out.println("Ingrese su seleccion: ");
            menu = scan.nextInt();
            System.out.println("*************************************************");

            switch (menu) {
                case 1:
                    System.out.println("consignar");
                    break;
                case 2:
                    System.out.println("retirar");
                    break;
            }
        } while (menu != 3);

        System.out.println("***********************************************************************");
        System.out.println();
    }

}
