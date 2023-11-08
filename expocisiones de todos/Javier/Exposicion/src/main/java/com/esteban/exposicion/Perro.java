/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esteban.exposicion;

/**
 *
 * @author e0507
 */
public class Perro extends Animal implements Mascota {

    @Override
    public void hacerSonido() {
        System.out.println("guau guau.");
    }

    @Override
    public void jugar() {
        System.out.println("El perro juega");
    }
}
