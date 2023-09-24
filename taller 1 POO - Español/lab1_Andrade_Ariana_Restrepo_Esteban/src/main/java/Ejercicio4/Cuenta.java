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

    }

    public void Retirar(double cantidad) {

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
