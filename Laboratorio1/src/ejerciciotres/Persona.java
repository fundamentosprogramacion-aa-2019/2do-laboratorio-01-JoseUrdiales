/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotres;

/**
 *
 * @author Jose Luis
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    
    //Constructor
    public Persona(String n, String a, int e){
        establecerNombre(n);
        establecerApellido(a);
        establecerEdad(e);
    }
    
    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerApellido(String a) {
        this.apellido = a;
    }

    public void establecerEdad(int e) {
        edad = e;
    }
        
    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public int obtenerEdad() {
        return edad;
    }
 
    @Override
    public String toString(){
        String cadena = String.format("Persona: \n\t"
                + "Nombre: %s\n\t"
                + "Apellido: %s\n\t"
                + "Edad: %s\n\t",
               obtenerNombre(), 
               obtenerApellido(),
               obtenerEdad());
        
        return cadena;
   }
    
}
