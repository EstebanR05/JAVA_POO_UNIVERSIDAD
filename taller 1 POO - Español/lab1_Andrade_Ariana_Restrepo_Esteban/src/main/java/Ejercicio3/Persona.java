package Ejercicio3;

public class Persona {

    private String nombre;
    private String apellido;
    private int identificacion;
    private char sexo;

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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Boolean esMayorDeEdad() {
        return true;
    }

    public String estado() {
        return "Persona" + "nombre= " + nombre + ", apellido= " + apellido + ", identificacion= " + identificacion + ", sexo= " + sexo;
    }

    public Persona() {
        this.nombre = "";
        this.apellido = "";
        this.identificacion = 0;
        this.sexo = 'H';
    }

    public Persona(String nombre, String apellido, int identificacion, char sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.sexo = sexo;
    }

    public Persona(Persona persona) {
        this.nombre = persona.nombre;
        this.apellido = persona.apellido;
        this.identificacion = persona.identificacion;
        this.sexo = persona.sexo;
    }
}
