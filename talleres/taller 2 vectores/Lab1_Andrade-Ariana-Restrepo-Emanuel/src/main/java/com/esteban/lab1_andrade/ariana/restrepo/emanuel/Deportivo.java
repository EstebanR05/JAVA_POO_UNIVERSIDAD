package com.esteban.lab1_andrade.ariana.restrepo.emanuel;

public class Deportivo extends Auto {

    protected int potenciaMotor;

    public int getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public Deportivo(int potenciaMotor, int numPuertas, String tipoCombustible, String marca, String modelo, String color, int velocidadMaxima, int velocidadActual) {
        super(numPuertas, tipoCombustible, marca, modelo, color, velocidadMaxima, velocidadActual);
        this.potenciaMotor = potenciaMotor;
    }

    @Override
    public int acelerar() {
        return velocidadActual += 50;
    }

    @Override
    public int frenar() {
        return velocidadActual -= 30;
    }

    @Override
    public String toString() {
        return "Del deportivo " + "potenciaMotor = " + potenciaMotor
                + ", velocidadActual = " + velocidadActual
                + ", velocidadMaxima = " + velocidadMaxima
                + ", numPuertas = " + numPuertas
                + ", tipoCombustible = " + tipoCombustible
                + ", marca = " + marca
                + ", modelo = " + modelo
                + ", color = " + color;
    }

}
