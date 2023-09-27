package com.andrade_ariana_restrepo_emanuel.lab1._andrade.ariana.restrepo.emanuel;

public class Estudiante {

    private double nota1;
    private double nota2;
    private double nota3;
    private String nombre;
    private int edad;

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double notaFinal() {
        double porcentajeDosNotas = ((nota1 + nota2) / 2) * 0.7;
        double porcentajeTerceraNota = this.nota3 * 0.3;
        double sumaTotal = porcentajeDosNotas + porcentajeTerceraNota;
        return sumaTotal;
    }

    public String estado() {
        return "su nota 1: " + this.nota1 + " nota 2: " + this.nota2 + " nota 3: " + this.nota3 + " del estudiante: " + this.nombre + " con edad: " + this.edad;
    }

    public Estudiante() {
        this.nota1 = 0;
        this.nota2 = 0;
        this.nota3 = 0;
        this.nombre = "";
        this.edad = 0;
    }

    public Estudiante(double nota1, double nota2, double nota3, String nombre, int edad) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Estudiante(Estudiante estudiante) {
        this.nota1 = estudiante.nota1;
        this.nota2 = estudiante.nota2;
        this.nota3 = estudiante.nota3;
        this.nombre = estudiante.nombre;
        this.edad = estudiante.edad;
    }
}
