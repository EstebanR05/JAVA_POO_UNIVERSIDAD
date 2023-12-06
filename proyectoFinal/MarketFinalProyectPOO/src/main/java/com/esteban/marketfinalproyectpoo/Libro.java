package com.esteban.marketfinalproyectpoo;

public class Libro implements Iproductos {

    private String titulo;
    private String autor;
    private Boolean estado;

    @Override
    public void vendible() {
        String estadoLibro;
        
        if (this.estado == true) {
            estadoLibro = "Disponible";
        } else {
            estadoLibro = "No Disponible";
        }

        System.out.println("Libro con titulo: " + this.titulo + " del autor: " + this.autor + " con estado: " + estadoLibro);
    }

    public Libro(String titulo, String autor, Boolean estado) {
        this.titulo = titulo;
        this.autor = autor;
        this.estado = estado;
    }

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

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
