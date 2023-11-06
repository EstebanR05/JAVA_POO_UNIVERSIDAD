package com.mycompany.ejercicio_polimorfismo;

public class Cuadrado extends Figura implements IRotable, IDibujable {

    private float lado;

    @Override
    public float area() {
        return (float) (this.lado * this.lado);
    }

    @Override
    public String rotar(float grados) {
        return "La figura Cuadrado esta rotando 30° grados";
    }

    @Override
    public String Dibujar() {
        return "La figura Cuadrado esta siendo dibujada";
    }

    public Cuadrado(float lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado: " + " lado = " + lado;
    }
}
