/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andrade_ariana_restrepo_emanuel.lab1._andrade.ariana.restrepo.emanuel;

/**
 *
 * @author e0507
 */
public class Persona_ {

    private String nombre;
    private int edad;
    private int dni;
    private char sexo;
    private double peso;
    private double altura;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Persona_() {
        this.nombre = "";
        this.edad = 0;
        this.sexo = 'H';
        this.dni = 0;
        this.peso = 0;
        this.altura = 0;
    }

    public Persona_(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.dni = 0;
        this.peso = 0;
        this.altura = 0;
    }

    public Persona_(String nombre, int edad, char sexo, int dni, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
    }

    public boolean esMayorDeEdad() {
        if (this.edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public void comprobarSexo(char sexo) {
        if (sexo != 'M' || sexo != 'H') {
            this.sexo = 'H';
        }
    }

    @Override
    public String toString() {
        return "Persona_" + "nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }

    public double calcularIMC() {
        return this.peso / (this.altura * this.altura);
    }

    public int generaDNI() {
        return 0;
    }
}
