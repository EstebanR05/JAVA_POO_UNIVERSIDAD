package com.esteban.marketfinalproyectpoo;

public class Resaltadores implements Iproductos {

    private String color;
    private String marca;

    @Override
    public void vendible() {
        System.out.println("Resaltador de color: " + this.color + " de marca: " + this.marca + " disponible para vender");
    }

    public Resaltadores(String color, String marca) {
        this.color = color;
        this.marca = marca;
    }

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
}
