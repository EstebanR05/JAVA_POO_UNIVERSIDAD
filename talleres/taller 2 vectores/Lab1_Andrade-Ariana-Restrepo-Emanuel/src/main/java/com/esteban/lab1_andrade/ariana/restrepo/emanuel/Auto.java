package com.esteban.lab1_andrade.ariana.restrepo.emanuel;

public class Auto extends Vehiculo {

    protected int numPuertas;
    protected String tipoCombustible;

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
        return velocidadActual += 30;
    }

    @Override
    public int frenar() {
        return velocidadActual -= 20;
    }

    @Override
    public String toString() {
        return "Del auto" + " con numPuertas = " + numPuertas
                + ", tipoCombustible = " + tipoCombustible
                + ", velocidadActual = " + velocidadActual
                + ", velocidadMaxima = " + velocidadMaxima
                + ", marca = " + marca
                + ", modelo = " + modelo
                + ", color = " + color;
    }

}
