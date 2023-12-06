package com.esteban.marketfinalproyectpoo;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

public class MarketFinalProyectPOO {

    public static void main(String[] args) {
        //se utiliza para leer los datos ingresados por el usuario
        Scanner leer = new Scanner(System.in);

        //atributos
        int menu = 0;
        ArrayList<Iproductos> productos = new ArrayList<>();
        ArrayList<Compra> ventas = new ArrayList<>();
        ArrayList<Cliente> clientes = new ArrayList<>();

        //agregar el vendedor
        Vendedor vendedor = new Vendedor();
        generarVendedor(vendedor);
        Stock stock = new Stock();

        //relacionar vededor con stock
        vendedor.setStock(stock);
        stock.setVendedor(vendedor);

        do {
            //crear opciones a mostrar al usuario
            System.out.println("***************MENU PRINCIPAL***********************");
            System.out.println("1.Venta");
            System.out.println("2.Cliente");
            System.out.println("3.Stock");
            System.out.println("4.Agregar productos");
            System.out.println("5.Salir del menu");
            System.out.println("****************************************************");

            //se llama a la variable menu para que el usuario seleccione a que opcion desea ingresar
            menu = leer.nextInt();

            //dependiendo la opcion se efectuara una opcion del swift case
            switch (menu) {
                case 1:
                    //validar si existen productos en stock, clientes y vendedor
                    Boolean validar = validarVenta(stock, vendedor, clientes);

                    //si exiten entonces se podra crear venta, de lo contrario mostrara mensaje
                    if (validar == true) {
                        menuVenta(clientes, ventas, stock);
                    }
                    break;
                case 2:
                    menuCliente(clientes);
                    break;
                case 3:
                    menuStock(productos, stock);
                    break;
                case 4:
                    menuProductos(productos);
                    stock.adicionarAlStock(productos);
                    break;
                case 5:
                    break;
                default:
                    //Excepcion
                    throw new AssertionError("solo puedes seleccionar entre 1 y 4 dado que no hay mas opciones!");
            }

        } while (menu != 5);
    }

    public static Boolean validarVenta(Stock stock, Vendedor vendedor, ArrayList<Cliente> clientes) {

        if (stock.productosStock == null && clientes.isEmpty()) {
            System.out.println("No se puede crear una venta dado que no exiten elementos en stock, tampoco clientes");
            return false;
        }

        if (stock.productosStock == null) {
            System.out.println("No se puede crear una venta dado que no exiten elementos en stock");
            return false;
        }

        if (clientes.isEmpty()) {
            System.out.println("No se puede crear una venta dado que no exiten Clientes");
            return false;
        }

        return true;
    }

    public static void generarVendedor(Vendedor vendedor) {
        Scanner leer = new Scanner(System.in);

        //atributos
        int opcion = 0;
        String nombre;
        int id;
        int celular;

        System.out.println();
        System.out.println("_____________________Vendedor_________________________");

        //pregunstas por mostrar
        System.out.println("1. ¿Deseas ingresar solo por identificacion?");
        System.out.println("2. ¿Deseas ingresar con datos completos?");

        opcion = leer.nextInt();
        leer.nextLine();

        switch (opcion) {
            case 1:
                System.out.println("Ingrese el numero de cedula del vendedor");
                id = leer.nextInt();
                leer.nextLine();
                vendedor.setId(id);
                break;
            case 2:
                System.out.println("Ingrese el nombre del vendedor");
                nombre = leer.nextLine();
                vendedor.setNombre(nombre);

                System.out.println("Ingrese el numero de celular del vendedor");
                celular = leer.nextInt();
                vendedor.setCelular(celular);

                System.out.println("Ingrese el numero de cedula del vendedor");
                id = leer.nextInt();
                vendedor.setId(id);
                break;
        }

        vendedor.registrar();
        System.out.println("_____________________________________________________");
        System.out.println();
    }

    //Todo lo de stock
    private static void menuStock(ArrayList<Iproductos> productos, Stock stock) {
        Scanner leer = new Scanner(System.in);
        int menu = 0;

        do {
            System.out.println("***************MENU STOCK***********************");
            System.out.println("1.ver los productos del stock");
            System.out.println("2.Actualizar un producto del stock");
            System.out.println("3.Eliminar un producto del stock");
            System.out.println("4.Salir del menu");
            System.out.println("*************************************************");
            menu = leer.nextInt();

            //se accede a metodos del stock
            switch (menu) {
                case 1:
                    //ver productos
                    stock.leerProducto();
                    break;
                case 2:
                    //actualizar
                    stock.actualizarProducto();
                    break;
                case 3:
                    //eliminar
                    System.out.println("Ingrese el numero del producto a eliminar");
                    int value = leer.nextInt();
                    stock.eliminarProducto(value);
                    break;
                case 4:
                    break;
            }
        } while (menu != 4);
    }

    //todo lo de productos
    private static void menuProductos(ArrayList<Iproductos> productos) {
        Scanner leer = new Scanner(System.in);
        int menu = 0;

        do {
            System.out.println("***************MENU STOCK***********************");
            System.out.println("1.Agregar Libro");
            System.out.println("2.Agreegar Resaltador");
            System.out.println("3.Volver al menu principal");
            System.out.println("*************************************************");
            menu = leer.nextInt();

            switch (menu) {
                case 1:
                    //se accede a metodo libro para crear el libro
                    libros(productos);
                    break;
                case 2:
                    //se accede a metodo resaltadores para crear el restador
                    resaltadores(productos);
                    break;
            }
        } while (menu != 3);
    }

    //metodo encargado de crear libros
    private static void libros(ArrayList<Iproductos> productos) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el titulo");
        String titulo = leer.nextLine();
        System.out.println("Ingrese el autor");
        String autor = leer.nextLine();

        //se crea objeto
        Libro libro = new Libro(titulo, autor);

        //se añade el objeto libro en la lista de productos
        productos.add(libro);
    }

    //metodo encargado de crear resaltadores
    private static void resaltadores(ArrayList<Iproductos> productos) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el Color");
        String color = leer.nextLine();
        System.out.println("Ingrese la marca");
        String marca = leer.nextLine();

        //se crea el objeto y se pasan parametros
        Resaltadores resaltadores = new Resaltadores(color, marca);

        //se añade el nuevo resaltador en la lista de productos
        productos.add(resaltadores);
    }

    //Menu clientes
    private static void menuCliente(ArrayList<Cliente> clientes) {
        Scanner leer = new Scanner(System.in);
        int menu = 0;

        do {
            System.out.println("***************MENU CLIENTES***********************");
            System.out.println("1.Agregar clientes");
            System.out.println("2.ver Lista de clientes");
            System.out.println("3.Regresar al menu principal");
            System.out.println("***************************************************");

            menu = leer.nextInt();
            leer.nextLine();

            switch (menu) {
                case 1:
                    //se accede a metodo agregar clientes
                    AgregarCliente(clientes);
                    break;
                case 2:
                    //se accede a metodo mostrar clientes
                    mostrarClientes(clientes);
                    break;
                case 3:
                    break;
                default:
                    throw new AssertionError();
            }
        } while (menu != 3);
    }

    public static void AgregarCliente(ArrayList<Cliente> clientes) {
        Scanner leer = new Scanner(System.in);

        //atributos
        int opcion = 0;
        String nombre;
        int id;
        int celular;

        // se crea objeto cliente para pasar parametros mas adelante
        Cliente cliente = new Cliente();

        //selecciones
        System.out.println("1. ¿Deseas ingresar solo por identificacion?");
        System.out.println("2. ¿Deseas ingresar con datos completos?");

        opcion = leer.nextInt();
        leer.nextLine();

        switch (opcion) {
            case 1:
                //se crea objeto solo con id
                System.out.println("Ingrese el numero de cedula del cliente");
                id = leer.nextInt();
                cliente.setId(id);
                break;
            case 2:
                //se crea cliente con todos sus parametros
                System.out.println("Ingrese el nombre del cliente");
                nombre = leer.nextLine();
                cliente.setNombre(nombre);

                System.out.println("Ingrese el numero de celular del cliente");
                celular = leer.nextInt();
                cliente.setCelular(celular);

                System.out.println("Ingrese el numero de cedula del cliente");
                id = leer.nextInt();
                cliente.setId(id);
                break;
        }

        //se añade el nuevo cliente a la lista de los clientes
        clientes.add(cliente);
    }

    public static void mostrarClientes(ArrayList<Cliente> clientes) {
        System.out.println();
        System.out.println("************LISTA DE CLIENTES**********************");

        //validacion por si la lista esta vacia
        if (clientes.isEmpty()) {
            System.out.println("No existen clientes ingresados...");
        }

        //se itera sobre la libra de clientes para mostrar su informacion
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(i + "." + clientes.get(i).imprimirInformacion());
        }

        System.out.println("***************************************************");
        System.out.println();
    }

    //Todo lo de venta
    private static void menuVenta(ArrayList<Cliente> clientes, ArrayList<Compra> ventas, Stock stock) {
        Scanner leer = new Scanner(System.in);
        int menu = 0;

        do {
            //crear opciones a mostrar al usuario
            System.out.println("***************MENU VENTAS***********************");
            System.out.println("1.Crear venta");
            System.out.println("2.Historial de Ventas");
            System.out.println("3.Salir del menu");
            System.out.println("****************************************************");

            //se llama a la variable menu para que el usuario seleccione a que opcion desea ingresar
            menu = leer.nextInt();

            switch (menu) {
                case 1:
                    //se envia a nuevo metodo donde se realizara el proceso de creacion de venta
                    AgregarVenta(clientes, ventas, stock);
                    break;
                case 2:
                    //se itera sobre la listas de ventas para mostrarlas
                    for (int i = 0; i < ventas.size(); i++) {
                        System.out.println(i + "." + ventas.get(i).toString());
                    }
                    break;
                case 3:
                    break;
                default:
                    throw new AssertionError("error solo de puede seleccionar de 1 a 3 en el menu de ventas");
            }

        } while (menu != 3);
    }

    private static void AgregarVenta(ArrayList<Cliente> clientes, ArrayList<Compra> ventas, Stock stock) {
        Scanner leer = new Scanner(System.in);

        //atributos
        ArrayList<Iproductos> productosVender = new ArrayList<>();

        int optiones = 0;

        do {
            System.out.println("********************VENTA*****************");
            System.out.println("1.seleccionar producto");
            System.out.println("2.terminar venta");
            System.out.println("******************************************");

            System.out.println("Ingrese la opcion a seleccionar");
            optiones = leer.nextInt();

            switch (optiones) {
                case 1:
                    stock.leerProducto();
                    System.out.println("Ingrese el numero en posicion del producto en stock");
                    int numStock = leer.nextInt();

                    //se agrega el producto del stock a la lista de los productos que compran 
                    productosVender.add(stock.getProductosStock().get(numStock));

                    //se elimina el producto del stock dado que se ha vendido
                    stock.eliminarProducto(numStock);
                    break;
                case 2:
                    break;
            }

        } while (optiones != 2);

        //se muestran los clientes nuevamente para que sea mas facil saber cual escoger
        mostrarClientes(clientes);

        System.out.println("Ingrese el indice del cliente");
        int idcl = leer.nextInt();

        //se valida en la lista de clientes que exista el indice
        if (clientes.get(idcl) != null) {
            //si existe se crea la venta y se agrega a la lista
            Date date = new Date();
            Compra venta = new Compra(productosVender, clientes.get(idcl), date);
            ventas.add(venta);
        } else {
            //si no existe lanza alerta
            System.out.println("error cliente no existente");
        }
    }
}
