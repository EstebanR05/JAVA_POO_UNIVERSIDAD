package com.mycompany.ejemplo2_herencia;

public class Vehiculo {

    private String marca;
    private double modelo;

    public Vehiculo(String marca, double modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public double getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + '}';
    }

}
