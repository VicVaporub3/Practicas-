/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_3_constructores;

/**
 *
 * @author victorgrc723
 */
public class EVA1_3_CONSTRUCTORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CLASE IDENTIFICADOR = new CONSTRUCTOR();
        CuentaBancaria cuenta1 = new CuentaBancaria("10000", 2000, "Carlos Slim");
        System.out.println("DATOS DEL CLIENTE");
        System.out.println(cuenta1.getNomCliente());
        System.out.println(cuenta1.getSaldo());
        System.out.println(cuenta1.getNoCuenta());
        
        CuentaBancaria cuenta2 = new CuentaBancaria();
        System.out.println("DATOS DEL CLIENTE");
        System.out.println(cuenta2.getNomCliente());
        System.out.println(cuenta2.getSaldo());
        System.out.println(cuenta2.getNoCuenta());
        
        CuentaBancaria cuenta3 = new CuentaBancaria("200", 50, "Victor Granados");
        System.out.println("DATOS DEL CLIENTE");
        System.out.println(cuenta3.getNomCliente());
        System.out.println(cuenta3.getSaldo());
        System.out.println(cuenta3.getNoCuenta());
        
    }
    
}
