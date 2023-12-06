package com.esteban.marketfinalproyectpoo;

public abstract class Persona {

    //atributos
    private String nombre;
    private int celular;
    private int id;

    //metodo abstracto porque las clases abstractas deben tener por lo menos 1 metodo abstracto
    abstract String imprimirInformacion();

    //constructores
    public Persona(String nombre, int celular, int id) {
        this.nombre = nombre;
        this.celular = celular;
        this.id = id;
    }

    public Persona(int id) {
        this.id = id;
    }

    public Persona() {
        this.nombre = "";
        this.id = 0;
        this.celular = 0;
    }

    //getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
