package com.esteban.marketfinalproyectpoo;

import java.util.ArrayList;
import java.util.Scanner;

public class Stock {

    //atributos
    private Vendedor vendedor;
    ArrayList<Iproductos> productosStock = new ArrayList<>();

    //constructor
    public Stock() {
        this.vendedor = null;
        this.productosStock = null;
    }

    //metodos
    public void adicionarAlStock(ArrayList<Iproductos> productos) {
        if (productos != null) {
            for (Iproductos producto : productos) {
                if (producto instanceof Libro) {
                    this.productosStock.add(producto);
                }

                if (producto instanceof Resaltadores) {
                    this.productosStock.add(producto);
                }
            }

            productos.clear();
        }
        
        if (productos.isEmpty()) {
            System.out.println("No existen Productos ingresados...");
        }
    }

    public void leerProducto() {
        System.out.println();
        System.out.println("----------------------Lista de productos---------------------");
        if (this.productosStock != null) {
            for (int i = 0; i < this.productosStock.size(); i++) {
                System.out.println(i + "." + this.productosStock.get(i));
            }
        }
        System.out.println("-------------------------------------------------------------");
        System.out.println();
    }

    public void actualizarProducto() {
        Scanner leer = new Scanner(System.in);

        System.out.println("porfavor ingrese el numero del producto desea actualizar");
        int value = leer.nextInt();
        leer.nextLine();

        if (this.productosStock.get(value) instanceof Libro) {
            System.out.println("Ingrese el titulo");
            String titulo = leer.nextLine();
            System.out.println("Ingrese el autor");
            String autor = leer.nextLine();
            Libro libro = new Libro(titulo, autor);
            this.productosStock.set(value, libro);
        }

        if (this.productosStock.get(value) instanceof Resaltadores) {
            System.out.println("Ingrese el Color");
            String color = leer.nextLine();
            System.out.println("Ingrese la marca");
            String marca = leer.nextLine();

            Resaltadores resaltadores = new Resaltadores(color, marca);
            this.productosStock.set(value, resaltadores);
        }
    }

    public void eliminarProducto(int value) {
        if (this.productosStock != null) {
            this.productosStock.remove(value);
        }
    }

    //getter and setter
    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public ArrayList<Iproductos> getProductosStock() {
        return productosStock;
    }

    public void setProductosStock(ArrayList<Iproductos> productosStock) {
        this.productosStock = productosStock;
    }
}
