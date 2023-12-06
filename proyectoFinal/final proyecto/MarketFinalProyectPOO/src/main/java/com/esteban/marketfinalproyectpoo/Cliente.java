package com.esteban.marketfinalproyectpoo;

public class Cliente extends Persona implements IRegistrable {

    //constructores
    public Cliente(String nombre, int celular, int id) {
        super(nombre, celular, id);
    }

    public Cliente(int id) {
        super(id);
    }

    public Cliente() {
    }

    //metodos heredados
    @Override
    public void registrar() {
        if (getNombre() != "") {
            System.out.println("el cliente con Nombre: " + getNombre() + ", con identificacion: " + getId() + " y celular: " + getCelular() + " ha sido registrado");
        } else {
            System.out.println("el cliente con identificacion: " + getId() + " ha sido registrado");
        }
    }

    @Override
    public String imprimirInformacion() {
        if (getNombre() != "") {
            return "cliente con nombre " + getNombre() + " con identificacion: " + getId() + " y numero celular: " + getCelular();
        } else {
            return "cliente con identificacion: " + getId();
        }
    }

}
