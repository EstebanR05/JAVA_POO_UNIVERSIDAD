package com.andrade_ariana_restrepo_emanuel.lab1._andrade.ariana.restrepo.emanuel;

public class Caja {

    private double largo;
    private double ancho;
    private double alto;

    //constructor por defecto
    public Caja() {
        largo = 0;
        ancho = 0;
        alto = 0;
    }

    //constructor parametrizado
    public Caja(double largo, double ancho, double alto) {
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
    }

    //constructor por copia
    public Caja(Caja caja) {
        this.alto = caja.largo;
        this.ancho = caja.ancho;
        this.alto = caja.alto;
    }

    //Metodo get
    public double getLargo() {
        return this.largo;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    //Metodo set
    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    //Metodo que retorna una cadena de caracteres
    public String estado() {
        String estado = "El largo es: " + this.largo + " El ancho es: " + this.ancho + " El alto es: " + this.alto;
        return estado;
    }

    //Metodo para calcular el volumnen
    public double calcularVolumen() {
        return this.alto * this.ancho * this.largo;
    }
}
