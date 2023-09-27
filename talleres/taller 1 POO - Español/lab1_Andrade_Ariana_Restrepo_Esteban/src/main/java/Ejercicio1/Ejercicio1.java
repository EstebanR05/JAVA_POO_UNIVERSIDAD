/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author e0507
 */
public class Ejercicio1 {

    public static void mostrarEjercicio1() {
        //ejercicio 1
        System.out.println("**************************ejercicio 1**********************************");
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

        System.out.println("***********************************************************************");
        System.out.println();
    }

}
