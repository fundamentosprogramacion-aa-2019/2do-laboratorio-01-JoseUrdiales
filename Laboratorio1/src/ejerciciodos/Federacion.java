/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodos;

/**
 *
 * @author Jose Luis
 */
public class Federacion {
    private String nombre;
    private Confederacion confederacion;
    private String deporte;
    
    public Federacion(String n, Confederacion conf, String dep){
        establecerNombre(n);
        establecerConfederacion(conf);
        establecerDeporte(dep);
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }        
    public void establecerConfederacion(Confederacion conf){
        confederacion = conf;
    }
    public void establecerDeporte(String dep){
        deporte = dep;
    }
     
     
    public Confederacion obtenerConfederacion(){
        return confederacion;
    }
    public String obtenerNombre(){
        return nombre;
    }
    public String obtenerDeporte(){
        return deporte;
    }
}
