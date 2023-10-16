/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia1;

/**
 *
 * @author Unicomfacauca
 */
public class Auto extends Vehiculo {

    protected int numPuertas;
    protected String tipoCombustible;
    protected int velocidadActual;

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public Auto(int numPuertas, String tipoCombustible, String marca, String modelo, String color, int velocidadMaxima, int velocidadActual) {
        super(marca, modelo, color, velocidadMaxima, velocidadActual);
        this.numPuertas = numPuertas;
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public int acelerar() {
        return this.velocidadActual += 30;
    }
    
    @Override
    public int frenar() {
        return this.velocidadActual -= 20;
    }
}
