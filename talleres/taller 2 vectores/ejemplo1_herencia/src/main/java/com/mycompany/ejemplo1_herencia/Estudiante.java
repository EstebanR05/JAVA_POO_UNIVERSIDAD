package com.mycompany.ejemplo1_herencia;

public class Estudiante extends Persona {

    private int codigoEstudiante;

    public Estudiante(int codigoEstudiante, String nombre, int edad) {
        super(nombre, edad);
        this.codigoEstudiante = codigoEstudiante;
    }

    @Override
    public String toString() {
        return "Estudiante:" + " codigoEstudiante= " + codigoEstudiante + ", nombre= " + getNombre() + ", edad = " + getEdad();
    } 

}
