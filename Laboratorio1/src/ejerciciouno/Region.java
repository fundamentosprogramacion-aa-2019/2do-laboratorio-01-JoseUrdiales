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
public class Region {

    private String nombre;
    
    public Region (String n){
        establecerNombre(n);
    }
    public void establecerNombre(String n) {
        nombre = n;
    }

    public String obtenerNombre() {
        return nombre;
    }
}
