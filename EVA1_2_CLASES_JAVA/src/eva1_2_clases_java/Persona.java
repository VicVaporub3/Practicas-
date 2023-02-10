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
public class Persona {
    //DATOS --> ATRIBUTOS DE LA CLASE
    private String nombre;
    private String apellido;
    private int edad;
    private char genero;
    //METODOS --> COMPORTAMIENTO DE LA CLASE
    //LEER Y ESCRIBIR LOS ATRIBUTOS DE LA CLASE 
    //LEER --> GET
    //ESCRIBIR --> SET
    //modificador de acceso valor de retorno nombre del metodo (argumentos) (implementacion)
    public String getNombre(){//GET
       return nombre; 
        
    }
    public void setNombre(String valor){//SET
        nombre = valor;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int valor){
        edad = valor;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String valor){
        apellido = valor;
    }
    public char getGenero(){
        return genero;
    }
    public void setGenero(char valor){
        genero = valor;
    }
    public void imprimirDatos(){
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Genero: " + genero);
        if (genero == 'H'){
            System.out.println("Hombre");
        }else if(genero == 'M'){
            System.out.println("Mujer");
        }else if(genero == 'L'){
            System.out.println("Lesbiana");
        }else{
            System.out.println("Genero no registrado");
        }
    }
}

