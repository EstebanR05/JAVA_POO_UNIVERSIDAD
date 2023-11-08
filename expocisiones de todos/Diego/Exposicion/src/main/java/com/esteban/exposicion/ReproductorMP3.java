package com.esteban.exposicion;

class ReproductorMP3 extends Multimedia implements IReproducir, IVolumen {

    ReproductorMP3(String nombre) {
        super(nombre);
    }

    public void reproducir() {
        System.out.println("Reproduciendo archivo de audio");
    }

    public void pausar() {
        System.out.println(nombre + " Pausado");
    }

    public void detener() {
        System.out.println(nombre + " detenido");
    }

    public void subirVolumen() {
        System.out.println("Subiendo volumen del " + nombre);
    }

    public void bajarVolumen() {
        System.out.println("Bajando volumen del " + nombre);
    }
}
