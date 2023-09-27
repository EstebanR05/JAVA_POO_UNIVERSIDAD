package com.andrade_ariana_restrepo_esteban.ejemploestudiantes;

public class Estudiante {

    private String nombre;
    private long identificacion;
    private String carrera;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(long identificacion) {
        this.identificacion = identificacion;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Estudiante(String nombre, long identificacion, String carrera) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante" + "nombre=" + nombre + ", identificacion=" + identificacion + ", carrera=" + carrera;
    }
}
