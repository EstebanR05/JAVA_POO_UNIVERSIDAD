package com.andrade_ariana_restrepo_emanuel.lab1._andrade.ariana.restrepo.emanuel;

public class Persona {

    private String nombre;
    private String apellido;
    private int identificacion;
    private String sexo;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Constructor por defecto 
    public Persona() {
        nombre = "";
        apellido = "";
        identificacion = 0;
        sexo = "";
        edad = 0;
    }

    //Constructor por parametro
    public Persona(String nombre, String apellido, int identificacion, String sexo, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.sexo = sexo;
        this.edad = edad;
    }

    //Constructor por copia
    public Persona(Persona persona) {
        this.nombre = persona.nombre;
        this.apellido = persona.apellido;
        this.identificacion = persona.identificacion;
        this.sexo = persona.sexo;
        this.edad = persona.edad;
    }

    //Metodo que retorna una cadena de caracteres
    public String estado() {
        return "nombre=" + nombre + ", apellido=" + apellido + ", identificacion=" + identificacion + ", sexo=" + sexo + " con edad: " + this.edad;
    }

    //metodo para definir si es mayor de edad
    public Boolean esMayorDeEdad() {
        if (this.edad >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
