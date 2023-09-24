package Ejercicio3;

public class Ejercicio3 {

    public static void mostrarEjercicio3() {
        System.out.println("**************************ejercicio 3**********************************");

        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Esteban", "Restrepo", 1111479211, 'H');
        Persona persona3 = new Persona(persona2);        
        
        //set atributos
        persona3.setNombre("Ariana");
        persona3.setApellido("Andrade");
        persona3.setIdentificacion(0);
        persona3.setSexo('M');
     
        //mostrar estado de las personas
        System.out.println("El estado de la persona 1 " + persona1.estado());
        System.out.println("El estado de la persona 2 " + persona2.estado());
        System.out.println("El estado de la persona 3 " + persona3.estado());
        
        //mostrar Si es mayor edad
        System.out.println("persona 1 " + persona1.esMayorDeEdad());
        System.out.println("persona 2 " + persona2.esMayorDeEdad());
        System.out.println("persona 3 " + persona3.esMayorDeEdad());
        
        System.out.println("***********************************************************************");
        System.out.println();
    }

}
