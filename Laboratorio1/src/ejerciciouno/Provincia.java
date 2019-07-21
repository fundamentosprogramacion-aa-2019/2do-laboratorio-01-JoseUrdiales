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
public class Provincia {
    private String nombre;
    private Region region;
    
    public Provincia (String n,  Region p){
        establecerNombre(n);        
        establecerRegion(p);
    }
    public void establecerNombre(String n){
        nombre = n;
    }
    public void establecerRegion(Region g){
        region = g;
    }
     
    public String obtenerNombre(){
        return nombre;
    }
    public Region obtenerRegion(){
        return region;
    }
}
