package Ejercicio4;

public class Cuenta {

    private String titular;
    private double cantidad;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Cuenta " + "titular= " + this.titular + ", cantidad= " + this.cantidad;
    }

    public void Consignar(double cantidad) {
        if (this.cantidad >= 0 && cantidad > 0) {
            this.cantidad += cantidad;
        }
    }

    public String Retirar(double cantidad) {
        if ((this.cantidad - cantidad) < 0) {
            this.cantidad = 0;
            return "la resta de la cantidad no puede ser negativa, ahora su cantidad pasara a estar en 0";
        } else {
            this.cantidad -= cantidad;
            return "la cantidad de dinero a entregar es: " + cantidad + " Su cuenta queda con una cantidad de: " + this.cantidad;
        }
    }

    public Cuenta() {
        this.titular = "";
        this.cantidad = 0;
    }

    public Cuenta(String titular, int cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public Cuenta(Cuenta cuenta) {
        this.titular = cuenta.titular;
        this.cantidad = cuenta.cantidad;
    }
}
