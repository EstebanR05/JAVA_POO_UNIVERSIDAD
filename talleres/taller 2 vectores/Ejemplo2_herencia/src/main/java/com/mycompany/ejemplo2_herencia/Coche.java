package com.mycompany.ejemplo2_herencia;

public class Coche extends Vehiculo {

    private int numPuertas;

    public Coche(int numPuertas, String marca, double modelo) {
        super(marca, modelo);
        this.numPuertas = numPuertas;
    }

    @Override
    public String toString() {
        return "Coche: " + " numPuertas= " + numPuertas + " marca= " + getMarca() + " modelo= " + getModelo();
    }

}
