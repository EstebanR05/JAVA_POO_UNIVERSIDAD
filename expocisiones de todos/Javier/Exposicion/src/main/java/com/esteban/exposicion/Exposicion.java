package com.esteban.exposicion;

import java.util.ArrayList;

public class Exposicion {

    public static void main(String[] args) {

        // crear objetos
        Perro perro = new Perro();
        Gato gato = new Gato();

        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(perro);
        animales.add(gato);

        for (Animal animal : animales) {
            if (animal instanceof Perro) {
                System.out.println("**********************PERRO*******************************");
                animal.hacerSonido();
                ((Perro) animal).jugar();
            }

            if (animal instanceof Gato) {
                System.out.println("**********************GATO*******************************");
                animal.hacerSonido();
                ((Gato) animal).jugar();
            }
        }
    }
}
