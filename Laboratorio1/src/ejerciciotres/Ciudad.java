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
public class Ciudad {
    private String nombre;
    private String provincia;
    
    //Constructor
    public Ciudad(String n, String p){
        establecerNombre(n);
        establecerProvincia(p);
        
    }
    
    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerProvincia(String p) {
        provincia = p;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerProvincia() {
        return provincia;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Persona: \n\tNombre: %s\n\t"
                + "Provincia: %s\n\t",
               obtenerNombre(), 
               obtenerProvincia());     
        return cadena;
   }
        
}
