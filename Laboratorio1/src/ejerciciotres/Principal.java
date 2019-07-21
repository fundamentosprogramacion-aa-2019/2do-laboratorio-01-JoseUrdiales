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
public class Principal {
    public static void main(String[] args){
        
        //Personas
        
        Persona persona1 = new Persona("Jorge", "Bailon", 54);
        Persona persona2 = new Persona("Patricia", "Lopez", 35);
        Persona persona3 = new Persona("Robert", "Blacio", 36);
        Persona persona4 = new Persona("Maximo", "Quizhpe", 38);
        Persona persona5 = new Persona("Karla", "Gonzalez", 41);
        Persona persona6 = new Persona("Marco", "Leon", 29);
        Persona persona7 = new Persona("Andrea", "Bustamante", 30);
        Persona persona8 = new Persona("Mercy ", "Guerrero", 44);   
        
        //Ciudades
        
        Ciudad ciudades1 = new Ciudad("Loja", "Loja");
        Ciudad ciudades2 = new Ciudad("Quito", "Pichincha");
        Ciudad ciudades3 = new Ciudad("Guayaquil", "Guayas");
        
        //Municipios
        
        Municipio municipio1 = new Municipio("Loja", ciudades1);
        Municipio municipio2 = new Municipio("Catamayo", ciudades1);
        Municipio municipio3 = new Municipio("Cumbaya", ciudades2);
        Municipio municipio4 = new Municipio("Urdesa", ciudades3);
        
        //Areas Municipales
        
        AreaMunicipal am1 = new AreaMunicipal("Nivel Politico", 
                persona1, municipio1);
        AreaMunicipal am2 = new AreaMunicipal("Nivel Acesor", 
                persona2, municipio2);
        AreaMunicipal am3 = new AreaMunicipal("Nivel de Apoyo", 
                persona3, municipio3);
        AreaMunicipal am4 = new AreaMunicipal("Nivel Operativo", 
                persona4, municipio4);
        AreaMunicipal am5 = new AreaMunicipal("Dependencias Generales", 
                persona5, municipio4);
        
        //Departamentos municipales
        
        DepartamentoMunicipal dep1 = new DepartamentoMunicipal("Alcaldia",
                am1, 4000, persona1);
        DepartamentoMunicipal dep2 = new DepartamentoMunicipal("Alacaldia-"
                + "Secretaria",
                am1, 500, persona2);
        DepartamentoMunicipal dep3 = new DepartamentoMunicipal("Procuraduría "
                + "Síndica",
                am2, 800, persona3);
        DepartamentoMunicipal dep4 = new DepartamentoMunicipal("Dirección "
                + "Financiera",
                am3, 600, persona4);
        DepartamentoMunicipal dep5 = new DepartamentoMunicipal("Comisaría "
                + "de Higiene",
                am4, 400, persona5);
        DepartamentoMunicipal dep6 = new DepartamentoMunicipal("Comisaría "
                + "de Ornato",
                am4, 400, persona6);
        DepartamentoMunicipal dep7 = new DepartamentoMunicipal("Jefe "
                + "de Cultura",
                am4, 550, persona7);
        DepartamentoMunicipal dep8 = new DepartamentoMunicipal("Jefe "
                + "de Presupuesto",
                am5, 780, persona8);
        
        //Arreglo para emprimir las Ciudades
        
        DepartamentoMunicipal [] departMunicipales = 
                new DepartamentoMunicipal[8];
        departMunicipales[0] = dep1;
        departMunicipales[1] = dep2;
        departMunicipales[2] = dep3;
        departMunicipales[3] = dep4;
        departMunicipales[4] = dep5;
        departMunicipales[5] = dep6;
        departMunicipales[6] = dep7;
        departMunicipales[7] = dep8;
        
        for(int i = 0; i < departMunicipales.length; i++){
            System.out.printf("%s\n", departMunicipales[i]);
        }
        
        //Suma presupuestos
        
        double suma = 0;
        for (int i = 0; i < departMunicipales.length; i++) {           
            suma = suma + departMunicipales[i].obtenerPresupuesto();
        }
        System.out.printf("------------------------------------"
                + "----------------------------------\n"
                + "La suma de los presupuestos de los "
                + "departamentos municipales es: %.2f\n", suma);
        // Promedio edades
        double suma2 = 0;
        double promedioEdades;
        for (int i = 0; i < departMunicipales.length; i++) {           
            suma2 = (double)suma2 + 
                    departMunicipales[i].obtenerJefe().obtenerEdad();
        }
        promedioEdades = suma2 / departMunicipales.length;
        System.out.printf("------------------------------------"
                + "----------------------------------\n"
                + "El promedio de las edades es: %.2f\n", promedioEdades);
    }
    
}
