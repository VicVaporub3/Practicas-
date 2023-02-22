/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_6_automovil;

/**
 *
 * @author victorgrc723
 */
public class EVA1_6_AUTOMOVIL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Automovil auto1 = new Automovil();
        auto1.setDueño("Victor Granados");
        auto1.setPlacas("ERL3505");
        auto1.setMarca("NISSAN");
        auto1.setmodelo("Altima");
        auto1.setAño(2002);
        auto1.calcularRev();
        auto1.imprimirDatos();
        

       

    }
    
}
