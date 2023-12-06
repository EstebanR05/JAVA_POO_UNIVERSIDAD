package com.esteban.marketfinalproyectpoo;

public class Vendedor extends Persona implements IRegistrable {

    //atributos
    private Stock stock;

    //constructores
    public Vendedor(String nombre, int celular, int id) {
        super(nombre, celular, id);
    }

    public Vendedor(int id) {
        super(id);
    }

    public Vendedor() {
    }

    //metodos heredados con funcionalidad
    @Override
    public String imprimirInformacion() {
        if (getNombre() != "") {
            return "El nombre del vendedor es: " + getNombre() + ", con identificacion: " + getId() + " y numero de celular: " + getCelular();
        } else {
            return "la identificacion del vendedor es: " + getId();
        }
    }

    @Override
    public void registrar() {
        if (getNombre() != "") {
            System.out.println("el Vendedor con Nombre: " + getNombre() + ", con identificacion: " + getId() + " y celular: " + getCelular() + " ha sido registrado");
        } else {
            System.out.println("el vendedor con identificacion: " + getId() + " ha sido registrado");
        }
    }

    //getters and setters
    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }
}
