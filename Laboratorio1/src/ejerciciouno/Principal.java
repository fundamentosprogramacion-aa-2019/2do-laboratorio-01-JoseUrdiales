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
public class Principal {

    public static void main(String[] args) {
        // Regiones
        Region region1 = new Region("Costa");
        Region region2 = new Region("Sierra");
        Region region3 = new Region("Oriente");
        // Provincia
        Provincia p1 = new Provincia("Pichincha", region2);
        Provincia p2 = new Provincia("Guayas", region1);
        Provincia p3 = new Provincia("El Oro", region1);
        Provincia p4 = new Provincia("Morona Santiago", region3);
        Provincia p5 = new Provincia("Esmeraldas", region1);
        Provincia p6 = new Provincia("Loja", region2);
        Provincia p7 = new Provincia("Santo Domingo de los Tsáchilas", region2);
        Provincia p8 = new Provincia("Pastaza", region3);
        Provincia p9 = new Provincia("Cotopaxi", region2);
        Provincia p10 = new Provincia("Cañar", region2);
        // Ciudad
        Ciudad c1 = new Ciudad("Guayaquil", 2291000, p2);
        Ciudad c2 = new Ciudad("Azogues", 225184, p10);
        Ciudad c3 = new Ciudad("Latacunga", 458581, p9);
        Ciudad c4 = new Ciudad("Quito", 1619000, p1);
        Ciudad c5 = new Ciudad("Loja", 180617, p6);
        /* Creamos el arreglo para hacer las operaciones e 
         * imprimir lo pide el ejercicio.
         */
        Ciudad[] ciudades = new Ciudad[5];
        ciudades[0] = c1;
        ciudades[1] = c2;
        ciudades[2] = c3;
        ciudades[3] = c4;
        ciudades[4] = c5;
        for (int i = 0; i < ciudades.length; i++) {
            System.out.printf("%s\n", ciudades[i]);
        }
        int suma = 0;
        for (int i = 0; i < ciudades.length; i++) {
            suma = ciudades[i].obtenerPoblacion() + suma;
        }
        double promedioPoblacion;
        promedioPoblacion = suma / ciudades.length;
        System.out.printf("------------------------------"
                + "-----------------------\n"
                + "La suma de las poblaciones es: %.2f\n", promedioPoblacion);
    }
}