package com.esteban.marketfinalproyectpoo;

public class Libro implements Iproductos {

    //atributos
    private String titulo;
    private String autor;

    //constructor
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;

        System.out.println();
        System.out.println("Se ha agragado un nuevo libro con titulo: " + titulo);
        System.out.println("Se ha agragado un nuevo libro con autor: " + autor);
        System.out.println();
    }
    
    //metodo heredado
    @Override
    public void vendible() {
        System.out.println("Libro con titulo: " + this.titulo + " del autor: " + this.autor + " con estado: " + "vendible");
    }

    //metodos getters and setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    //to string
    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + '}';
    }

}
