/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciouno;

/**
 *
 * @author Jose Luis
 */
public class Ciudad {
    private String nombre;
    private int poblacion;
    private Provincia provincia;
    
    public Ciudad (String n, int po, Provincia pr){
        establecerNombre(n);
        establecerPoblacion(po);
        establecerProvincia(pr);
    }
    public void establecerNombre(String m){
        nombre = m;
    }
    public void establecerPoblacion(int p){
        poblacion = p;
    }
    public void establecerProvincia(Provincia pr){
        provincia = pr;
    }
    
    
    
    public String obtenerNombre(){
        return nombre;
    }
    public int obtenerPoblacion(){
        return poblacion;
    }
    public Provincia obtenerProvincia(){
        return provincia;
    }
    public String toString(){
        String cadena = String.format("-------------------------"
                + "---------------------------\n"
                + "CIUDAD:\n\t"
                + "-Nombre: %s\n\t"
                + "-Población: %d\n\t"
                + "-Provincia:%s", obtenerNombre(), 
                obtenerPoblacion(), 
                obtenerProvincia().obtenerNombre());        
        return cadena;
    }
}