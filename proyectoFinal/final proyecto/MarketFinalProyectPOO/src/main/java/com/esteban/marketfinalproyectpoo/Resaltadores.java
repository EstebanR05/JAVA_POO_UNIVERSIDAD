package com.esteban.marketfinalproyectpoo;

public class Resaltadores implements Iproductos {

    //atributos
    private String color;
    private String marca;

    //constructor
    public Resaltadores(String color, String marca) {
        this.color = color;
        this.marca = marca;

        System.out.println();
        System.out.println("Se ha agragado un nuevo Resaltador con color: " + color);
        System.out.println("Se ha agragado un nuevo Resaltador con marca: " + marca);
        System.out.println();
    }
    
    //metodo heredado
    @Override
    public void vendible() {
        System.out.println("Resaltador de color: " + this.color + " de marca: " + this.marca + " disponible para vender");
    }

    //getters and setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    //toString
    @Override
    public String toString() {
        return "Resaltadores{" + "color=" + color + ", marca=" + marca + '}';
    }
}
