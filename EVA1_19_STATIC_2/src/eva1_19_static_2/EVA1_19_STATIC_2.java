/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_19_static_2;

/**
 *
 * @author victorgrc723
 */
public class EVA1_19_STATIC_2 {
    int v = 7;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("v");
        //mensajeNoEstatico();
        EVA1_19_STATIC_2 obj = new EVA1_19_STATIC_2();
        System.out.println(obj.v);
        obj.mensajeNoEstatico();
        mensajeEstatico();
    }
    
    public void mensajeNoEstatico(){//NO EXISTE 
        System.out.println("MENSAJE NO ESTATICO");
    }
     public static void mensajeEstatico(){//EXISTE AL INICIAR EL PROGRAMA 
        System.out.println("MENSAJE NO ESTATICO");
    }
}
