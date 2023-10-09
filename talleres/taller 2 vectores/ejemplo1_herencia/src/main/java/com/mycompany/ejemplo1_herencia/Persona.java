package com.mycompany.ejemplo1_herencia;

public class Persona {

    private String nombre;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona: " + "Nombre= " + nombre + ", edad= " + edad;
    }

}
