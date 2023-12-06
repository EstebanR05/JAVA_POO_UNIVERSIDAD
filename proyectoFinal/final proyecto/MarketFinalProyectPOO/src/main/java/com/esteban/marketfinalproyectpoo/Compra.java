package com.esteban.marketfinalproyectpoo;

import java.util.Date;
import java.util.ArrayList;

public class Compra {

    //atributos
    private ArrayList<Iproductos> producto;
    private Persona persona;
    private Date fechaVenta;

    //constructor
    public Compra(ArrayList<Iproductos> producto, Persona persona, Date fechaVenta) {
        this.producto = producto;
        this.persona = persona;
        this.fechaVenta = fechaVenta;
    }

    //getter and setters
    public ArrayList<Iproductos> getProducto() {
        return producto;
    }

    public void setProducto(ArrayList<Iproductos> producto) {
        this.producto = producto;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    //toString
    @Override
    public String toString() {
        return "Compra" + " producto = " + producto + ", persona = " + persona + ", fechaVenta = " + fechaVenta;
    }
}
