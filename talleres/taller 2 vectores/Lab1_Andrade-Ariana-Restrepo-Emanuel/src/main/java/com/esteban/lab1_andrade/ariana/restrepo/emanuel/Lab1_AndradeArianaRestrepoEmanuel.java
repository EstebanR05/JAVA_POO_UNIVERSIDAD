package com.esteban.lab1_andrade.ariana.restrepo.emanuel;

public class Lab1_AndradeArianaRestrepoEmanuel {

    public static void main(String[] args) {

        //vector de vehiculos
        Vehiculo[] vehiculos = new Vehiculo[3];

        //objetos
        Vehiculo vehiculo = new Vehiculo("toyota", "1999", "rojo", 120, 20);
        Auto auto = new Auto(3, "corriente", "nissan", "2003", "negro", 200, 30);
        Deportivo deportivo = new Deportivo(500, 3, "extra", "porche", "2023", "blanco", 300, 20);

        for (int i = 0; i < 3; i++) {
            //acelerar
            vehiculo.acelerar();
            auto.acelerar();
            deportivo.acelerar();

            //frenar
            vehiculo.frenar();
            auto.frenar();
            deportivo.frenar();
        }

        //añadir cada uno de los objetos al vector
        vehiculos[0] = vehiculo;
        vehiculos[1] = auto;
        vehiculos[2] = deportivo;

        //se muestra el estado
        imprimirInformacionVehiculos(vehiculos);

        //calcular el promedio de los vehiculos
        calcularVelocidadPromedio(vehiculos);
    }

    public static void imprimirInformacionVehiculos(Vehiculo[] vehiculos) {
        for (int i = 0; i < vehiculos.length; i++) {
            System.out.println("El estado " + (i + 1) + " es: " + vehiculos[i].toString());
        }
    }

    public static void calcularVelocidadPromedio(Vehiculo[] vehiculos) {
        int velocidadPromedio = 0;

        for (int i = 0; i < 3; i++) {
            velocidadPromedio += vehiculos[i].getVelocidadActual();
        }

        System.out.println("La velocidad promedio es: " + velocidadPromedio);
    }
}
