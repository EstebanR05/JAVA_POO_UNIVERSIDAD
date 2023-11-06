package com.mycompany.ejercicio_polimorfismo;

public class Circulo extends Figura implements IDibujable {

    private float radio;

    @Override
    public float area() {
        return (float) (3.1416 * (this.radio * this.radio));
    }

    @Override
    public String Dibujar() {
        return "La figura Circulo esta siendo dibujada";
    }

    public Circulo(float radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo: " + " radio = " + radio;
    }

}
