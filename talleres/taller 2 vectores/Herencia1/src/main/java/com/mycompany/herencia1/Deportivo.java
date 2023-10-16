/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia1;

/**
 *
 * @author Unicomfacauca
 */
public class Deportivo extends Auto{
    protected int potenciaMotor;
    protected int velocidadActual;

    public int getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public Deportivo(int potenciaMotor, int numPuertas, String tipoCombustible, String marca, String modelo, String color, int velocidadMaxima, int velocidadActual) {
        super(numPuertas, tipoCombustible, marca, modelo, color, velocidadMaxima, velocidadActual);
        this.potenciaMotor = potenciaMotor;
    }
     @Override
    public int acelerar() {
        return this.velocidadActual += 30;
    }
    
    @Override
    public int frenar() {
        return this.velocidadActual -= 20;
    }
}
