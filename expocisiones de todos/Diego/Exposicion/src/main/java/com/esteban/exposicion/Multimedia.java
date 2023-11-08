package com.esteban.exposicion;

public abstract class Multimedia {

    String nombre;

    public Multimedia(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarNombre() {
        System.out.println("Nombre del dispositivo: " + nombre);
    }
}
