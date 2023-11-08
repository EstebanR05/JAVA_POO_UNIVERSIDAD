package com.esteban.exposicion;

class Televisor extends Multimedia implements IReproducir, IVolumen {

    Televisor(String nombre) {
        super(nombre);
    }

    public void reproducir() {
        System.out.println(nombre + " esta reproduciendo contenido multimedia");
    }

    public void pausar() {
        System.out.println(nombre + " Contenido multimedia pausado");
    }

    public void detener() {
        System.out.println(nombre + " Contenido multimedia deteniendo ");
    }

    public void subirVolumen() {
        System.out.println(nombre + " subiendo volumen");
    }

    public void bajarVolumen() {
        System.out.println(nombre + " bajando volumen");
    }

    public void mostrarNombre() {
        System.out.println("Nombre del dispositivo: " + nombre);
    }
}
