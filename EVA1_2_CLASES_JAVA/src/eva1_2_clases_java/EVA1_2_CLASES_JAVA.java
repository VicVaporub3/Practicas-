/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_2_clases_java;

/**
 *
 * @author victorgrc723
 */
public class EVA1_2_CLASES_JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//CREAR UN OBJETO
//INSTANCIACION 
//INSTANCIAR --> DAR MEMORIA RAM
//NOMBRE DE LA CLASE IDENTFICADOR = new CONSTRUCTOR DE LA CLASE;
Persona perso1 = new Persona();//Persona() es el constructor 
/*perso1.nombre = "Victor";
perso1.apellido = "Granados";
System.out.println(perso1.nombre + " " + perso1.apellido);*/
perso1.setNombre("Diego");
perso1.setApellido("Saenz");
perso1.setEdad(15);
perso1.setGenero('H');//'' caracter
/*System.out.println(perso1.getNombre());
System.out.println(perso1.getApellido());
System.out.println(perso1.getEdad());
System.out.println(perso1.getGenero());*/
perso1.imprimirDatos();
//----             //CONSTRUCTOR
Persona perso2 =new Persona();
perso2.setNombre("Victor");
perso2.setApellido("Granados");
perso2.setEdad(19);
perso2.setGenero('H');
perso2.imprimirDatos();



    }
    
}
