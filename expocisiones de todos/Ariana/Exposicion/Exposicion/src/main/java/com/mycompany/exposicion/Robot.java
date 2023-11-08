/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exposicion;

public class Robot extends ProyectoSistemas implements IMovimiento, IProgramacion {

    private int tamaño;
    private String tipo;

    public Robot(int tamaño, String tipo, String nombreProyecto) {
        super(nombreProyecto);
        this.tamaño = tamaño;
        this.tipo = tipo;
    }

    @Override
    public void movimientoBrazo() {
        System.out.println("se mueve el brazo");
    }

    @Override
    public void hacerCodigo() {
        System.out.println("se Hace el codigo");
    }

}
