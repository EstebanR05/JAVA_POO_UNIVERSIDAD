package com.esteban.exposicion;

import java.util.ArrayList;

public class Exposicion {

    public static void main(String[] args) {
        //crear objetos
        Televisor tv = new Televisor("Smart TV");
        ReproductorMP3 mp3 = new ReproductorMP3("Reproductor de MP3");

        //agrupar objetos en un arrayList
        ArrayList<Multimedia> multimedias = new ArrayList<>();
        multimedias.add(tv);
        multimedias.add(mp3);

        //mostrar informacion en consola dependiendo el objeto ingresado
        for (Multimedia multimedia : multimedias) {
            if (multimedia instanceof Televisor) {
                System.out.println("********************Televisor***********************");
                multimedia.mostrarNombre();
                ((Televisor) multimedia).reproducir();
                ((Televisor) multimedia).pausar();
                ((Televisor) multimedia).detener();
                ((Televisor) multimedia).subirVolumen();
                ((Televisor) multimedia).bajarVolumen();
            }

            if (multimedia instanceof ReproductorMP3) {
                System.out.println("********************ReproductorMP3***********************");
                multimedia.mostrarNombre();
                ((ReproductorMP3) multimedia).reproducir();
                ((ReproductorMP3) multimedia).pausar();
                ((ReproductorMP3) multimedia).detener();
                ((ReproductorMP3) multimedia).subirVolumen();
                ((ReproductorMP3) multimedia).bajarVolumen();
            }
        }
    }
}
