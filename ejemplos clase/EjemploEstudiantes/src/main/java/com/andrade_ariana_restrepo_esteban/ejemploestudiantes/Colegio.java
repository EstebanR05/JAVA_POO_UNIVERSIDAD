package com.andrade_ariana_restrepo_esteban.ejemploestudiantes;

public class Colegio {

    private String nombre;
    private long nit;
    private Estudiante estudiantes[];

    public Colegio(String nombre, long nit) {
        this.nombre = nombre;
        this.nit = nit;
        estudiantes = new Estudiante[10];
    }

    public void mostrarNombresEstudiantes() {
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("El nombre del estudiante " + i + " es: " + estudiantes[i].getNombre());
        }
    }

    public void registrarEstudiantes(Estudiante estudiante, int posicion) {
        estudiantes[posicion] = estudiante;
    }

    public void mostrarTodosLosEstudiantes() {

    }

    public void estudianteMayor() {

    }

    public void estudianteMenor() {

    }
}
