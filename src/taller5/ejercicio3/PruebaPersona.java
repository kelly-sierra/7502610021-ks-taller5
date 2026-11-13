
package taller5.ejercicio3;

public class PruebaPersona {

    public static void main(String[] args) {

        Persona persona = new Persona("Kelly", 67);

        // Acceso mediante métodos get y set
        System.out.println("Nombre: " + persona.getNombre());

        persona.setNombre("Kelly Sierra");

        System.out.println("Nuevo nombre: " + persona.getNombre());

        // Acceso directo al atributo default
        System.out.println("Edad: " + persona.edad);

        // Esta instrucción genera un error:
        // System.out.println(persona.nombre);
    }
}