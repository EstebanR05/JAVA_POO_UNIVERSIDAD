/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exposicion;

import java.util.ArrayList;

/**
 *
 * @author arian
 */
public class Exposicion {

    public static void main(String[] args) {
        ArrayList<ProyectoSistemas> proyectos = new ArrayList<>();
        proyectos.add(new Videojuego(4, "FreeFire"));
        proyectos.add(new Robot(60, "Brazo", "Brazo Hi"));

        for (ProyectoSistemas proyecto : proyectos) {
            if (proyecto instanceof Robot) {
                System.out.println("---------------Robot----------------------");
                ((Robot) proyecto).movimientoBrazo();
                ((Robot) proyecto).hacerCodigo();
                ((Robot) proyecto).logicaMatematica();
            }

            if (proyecto instanceof Videojuego) {
                System.out.println("---------------Videojuego----------------------");
                ((Videojuego) proyecto).aprendizajeAutonomo();
                ((Videojuego) proyecto).hacerCodigo();
                ((Videojuego) proyecto).logicaMatematica();
            }
        }
    }
}
