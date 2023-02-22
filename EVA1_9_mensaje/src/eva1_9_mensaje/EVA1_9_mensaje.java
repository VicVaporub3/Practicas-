/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_9_mensaje;

/**
 *
 * @author victorgrc723
 */
public class EVA1_9_mensaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        nPrintln("Hola", 5);//llamada a funcion
    }
    public static void nPrintln(String message, int num){
        for (int i = 0; i < num; i++) {
            System.out.println(message);
            
        }
    }
    
}
