package com.andrade_ariana_restrepo_emanuel.lab1._andrade.ariana.restrepo.emanuel;

import java.util.Scanner;

public class main_ejer_4 {

    public static void mostrarEjercicio4() {
        Scanner scan = new Scanner(System.in);
        double cantidad = 0;
        int cuentaMenu = 0;
        int menuCuenta1 = 0;
        int menuCuenta2 = 0;
        double consignarCuenta1 = 0;
        double retirarCuenta1 = 0;
        double consignarCuenta2 = 0;
        double retirarCuenta2 = 0;

        //constructores
        Cuenta cuenta1 = new Cuenta("Esteban", 0);
        Cuenta copy = new Cuenta("Ariana", 0);
        Cuenta cuenta2 = new Cuenta(copy);

        //menu principal para acceder a cuentas
        do {
            System.out.println("[1]. Acceder a cuenta 1");
            System.out.println("[2]. Acceder a cuenta 2");
            System.out.println("[3]. Salir");
            System.out.println("Ingrese su seleccion: ");
            cuentaMenu = scan.nextInt();

            //casos para cada cuenta
            switch (cuentaMenu) {
                case 1:
                    System.out.println("Esta es la cuenta 1");

                    //menu para consignar o retirar cuenta 1
                    do {
                        System.out.println("[1]. Consignar a la cuenta");
                        System.out.println("[2]. Retirar de la cuenta");
                        System.out.println("[3]. Salir");
                        System.out.println("Ingrese su seleccion: ");
                        menuCuenta1 = scan.nextInt();

                        switch (menuCuenta1) {
                            case 1:
                                System.out.println("Ingrese la cantidad para su consignacion: ");
                                consignarCuenta1 = scan.nextDouble();
                                cuenta1.Consignar(consignarCuenta1);
                                break;
                            case 2:
                                System.out.println("Ingrese la cantidad para su retiro: ");
                                retirarCuenta1 = scan.nextDouble();
                                cuenta1.Retirar(retirarCuenta1);
                                break;
                        }

                    } while (menuCuenta1 != 3);

                    break;
                case 2:
                    System.out.println("Esta es la cuenta 2");

                    //menu para consignar o retirar cuenta 2
                    do {
                        System.out.println("[1]. Consignar a la cuenta");
                        System.out.println("[2]. Retirar de la cuenta");
                        System.out.println("[3]. Salir");
                        System.out.println("Ingrese su seleccion: ");
                        menuCuenta2 = scan.nextInt();

                        switch (menuCuenta1) {
                            case 1:
                                System.out.println("Ingrese la cantidad para su consignacion: ");
                                consignarCuenta2 = scan.nextDouble();
                                cuenta2.Consignar(consignarCuenta2);
                                break;
                            case 2:
                                System.out.println("Ingrese la cantidad para su retiro: ");
                                retirarCuenta2 = scan.nextDouble();
                                cuenta2.Retirar(retirarCuenta2);
                                break;
                        }

                    } while (menuCuenta2 != 3);

                    break;
            }
        } while (cuentaMenu != 3);

        //mostrar estado de las cuentas
        System.out.println("El estado de la Cuenta 1 " + cuenta1.toString());
        System.out.println("El estado de la Cuenta 2 " + cuenta2.toString());

        System.out.println();
    }
}
