/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exposicion;

public class Videojuego extends ProyectoSistemas implements IInteligenciaArtificial, IProgramacion {

    private int numeroPersonajes;

    public Videojuego(int numeroPersonajes, String nombreProyecto) {
        super(nombreProyecto);
        this.numeroPersonajes = numeroPersonajes;
    }

    @Override
    public void aprendizajeAutonomo() {
        System.out.println("Se Inicializa Aprendizaje Autonomo");
    }

    @Override
    public void hacerCodigo() {
        System.out.println("se Hace el codigo");
    }

}
