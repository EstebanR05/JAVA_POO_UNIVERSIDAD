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
    private String dni;
    private char sexo;
    private double peso;
    private double altura;

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

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
        this.dni = "";
        this.peso = 0;
        this.altura = 0;
    }

    public Persona_(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.dni = "";
        this.peso = 0;
        this.altura = 0;
    }

    public Persona_(String nombre, int edad, char sexo, String dni, double peso, double altura) {
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
        return "Persona" + " nombre= " + nombre + ", edad= " + edad + ", dni= " + dni + ", sexo= " + sexo + ", peso= " + peso + ", altura= " + altura;
    }

    public String calcularIMC() {
        double pesoActual = peso / (Math.pow(altura, 2));
      
        if (pesoActual >= 20 && pesoActual <= 25) {
            return "esta el peso ideal";
        } else if (pesoActual < 20) {
            return "esta por debajo del peso ideal";
        } else {
            return "la persona esta en sobrepeso";
        }
    }

    public void generarDni() {
        int divisor = 23;

        //Generamos un número de 8 digitos
        int generarDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
        int enviarDNI = generarDNI - (generarDNI / divisor * divisor);

        //generador de dni letra a letra
        char letra = generaLetraDNI(enviarDNI);

        //tomamos las letras y hacemos un string dni
        dni = Integer.toString(generarDNI) + letra;
    }

    private char generaLetraDNI(int DNI) {
        char generarLetras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
            'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
            'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        return generarLetras[DNI];
    }
}
